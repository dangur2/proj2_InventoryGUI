import java.awt.*;
import javax.swing.JPanel;

public class InventoryPanel extends JPanel{
    private final int inventoryWidth = 800;
    private final int inventoryHeight = 100;
    private final Inventory inventory;
    
    public InventoryPanel(Inventory inventory){
        this.inventory = inventory;
        setPreferredSize(new Dimension(inventoryWidth,inventoryHeight));
        setLayout(new GridLayout(1,9));
        add_buttons();
    }

    private void add_buttons() {
        for(int i = 0; i<inventory.getInventory().size(); i++){
            add(new InventoryButton(inventory.getInventorySlot(i)));
        }
    }
}
