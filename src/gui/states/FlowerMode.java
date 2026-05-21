package gui.states;

import gui.components.CakeCanvas;
import gui.components.OptionButtonsPanel;
import gui.screens.CakeBuilderScreen;
import gui.utils.ImageUtils;
import logic.Cake;
import logic.Flower;

import javax.swing.*;
import java.awt.*;

public class FlowerMode {

    Image flowerScreenBg=new ImageIcon("resources/images/backgrounds/pinkFlowers.png").getImage();

    ImageIcon lavenderOption = ImageUtils.scaleIcon("resources/images/options/flowers/lavender.png", 340, 340);
    ImageIcon roseOption = ImageUtils.scaleIcon("resources/images/options/flowers/rose.png", 340, 340);
    ImageIcon sunFLowerOption = ImageUtils.scaleIcon("resources/images/options/flowers/sunFlower.png", 340, 340);
    ImageIcon vanillaOption= ImageUtils.scaleIcon("resources/images/options/flowers/vanilla.png", 340, 340);

    private ImageIcon lavender =  ImageUtils.scaleIcon("resources/images/layers/flowers/lavender.png", 400, 340);
    private ImageIcon rose =  ImageUtils.scaleIcon("resources/images/layers/flowers/rose.png", 400, 340);
    private ImageIcon sunFlower =  ImageUtils.scaleIcon("resources/images/layers/flowers/sunflower.png", 400, 340);
    private ImageIcon vanilla =  ImageUtils.scaleIcon("resources/images/layers/flowers/vanilla.png", 400, 340);


    OptionButtonsPanel flowerOptionButtons = new OptionButtonsPanel();

    public void addButtonListener(JButton button, CakeCanvas cakeCanvas, ImageIcon imageIcon, Cake cake, Flower flower, CakeBuilderScreen cakeBuilderScreen){
        button.addActionListener(e ->{
            cakeCanvas.getCake().setIcon(imageIcon);
            cake.setFlower(flower);
            cakeBuilderScreen.showOk(true);
            cakeBuilderScreen.renderOk(cake);
        });
    }

    public FlowerMode(CakeBuilderScreen cakeBuilderScreen, CakeCanvas cakeCanvas, Cake cake){
        cakeBuilderScreen.setState(CakeBuilderScreen.State.FLOWER_SELECTION_SCREEN);
        cakeBuilderScreen.setOptionsBg(flowerScreenBg);
        cakeBuilderScreen.setOptionsTitle("Choose your cake's floral theme!");
        cakeBuilderScreen.setOptionsPanel(flowerOptionButtons);

        flowerOptionButtons.setOption1(lavenderOption,"Lavender");
        flowerOptionButtons.setOption2(roseOption,"Rose");
        flowerOptionButtons.setOption3(sunFLowerOption,"Sun Flower");
        flowerOptionButtons.setOption4(vanillaOption, "Vanilla");

        addButtonListener(flowerOptionButtons.getOption1(), cakeCanvas, lavender, cake, Flower.LAVENDER, cakeBuilderScreen);
        addButtonListener(flowerOptionButtons.getOption2(), cakeCanvas, rose, cake, Flower.ROSE, cakeBuilderScreen);
        addButtonListener(flowerOptionButtons.getOption3(), cakeCanvas, sunFlower, cake, Flower.SUNFLOWER, cakeBuilderScreen);
        addButtonListener(flowerOptionButtons.getOption4(), cakeCanvas, vanilla, cake, Flower.VANILLA, cakeBuilderScreen);

    }

}
