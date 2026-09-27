import java.awt.Color;
import javax.swing.JButton;


public class InventoryButton extends JButton{
    private final Item item;
    public InventoryButton(Item item){
        this.item = item;
        setIcon(item.getIcon());
        setForeground(Color.black);
        setBackground(Color.white);
        setFocusable(false);
        // addClick();
        // addKeyboardPress();
    }

    private void addKeyboardPress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addKeyboardPress'");
    }

    private void addClick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addClick'");
    }
}
