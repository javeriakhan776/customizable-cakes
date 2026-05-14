package gui.utils;

import javax.swing.*;
import java.awt.*;

public class ImageUtils {

    public static ImageIcon scaleIcon(String path, int width, int height){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

}
