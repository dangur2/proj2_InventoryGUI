import java.awt.Color;
import javax.swing.JButton;


public class InventoryButton extends JButton{
    
    public InventoryButton(String i){
        setText(i);
        setForeground(Color.black);
        setBackground(Color.white);
        setFocusable(false);
    }
}
