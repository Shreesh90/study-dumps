package VendingMachine.VendingState.impl;

import VendingMachine.VendingMachine;
import VendingMachine.VendingState.State;
import VendingMachine.enums.Coin;
import VendingMachine.Item;

import java.util.List;

public class ItemSelectionState implements State {
    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        System.out.println("Returned the change in the Coin Dispense Tray: " + changeMoney);
        return changeMoney;
    }

    @Override
    public void UpdateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        throw new Exception("you cannot update inventory in ItemSelectionState");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Refunding the money");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoins();
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int itemCode, int quantity) {
        return null;
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode, int quantity) throws Exception {
        Item item = vendingMachine.getInventory().getItem(productCode, quantity, false);

        int totalMoneyPaid = 0;
        for(Coin coin: vendingMachine.getCoins()) totalMoneyPaid += coin.value;

        int totalItemCost = item.getPrice() * quantity;

        if(totalMoneyPaid < totalItemCost) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + totalMoneyPaid);
            refundFullMoney(vendingMachine);
            throw new Exception("insufficient amount");
        } else {
            int change = totalMoneyPaid - totalItemCost;
            if(change > 0) getChange(change);
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, productCode, quantity));
        }
    }

    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you cannot insert coin in ItemSelectionState");
    }
}
