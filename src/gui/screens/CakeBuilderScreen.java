package gui.screens;

import gui.states.FlowerMode;
import gui.states.IcingMode;
import gui.states.SpongeMode;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CakeBuilderScreen extends JFrame {

    Image previewBg=new ImageIcon("resources/images/backgrounds/yellowCoffee.png").getImage();
    Image optionsBg;


    private JLabel optionsTitle = new JLabel();

    Font ruschaleFont;

    enum State{
        SPONGE_SELECTION_SCREEN,
        ICING_SELECTION_SCREEN,
        FLOWER_SELECTION_SCREEN
    }
    private State state = State.FLOWER_SELECTION_SCREEN;

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

    JSplitPane screenSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, options, preview);


    public CakeBuilderScreen(){

        setTitle("Build your cake!");
        setSize(1400, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(screenSplit);

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
    }

    public void setOptionsBg(Image image){
        this.optionsBg = image;
        options.repaint();
    }

    public void setOptionsTitle(String optionsTitle){
        this.optionsTitle.setText(optionsTitle);
    }

    public void setOptionsPanel(JPanel panel){
        options.add(panel);
    }

    private void renderScreen(){
        switch (state){
            case SPONGE_SELECTION_SCREEN: {
                SpongeMode spongeMode=new SpongeMode(this);
            }
            break;
            case ICING_SELECTION_SCREEN: {
                IcingMode icingMode=new IcingMode(this);
            }
            break;
            case FLOWER_SELECTION_SCREEN: {
                FlowerMode flowerMode=new FlowerMode(this);
            }
            break;
        }
    }

    public static void main(String[] s){
        CakeBuilderScreen c=new CakeBuilderScreen();
        System.out.println("CakeBuilderScreen constructor running");
    }
}
