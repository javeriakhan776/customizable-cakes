package gui.screens;

import javax.swing.*;
import java.awt.*;

public class OptionButtons extends JPanel {

    JButton option1 = new JButton();
    JButton option2 = new JButton();
    JButton option3 = new JButton();
    JButton option4 = new JButton();

    public OptionButtons(){
        this.setLayout(new GridLayout(2,2,0,0));
        this.setBorder(BorderFactory.createEmptyBorder(20,50,0,0));

        this.add(this.option1);
        this.add(this.option2);
        this.add(this.option3);
        this.add(this.option4);
    }



    public OptionButtons(JButton option1, JButton option2, JButton option3, JButton option4){
        this.setLayout(new GridLayout(2,2,0,0));
        this.setBorder(BorderFactory.createEmptyBorder(20,50,0,0));

        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
        this.option4=option4;

        this.add(option1);
        this.add(option2);
        this.add(option3);
        this.add(option4);
    }
}
