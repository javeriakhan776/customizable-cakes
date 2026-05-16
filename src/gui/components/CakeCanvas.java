package gui.components;

import gui.utils.ImageUtils;

import javax.swing.*;
import java.awt.*;

public class CakeCanvas extends JPanel {

    private JLabel cake = new JLabel();
    private ImageIcon base =  ImageUtils.scaleIcon("resources/images/layers/base/base.png", 400, 340);

    public JLabel getCake(){
        return cake;
    }

    public CakeCanvas(){

        this.setBorder(BorderFactory.createEmptyBorder(90,0,0,0));
        this.setBackground(new Color(0,0,0,0));
        this.setOpaque(false);

        this.add(cake);
        cake.setIcon(base);
    }

}
