import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

public class InventoryPanel extends JPanel{
    private final int inventoryWidth = 800;
    private final int inventoryHeight = 100;
    private final Inventory inventory;
    private final SelectedItemLabel sip;
    private final ArrayList<InventoryButton> ib = new ArrayList<>();

    
    public InventoryPanel(Inventory inventory, SelectedItemLabel sip){
        this.sip = sip;
        this.inventory = inventory;
        
        setPreferredSize(new Dimension(inventoryWidth,inventoryHeight));
        setLayout(new GridLayout(1,9));
        add_buttons();
    }

    private void add_buttons() {
        for(int i = 1; i<inventory.getInventory().size(); i++){
            InventoryButton button = new InventoryButton(inventory.getInventorySlot(i), i);
            ib.add(button);
            button.setFocusable(true);
            button.setFocusPainted(false);
            add(button);
        }
        addClickInput();
        addKeyboardInput();
    }
    private void addKeyboardInput(){
        for(InventoryButton x : ib){
            x.addKeyListener(new KeyAdapter() {
                @Override 
                public void keyPressed(KeyEvent e){
                    int key = (e.getKeyCode() - KeyEvent.VK_0);
                    showItemLabel(ib.get(key-1));
                    hightlightItem(ib.get(key-1));
                }
            });
        }
    }
    private void addClickInput(){
        for(InventoryButton x : ib){
            x.addActionListener((ActionEvent e) -> {
                showItemLabel(x);
                hightlightItem(x);
            });
        }
    }

    private void showItemLabel(InventoryButton x) {
        sip.setTextPanel("Slot "+x.getSlot()+": "+inventory.getInventorySlot(x.getSlot()).getItem());
    }
    private void hightlightItem(InventoryButton x){
        resetButtons();
        x.setBackground(Color.lightGray);
    }

    private void resetButtons() {
        for(InventoryButton x : ib){
            x.setBackground(Color.white);
        }
    }
}
