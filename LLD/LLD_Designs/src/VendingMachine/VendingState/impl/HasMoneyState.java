package VendingMachine.VendingState.impl;

import VendingMachine.VendingMachine;
import VendingMachine.VendingState.State;
import VendingMachine.enums.Coin;
import VendingMachine.Item;

import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState() {
        System.out.println("Currently Vending machine is in IdleState");
    }

    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public void UpdateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        throw new Exception("inventory cannot be updated in UpdateInventory state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoins();
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int itemCode, int quantity) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode, int quantity) throws Exception {
        throw new Exception("you cannot choose product in hasMoney state");

    }

    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new ItemSelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Accepted the coin");
        vendingMachine.getCoins().add(coin);
    }
}
