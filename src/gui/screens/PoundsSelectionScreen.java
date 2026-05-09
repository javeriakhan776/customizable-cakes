package gui.screens;

import javax.swing.*;
import java.awt.*;

public class PoundsSelectionScreen extends JFrame{

    public PoundsSelectionScreen () {
        setTitle("pound selection");
        setSize(1400, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ImageIcon icon1=new ImageIcon("resources/images/pounds/1 pound img.png");
        ImageIcon icon2=new ImageIcon("resources/images/pounds/2 pound img.png");
        ImageIcon icon3=new ImageIcon("resources/images/pounds/3 pound img.png");
        ImageIcon icon4=new ImageIcon("resources/images/pounds/4 pound img.png");
        ImageIcon icon5=new ImageIcon("resources/images/pounds/5 pound img.png");
        ImageIcon icon6=new ImageIcon("resources/images/pounds/6 pound img.png");

        Image image1=icon1.getImage();
        Image image2=icon2.getImage();
        Image image3=icon3.getImage();
        Image image4=icon4.getImage();
        Image image5=icon5.getImage();
        Image image6=icon6.getImage();


        int btnwidth=465;
        int btnheight=400;
        Image scaled1=image1.getScaledInstance(btnwidth,btnheight,Image.SCALE_SMOOTH);
        Image scaled2=image2.getScaledInstance(btnwidth,btnheight,Image.SCALE_SMOOTH);
        Image scaled3=image3.getScaledInstance(btnwidth,btnheight,Image.SCALE_SMOOTH);
        Image scaled4=image4.getScaledInstance(btnwidth,btnheight,Image.SCALE_SMOOTH);
        Image scaled5=image5.getScaledInstance(btnwidth,btnheight,Image.SCALE_SMOOTH);
        Image scaled6=image6.getScaledInstance(btnwidth,btnheight,Image.SCALE_SMOOTH);

        ImageIcon scaledIcon1=new ImageIcon(scaled1);
        ImageIcon scaledIcon2=new ImageIcon(scaled2);
        ImageIcon scaledIcon3=new ImageIcon(scaled3);
        ImageIcon scaledIcon4=new ImageIcon(scaled4);
        ImageIcon scaledIcon5=new ImageIcon(scaled5);
        ImageIcon scaledIcon6=new ImageIcon(scaled6);

        JButton btn1 = new JButton("1 POUND",scaledIcon1);
        JButton btn2 = new JButton("2 POUND",scaledIcon2);
        JButton btn3 = new JButton("3 POUND",scaledIcon3);
        JButton btn4 = new JButton("4 POUND",scaledIcon4);
        JButton btn5 = new JButton("5 POUND",scaledIcon5);
        JButton btn6 = new JButton("6 POUND",scaledIcon6);
        panel.setLayout(new GridLayout(2, 3,20,20));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        btn1.setText("1 pound");
        btn1.setHorizontalTextPosition(SwingConstants.CENTER);
        btn1.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn1.setForeground(Color.BLACK);
        btn2.setText("2 pound");
        btn2.setHorizontalTextPosition(SwingConstants.CENTER);
        btn2.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn2.setForeground(Color.BLACK);

        btn3.setText("3 pound");
        btn3.setHorizontalTextPosition(SwingConstants.CENTER);
        btn3.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn3.setForeground(Color.BLACK);
        btn4.setText("4 pound");
        btn4.setHorizontalTextPosition(SwingConstants.CENTER);
        btn4.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn4.setForeground(Color.BLACK);
        btn5.setText("5 pound");
        btn5.setHorizontalTextPosition(SwingConstants.CENTER);
        btn5.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn5.setForeground(Color.BLACK);
        btn6.setText("6 pound");
        btn6.setHorizontalTextPosition(SwingConstants.CENTER);
        btn6.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn6.setForeground(Color.BLACK);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        add(panel);
        setVisible(true);
    }
    public static void main(String []args){
        new PoundsSelectionScreen();
    }
   }


