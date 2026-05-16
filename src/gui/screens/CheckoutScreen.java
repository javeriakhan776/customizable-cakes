package gui.screens;
import logic.Cake;
import logic.Order;


import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
public class CheckoutScreen extends JFrame {


    public CheckoutScreen(Cake cake,Order order){
     //  Order order = new Order(cake);

        setTitle("Checkout Screen");
        setSize(1400,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel centerPanel=new JPanel();
        JPanel mainPanel=new JPanel(new GridBagLayout());
        centerPanel.setPreferredSize(new Dimension(500,600));
        centerPanel.setBackground(new Color(255, 220, 105, 150));
        centerPanel.setBorder(new EmptyBorder(20,20,20,20));
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
JLabel title=new JLabel("Summary");
title.setFont(new Font("Arial",Font.BOLD,30));
title.setForeground(new Color(255, 173, 80, 0));
centerPanel.add(title);
        centerPanel.add(Box.createRigidArea(new Dimension(0,40)));
        centerPanel.add(createItemRow("POUNDS", String.valueOf(cake.getPounds())));
        centerPanel.add(createItemRow("SPONGE", String.valueOf(cake.getSpongeFlavour())));
        centerPanel.add(createItemRow("ICING",  String.valueOf(cake.getIcingFlavour())));
        centerPanel.add(createItemRow("FLOWERS",  String.valueOf(cake.getFlower())));

        centerPanel.add(Box.createRigidArea(new Dimension(0,30)));
JPanel totalPanel=new JPanel(new BorderLayout());
totalPanel.setBackground(new Color(255, 220, 105, 190));
JLabel totalText=new JLabel("TOTAL");
totalText.setFont(new Font("Arial",Font.BOLD,18));
        JLabel totalPrice=new JLabel("TOTAL PRICE "+ order.calculate_price());
        totalPrice.setFont(new Font("Arial",Font.BOLD,28));
        totalPanel.add(totalText,BorderLayout.WEST);
        totalPanel.add(totalPrice,BorderLayout.EAST);
        centerPanel.add(totalPanel);
        centerPanel.add(Box.createRigidArea(new Dimension(0,50)));
        JLabel nameLabel=new JLabel("CARDHOLDER NAME");
        JTextField namefield= new JTextField();
        centerPanel.add(nameLabel);
        centerPanel.add(namefield);
        centerPanel.add(Box.createRigidArea(new Dimension(0,20)));
        JLabel cardNumber=new JLabel("CARD NUMBER");
        JTextField cardField=new JTextField();
        namefield.setBackground(new Color(255, 220, 105));
        namefield.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLACK));

        cardField.setBackground(new Color(255, 220, 105));
        cardField.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLACK));
        centerPanel.add(cardNumber);
        centerPanel.add(cardField);
        centerPanel.add(Box.createVerticalGlue());
        JButton Paynow = new JButton("PAY NOW");
        Paynow.setFont(new Font("Arial",Font.BOLD,22));
        Paynow.setBackground(new Color(100,250,65, 0));
        Paynow.setForeground(Color.BLACK);
        Paynow.setFocusPainted(false);
        Paynow.setPreferredSize(new Dimension(300,60));
        Paynow.setMaximumSize(new Dimension(400,60));
        Paynow.setAlignmentX(Component.CENTER_ALIGNMENT);
        Paynow.setBorder(new EmptyBorder(15,70,15,40));
        centerPanel.add(Paynow,BorderLayout.SOUTH);

        mainPanel.add(centerPanel);
        add(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private JPanel createItemRow(String item, String price){
        JPanel panel=new JPanel(new BorderLayout());
        panel.setBackground(new Color(255, 220, 105, 190));
        panel.setMaximumSize(new Dimension(350,50));
        JLabel itemLabel=new JLabel(item);
        itemLabel.setFont(new Font("Arial",Font.PLAIN,18));
        JLabel priceLabel=new JLabel(price);
        priceLabel.setFont(new Font("Arial",Font.BOLD,18));
        panel.add(itemLabel,BorderLayout.WEST);
        panel.add(priceLabel,BorderLayout.EAST);
        panel.setBorder(new EmptyBorder(10,0,10,0));
        return panel;
    }

    public static void main(String[] s){
        new WelcomeScreen();
    }
}
