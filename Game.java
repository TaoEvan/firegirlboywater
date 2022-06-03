import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Game extends JPanel{

    public Game(){
        
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);


        revalidate();
        repaint();
    }

    
}