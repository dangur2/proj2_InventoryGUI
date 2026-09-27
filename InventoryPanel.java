import java.awt.*;
import javax.swing.JPanel;

public class InventoryPanel extends JPanel{
    private final int inventoryWidth = 800;
    private final int inventoryHeight = 100;
    
    public InventoryPanel(){
        setPreferredSize(new Dimension(inventoryWidth,inventoryHeight));
        setLayout(new GridLayout(1,9));
        add_buttons();
    }

    private void add_buttons() {
        int x = 0;
        for(int i = 0; i<10; i++){
            add(new InventoryButton(String.valueOf(x)));
            x++;
        }
    }
}
