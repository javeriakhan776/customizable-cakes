package gui.components;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class OptionButtonsPanel extends JPanel {

    Font amsterduneFont;

    private JButton option1 = new JButton();
    private JButton option2 = new JButton();
    private JButton option3 = new JButton();
    private JButton option4 = new JButton();

    public OptionButtonsPanel(){

        try{
            amsterduneFont = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getResourceAsStream("/fonts/Amsterdune-K7a8p.otf"))
            ).deriveFont(100f);
        } catch (Exception e){
            amsterduneFont = new Font("Serif",Font.BOLD, 48);
        }

        this.setLayout(new GridLayout(2,2,10,10));
        this.setBorder(BorderFactory.createEmptyBorder(50,200,75,0));
        this.setBackground(new Color(0,0,0,0));
        this.setOpaque(false);

        this.add(this.option1);
        this.add(this.option2);
        this.add(this.option3);
        this.add(this.option4);
    }

    private void setOptionButton(JButton button, ImageIcon image, String buttonText){
        button.setIcon(image);
        button.setText(buttonText);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.CENTER);
        button.setFont(amsterduneFont);
        button.setForeground(Color.WHITE);
    }

    public void setOption1(ImageIcon image, String buttonText){
        setOptionButton(this.option1, image, buttonText);
    }

    public void setOption2(ImageIcon image, String buttonText){
        setOptionButton(this.option2, image, buttonText);
    }

    public void setOption3(ImageIcon image, String buttonText){
        setOptionButton(this.option3, image, buttonText);
    }

    public void setOption4(ImageIcon image, String buttonText){
        setOptionButton(this.option4, image, buttonText);
    }

    public JButton getOption1(){
        return option1;
    }

    public JButton getOption2(){
        return option2;
    }

    public JButton getOption3(){
        return option3;
    }

    public JButton getOption4(){
        return option4;
    }
}
