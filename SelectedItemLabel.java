
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class SelectedItemLabel extends JLabel{
    public SelectedItemLabel(){
        setFont(new Font("Verdana", Font.BOLD, 35));
        setForeground(Color.black);
    }
    public void setTextPanel(String i){
        setText(i);
    }
}
