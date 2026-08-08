package VendingMachine.VendingState.impl;

import VendingMachine.VendingMachine;
import VendingMachine.VendingState.State;
import VendingMachine.enums.Coin;
import VendingMachine.Item;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoins(new ArrayList<>());
    }


    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        throw new Exception("you can not get change in Idle State");
    }

    @Override
    public void UpdateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        vendingMachine.getInventory().addItem(item, productCode, 1);
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not refund money in idle stae");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int itemCode, int quantity) throws Exception {
        throw new Exception("you can not dispense Product in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode, int quantity) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert coin in idle state");
    }
}
