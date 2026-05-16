package gui.screens;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class WelcomeScreen extends JFrame{
    public WelcomeScreen() {
        setTitle("Cake Ordering System");
        setSize(1400, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel(){
            Image bg=new ImageIcon("resources/images/backgrounds/img.png").getImage();
                @Override
                protected void paintComponent(Graphics g) {
                  super.paintComponent(g);
                    g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);

                }
            };

        setContentPane(panel);
        JButton getStarted = new JButton("GET STARTED") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);

                super.paintComponent(g);
            }
        };
        getStarted.setFont(new Font ("Comic Sans MS",Font.BOLD,16));
        getStarted.setBackground(new Color(255, 220, 105));
        getStarted.setForeground(Color.WHITE);
        getStarted.setContentAreaFilled(false);
        getStarted.setBorderPainted(false);
        getStarted.setFocusPainted(false);
        getStarted.setBorder(BorderFactory.createEmptyBorder(10,25,10,25));
        getStarted.setPreferredSize(new Dimension(200,45));
        JPanel bottomPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setOpaque(false);

        bottomPanel.add(getStarted);
        panel.setLayout(new BorderLayout());
        panel.add(bottomPanel,BorderLayout.SOUTH);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 300, 500));
        JLabel title=new JLabel("CAKE & CRUMBS ", SwingConstants.CENTER);
        title.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        title.setForeground(Color.BLACK);
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel tagline=new JLabel("Design your dream cake, your way !! ",SwingConstants.CENTER);
        tagline.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        tagline.setForeground(Color.BLACK);
        tagline.setAlignmentX(Component.LEFT_ALIGNMENT);
JPanel centerPanel=new JPanel();
centerPanel.setLayout(new BoxLayout(centerPanel,BoxLayout.Y_AXIS));
centerPanel.setOpaque(false);
centerPanel.add(Box.createVerticalGlue());
centerPanel.add(title);
centerPanel.add(tagline);
centerPanel.add(Box.createVerticalGlue());
        centerPanel.setBorder(BorderFactory.createEmptyBorder(150, 270, 0, 0));
    panel.add(centerPanel,BorderLayout.CENTER);
    getStarted.addActionListener(e -> {
        new PoundsSelectionScreen ().setVisible(true);
        dispose();
    });
    setVisible(true);
    }
public static void main(String [] args){
        new WelcomeScreen();
}
}