import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> inventory = new ArrayList<>();
    
    public Inventory(ArrayList<Item> inventory){
        GenerateInventory gt = new GenerateInventory();
        this.inventory = inventory;
        this.inventory.addAll(gt.generateItems(9));
    }

    public ArrayList<Item> getInventory(){
        return this.inventory;
    }
    public Item getInventorySlot(int i){
        return this.inventory.get(i);
    }
}
