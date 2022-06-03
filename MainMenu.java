import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class MainMenu extends JPanel{
    private final Dimension startSize = new Dimension((int)Const.SIZE.getWidth()/10, (int)Const.SIZE.getWidth()/20);
    private final Dimension optionSize = new Dimension((int)Const.SIZE.getWidth()/8, (int)Const.SIZE.getWidth()/20);

    JButton startButton;
    JButton optionButton;

    public MainMenu(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        startButton = initiateButton("Assets/Buttons/START.png", startSize);
        optionButton = initiateButton("Assets/Buttons/OPTIONS.png", optionSize);

        startButton.addActionListener(new ButtonListener());
        optionButton.addActionListener(new ButtonListener());

        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        optionButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,(int)Const.SIZE.getHeight()/8)));
        add(startButton);
        add(optionButton);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Const.OFF_WHITE);


        revalidate();
        repaint();
    }

    public JButton initiateButton(String path, Dimension size){
        BufferedImage icon = null;
        try{
            icon = ImageIO.read(new File(path));
        }catch(IOException e){
            e.printStackTrace();
        }
        JButton button = new JButton(new ImageIcon(icon.getScaledInstance((int)size.getWidth(), (int)size.getHeight(), Image.SCALE_AREA_AVERAGING)));
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setPreferredSize(size);

        return button;
    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){

        }
    }
    
}