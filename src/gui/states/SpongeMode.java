package gui.states;

import gui.components.CakeCanvas;
import gui.components.OptionButtonsPanel;
import gui.screens.CakeBuilderScreen;
import gui.utils.ImageUtils;

import javax.swing.*;
import java.awt.*;

public class SpongeMode {

    Image spongeScreenBg=new ImageIcon("resources/images/backgrounds/blueClouds.png").getImage();

    ImageIcon chocolateOption= ImageUtils.scaleIcon("resources/images/options/sponges/chocolateSponge.png", 340, 340);
    ImageIcon pistachioOption= ImageUtils.scaleIcon("resources/images/options/sponges/pistachio.png", 340, 340);
    ImageIcon redVelvetOption= ImageUtils.scaleIcon("resources/images/options/sponges/redVelvet.png", 340, 340);
    ImageIcon vanillaOption= ImageUtils.scaleIcon("resources/images/options/sponges/vanilla.png", 340, 340);

    private ImageIcon chocolateSponge =  ImageUtils.scaleIcon("resources/images/layers/sponges/chocolate.png", 400, 340);
    private ImageIcon pistachioSponge =  ImageUtils.scaleIcon("resources/images/layers/sponges/pista.png", 400, 340);
    private ImageIcon redVelvetSponge =  ImageUtils.scaleIcon("resources/images/layers/sponges/redVelvet.png", 400, 340);
    private ImageIcon vanillaSponge =  ImageUtils.scaleIcon("resources/images/layers/sponges/vanilla.png", 400, 340);

    OptionButtonsPanel spongeOptionButtons = new OptionButtonsPanel();

    public SpongeMode(CakeBuilderScreen cakeBuilderScreen, CakeCanvas cakeCanvas){
        cakeBuilderScreen.setOptionsBg(spongeScreenBg);
        cakeBuilderScreen.setOptionsTitle("Choose your cake's sponge sponges!");
        cakeBuilderScreen.setOptionsPanel(spongeOptionButtons);

        spongeOptionButtons.setOption1(chocolateOption,"Chocolate");
        spongeOptionButtons.setOption2(pistachioOption,"Pista");
        spongeOptionButtons.setOption3(redVelvetOption,"Red Velvet");
        spongeOptionButtons.setOption4(vanillaOption,"Vanilla");
        
        spongeOptionButtons.addButtonListener(spongeOptionButtons.getOption1(),chocolateSponge,cakeCanvas);
        spongeOptionButtons.addButtonListener(spongeOptionButtons.getOption2(),pistachioSponge,cakeCanvas);
        spongeOptionButtons.addButtonListener(spongeOptionButtons.getOption3(),redVelvetSponge,cakeCanvas);
        spongeOptionButtons.addButtonListener(spongeOptionButtons.getOption4(),vanillaSponge,cakeCanvas);

    }

}
