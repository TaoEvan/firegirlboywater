import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private MainMenu mainMenu;
    private Game game;

    public Window(){
        mainMenu = new MainMenu();
        game = new Game();

        setContentPane(game);



        setTitle("game");
        setLocationRelativeTo(null);
        setSize((int)Const.SIZE.getWidth()/2, (int)Const.SIZE.getHeight()/2);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        Window window = new Window();
    }

}
