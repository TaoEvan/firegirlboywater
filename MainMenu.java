import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        JButton startButton = new JButton();
        JButton optionButton = new JButton();
        add(startButton);
        add(optionButton);


        revalidate();
        repaint();
    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){

        }
    }
    
}