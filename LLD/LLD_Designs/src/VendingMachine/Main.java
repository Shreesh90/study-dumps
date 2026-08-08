package VendingMachine;

import VendingMachine.VendingState.State;
import VendingMachine.enums.Coin;
import VendingMachine.enums.ItemType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.pressInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.NICKEL);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendingState.pressSelectProductButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 108, 10);

            displayInventory(vendingMachine);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        List<ItemStack> itemStacks = vendingMachine.getInventory().getInventoryItems();
        for(int i=0;i<itemStacks.size();i++) {
            Item item = new Item();
            switch (i) {
                case 0, 1, 2: {
                    item.setItemType(ItemType.COKE);
                    item.setPrice(32);
                    break;
                }
                case 3, 4, 5: {
                    item.setItemType(ItemType.JUICE);
                    item.setPrice(19);
                    break;
                }
                case 6, 7: {
                    item.setItemType(ItemType.PEPSI);
                    item.setPrice(9);
                    break;
                }
                case 8, 9 : {
                    item.setItemType(ItemType.BISCUIT);
                    item.setPrice(12);
                    break;
                }
            }
            itemStacks.get(i).setItem(item);
            itemStacks.get(i).setCurrentQuantity(10);
            itemStacks.get(i).setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine){

        List<ItemStack> itemStacks = vendingMachine.getInventory().getInventoryItems();
        for (int i = 0; i < itemStacks.size(); i++) {
            System.out.println("CodeNumber: " + itemStacks.get(i).getItemCode() +
                    " Item: " + itemStacks.get(i).getItem().getItemType().name() +
                    " Remaining Quantity: " + itemStacks.get(i).getCurrentQuantity() +
                    " Price: " + itemStacks.get(i).getItem().getPrice() +
                    " isAvailable: " + !itemStacks.get(i).isSoldOut());
        }
    }

}
