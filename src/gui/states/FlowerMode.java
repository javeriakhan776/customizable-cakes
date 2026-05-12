package gui.states;

import gui.components.OptionButtonsPanel;
import gui.screens.CakeBuilderScreen;
import gui.utils.ImageUtils;

import javax.swing.*;
import java.awt.*;

public class FlowerMode {

    Image flowerScreenBg=new ImageIcon("resources/images/backgrounds/pinkFlowers.png").getImage();

    ImageIcon lavenderOption = ImageUtils.scaleIcon("resources/images/options/flowers/lavender.png");
    ImageIcon roseOption = ImageUtils.scaleIcon("resources/images/options/flowers/rose.png");
    ImageIcon sunFLowerOption = ImageUtils.scaleIcon("resources/images/options/flowers/sunFlower.png");
    ImageIcon vanillaOption= ImageUtils.scaleIcon("resources/images/options/flowers/vanilla.png");

    OptionButtonsPanel flowerOptionButtons = new OptionButtonsPanel();

    public FlowerMode(CakeBuilderScreen cakeBuilderScreen){
        cakeBuilderScreen.setOptionsBg(flowerScreenBg);
        cakeBuilderScreen.setOptionsTitle("Choose your cakes floral theme!");
        cakeBuilderScreen.setOptionsPanel(flowerOptionButtons);

        flowerOptionButtons.setOption1(lavenderOption,"Lavender");
        flowerOptionButtons.setOption2(roseOption,"Rose");
        flowerOptionButtons.setOption3(sunFLowerOption,"Sun Flower");
        flowerOptionButtons.setOption4(vanillaOption, "Vanilla");

    }

}
