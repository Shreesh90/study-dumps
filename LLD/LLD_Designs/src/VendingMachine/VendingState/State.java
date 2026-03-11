package VendingMachine.VendingState;

import VendingMachine.VendingMachine;
import VendingMachine.enums.Coin;
import VendingMachine.Item;

import java.util.List;

public interface State {
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine, int productCode, int quantity) throws Exception;

    public int getChange(int changeMoney) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine, int itemCode, int quantity) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

    public void UpdateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception;

}
