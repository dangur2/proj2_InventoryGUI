import java.awt.BorderLayout;
import javax.swing.JFrame;

public class CreateUI extends JFrame{
    
    private final int gameWidth = 800;
    private final int gameHeight = 200;

    public CreateUI(Inventory inventory){
        SelectedItemLabel sip = new SelectedItemLabel();
        InventoryPanel ip = new InventoryPanel(inventory,sip);
        
        setSize(gameWidth, gameHeight);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(1);
        setResizable(false);
        setLayout(new BorderLayout());
        add(ip, BorderLayout.NORTH);
        add(sip, BorderLayout.SOUTH);
        setVisible(true);
    }
}
