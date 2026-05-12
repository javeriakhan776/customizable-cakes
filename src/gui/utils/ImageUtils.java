package gui.utils;

import javax.swing.*;
import java.awt.*;

public class ImageUtils {

    public static ImageIcon scaleIcon(String path){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(340,340, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

}
