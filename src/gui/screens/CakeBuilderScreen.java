package gui.screens;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CakeBuilderScreen extends JFrame {

    Image previewBg=new ImageIcon("resources/images/backgrounds/yellowCoffee.png").getImage();
    Image spongeScreenBg=new ImageIcon("resources/images/backgrounds/blueClouds.png").getImage();
    Image icingScreenBg =new ImageIcon("resources/images/backgrounds/greenCotton.png").getImage();
    Image flowerScreenBg=new ImageIcon("resources/images/backgrounds/pinkFlowers.png.png").getImage();
    Image optionsBg=spongeScreenBg;

    Font ruschaleFont;


    enum State{
        SPONGE_SELECTION_SCREEN,
        ICING_SELECTION_SCREEN,
        FLOWER_SELECTION_SCREEN
    }

    private State state = State.SPONGE_SELECTION_SCREEN;

    JPanel options = new JPanel(new BorderLayout()){
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(optionsBg,0,0,getWidth(),getHeight(),this);
        }
    };

    JPanel preview = new JPanel(new BorderLayout()){
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(previewBg,0,0,getWidth(),getHeight(),this);
        }
    };

    OptionButtons spongeOptionButtons = new OptionButtons();
    OptionButtons icingOptionButtons = new OptionButtons();
    OptionButtons flowerOptionButtons = new OptionButtons();

    JSplitPane screenSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, options, preview);

    JLabel optionsTitle = new JLabel();

    public CakeBuilderScreen(){

        setTitle("Build your cake!");
        setSize(1400, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(screenSplit);

        try{
            ruschaleFont = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getResourceAsStream("/fonts/Amsterdune-K7a8p.otf"))
            ).deriveFont(100f);
        } catch (Exception e){
            ruschaleFont = new Font("Serif",Font.BOLD, 48);
        }

        optionsTitle.setFont(ruschaleFont);
        optionsTitle.setForeground(Color.BLACK);
        optionsTitle.setHorizontalAlignment(SwingConstants.LEFT);
        optionsTitle.setBorder(BorderFactory.createEmptyBorder(20,10,0,0));
        options.add(optionsTitle,BorderLayout.NORTH);

        renderScreen();
        setVisible(true);

        screenSplit.setDividerLocation(0.66);
        screenSplit.setEnabled(false);
        screenSplit.setDividerSize(3);
        //preview.setBackground(new Color(255, 220, 105, 229));  ADDS PLAIN BACKGROUND COLOR TO PREVIEW PANEL
    }

    private void setOptionsBackgroung(Image image){
        optionsBg = image;
        options.repaint();
    }

    private void renderScreen(){
        switch (state){
            case SPONGE_SELECTION_SCREEN: {
                setOptionsBackgroung(spongeScreenBg);
                optionsTitle.setText("Choose your cakes sponge base!");


            }
            break;
            case ICING_SELECTION_SCREEN: {
                setOptionsBackgroung(icingScreenBg);

            }
            break;
            case FLOWER_SELECTION_SCREEN: {
                setOptionsBackgroung(flowerScreenBg);

            }
            break;
        }
    }

    public static void main(String[] s){
        new CakeBuilderScreen();
    }
}
