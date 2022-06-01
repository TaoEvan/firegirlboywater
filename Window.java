import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private final Dimension SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    private MainMenu mainMenu;

    public Window(){
        mainMenu = new MainMenu();
        



        setTitle("game");
        setLocationRelativeTo(null);
        setSize(SIZE);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
