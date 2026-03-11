package VendingMachine;

public class ItemStack {
    int itemCode;
    Item item;
    int maxCapacity;
    int currentQuantity;
    boolean soldOut;

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int quantity) {
        this.currentQuantity = quantity;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public int getCapacity() {
        return maxCapacity;
    }

    public void setCapacity(int capacity) {
        this.maxCapacity = capacity;
    }
}
