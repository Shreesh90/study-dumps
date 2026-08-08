package VendingMachine.VendingState.impl;

import VendingMachine.VendingMachine;
import VendingMachine.VendingState.State;
import VendingMachine.enums.Coin;
import VendingMachine.Item;

import java.util.List;

public class DispenseState implements State {

    public DispenseState(VendingMachine vendingMachine, int itemCode, int quantity) throws Exception {
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(vendingMachine, itemCode, quantity);
    }

    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not insert coin in Dispense State");
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        throw new Exception("you can not get change in Dispense State");
    }

    @Override
    public void UpdateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        throw new Exception("you can not update inventory in Dispense State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not refund money in Dispense State");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int itemCode, int quantity) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = vendingMachine.getInventory().getItem(itemCode, quantity, true);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return item;
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode, int quantity) throws Exception {
        throw new Exception("you can not choose product in Dispense State");
    }

    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not press select product in Dispense State");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert coin in Dispense State");
    }
}
