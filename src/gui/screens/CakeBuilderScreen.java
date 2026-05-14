package gui.screens;

import gui.components.CakeCanvas;
import gui.components.OptionButtonsPanel;
import gui.states.FlowerMode;
import gui.states.IcingMode;
import gui.states.SpongeMode;
import gui.utils.ImageUtils;
import logic.Cake;
import logic.Sponge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CakeBuilderScreen extends JFrame {

    Image previewBg=new ImageIcon("resources/images/backgrounds/yellowCoffee.png").getImage();
    Image optionsBg;

    Cake cake = new Cake();

    enum State{
        SPONGE,
        ICING,
        FLOWER
    }
    private State state = State.SPONGE;

    private JLabel optionsTitle = new JLabel();
    private JLabel previewTitle = new JLabel();
    public JButton Ok = new JButton("OK");

    public void showOk(boolean showOk){
        if (showOk){
            Ok.setVisible(true);
        }
        else{
            Ok.setVisible(false);
        }
    }

    Font amsterduneFont;

    public JPanel options = new JPanel(new BorderLayout()){
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(optionsBg,0,0,getWidth(),getHeight(),this);
        }
    };

    public JPanel preview = new JPanel(new BorderLayout()){
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(previewBg,0,0,getWidth(),getHeight(),this);
        }
    };

    JSplitPane screenSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, options, preview);
    JPanel south = new JPanel();

    CakeCanvas cakeCanvas = new CakeCanvas();

    public CakeBuilderScreen(){

        setTitle("Build your cake!");
        setSize(1400, 1000);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(screenSplit);

        try{
            amsterduneFont = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getResourceAsStream("/fonts/Amsterdune-K7a8p.otf"))
            ).deriveFont(100f);
        } catch (Exception e){
            amsterduneFont = new Font("Serif",Font.BOLD, 48);
        }

        optionsTitle.setFont(amsterduneFont);
        optionsTitle.setForeground(Color.BLACK);
        optionsTitle.setHorizontalAlignment(SwingConstants.LEFT);
        optionsTitle.setBorder(BorderFactory.createEmptyBorder(20,10,0,0));

        options.add(optionsTitle,BorderLayout.NORTH);

        previewTitle.setFont(amsterduneFont);
        previewTitle.setForeground(Color.BLACK);
        previewTitle.setHorizontalAlignment(SwingConstants.LEFT);
        previewTitle.setBorder(BorderFactory.createEmptyBorder(20,10,0,0));
        previewTitle.setText("Preview");
        previewTitle.setHorizontalAlignment(SwingConstants.CENTER);
        previewTitle.setOpaque(true);
        previewTitle.setBackground(new Color(255, 220, 10, 77));

        preview.add(previewTitle,BorderLayout.NORTH);
        preview.add(cakeCanvas,BorderLayout.CENTER);

        Ok.setPreferredSize(new Dimension(900,100));
        Ok.setBorderPainted(false);
        Ok.setIcon(ImageUtils.scaleIcon("resources/images/backgrounds/yellowCoffee.png",900,900));
        Ok.setFont(amsterduneFont);
        Ok.setText("OK");
        Ok.setHorizontalTextPosition(SwingConstants.CENTER);
        Ok.setVerticalTextPosition(SwingConstants.CENTER);

        south.add(Ok);
        showOk(false);

        preview.add(south,BorderLayout.SOUTH);

        SpongeMode spongeMode = new SpongeMode(this,cakeCanvas,cake);
        setVisible(true);

        screenSplit.setDividerLocation(0.66);
        screenSplit.setEnabled(false);
        screenSplit.setDividerSize(2);
    }

    public void renderOk(OptionButtonsPanel optionButtonsPanel, Sponge sponge){
        for (ActionListener al : Ok.getActionListeners()){
            Ok.removeActionListener(al);
        }
        Ok.addActionListener(e -> {
            options.remove(optionButtonsPanel);
            new IcingMode(this, cakeCanvas, sponge, cake);
            showOk(false);
        });
    }

    public void renderOk(OptionButtonsPanel optionButtonsPanel){
        for (ActionListener al : Ok.getActionListeners()){
            Ok.removeActionListener(al);
        }
        Ok.addActionListener(e -> {
            options.remove(optionButtonsPanel);
            new FlowerMode(this, cakeCanvas, cake);
            showOk(false);
        });
    }

    public void setOptionsBg(Image image){
        this.optionsBg = image;
        options.repaint();
    }

    public void setOptionsTitle(String optionsTitle){
        this.optionsTitle.setText(optionsTitle);
    }

    public void setOptionsPanel(JPanel panel){
        options.add(panel,BorderLayout.CENTER);
    }

    public static void main(String[] s){
        CakeBuilderScreen c=new CakeBuilderScreen();
        System.out.println("CakeBuilderScreen constructor running");
    }
}
