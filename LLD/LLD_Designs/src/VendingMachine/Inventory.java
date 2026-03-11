package VendingMachine;

import VendingMachine.enums.Coin;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<ItemStack> inventoryItems;
    int totalItems;

    public Inventory(int numberOfItems) {
        inventoryItems = new ArrayList<>();
        totalItems = numberOfItems;
        initialiseEmptyInventory();
    }

    public List<ItemStack> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(List<ItemStack> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    void initialiseEmptyInventory() {
        int itemCode = 101;
        for(int i=0;i<totalItems;i++) {
            ItemStack itemStack = new ItemStack();
            itemStack.setItemCode(itemCode);
            itemStack.setCurrentQuantity(0);
            itemStack.setCapacity(10);
            itemStack.setSoldOut(true);
            inventoryItems.add(itemStack);
            itemCode++;
        }
    }

    public void addItem(Item item, int code, int quantity) throws Exception {
        for(ItemStack itemStack: inventoryItems) {
            if (itemStack.getItemCode() == code) {
                if (itemStack.getCurrentQuantity() + quantity <= itemStack.getCapacity()) {
                    itemStack.setItem(item);
                    int currQuantity = itemStack.getCurrentQuantity();
                    itemStack.setCurrentQuantity(currQuantity + quantity);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int code, int quantity, boolean updateItem) throws Exception {
        for(ItemStack itemStack: inventoryItems) {
            if (itemStack.getItemCode() == code) {
                if(itemStack.getCurrentQuantity() >= quantity) {
                    if(updateItem) {
                        int currQuantity = itemStack.getCurrentQuantity();
                        itemStack.setCurrentQuantity(currQuantity - quantity);
                    }
                    return itemStack.getItem();
                } else {
                    throw new Exception("item already sold out");
                }
            }
        }
        throw new Exception("Invalid Code");
    }
}
