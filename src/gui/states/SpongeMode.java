package gui.states;

import gui.components.OptionButtonsPanel;
import gui.screens.CakeBuilderScreen;
import gui.utils.ImageUtils;

import javax.swing.*;
import java.awt.*;

public class SpongeMode {

    Image spongeScreenBg=new ImageIcon("resources/images/backgrounds/blueClouds.png").getImage();

    ImageIcon chocolateOption= ImageUtils.scaleIcon("resources/images/options/sponges/chocolateSponge.png");
    ImageIcon pistachioOption= ImageUtils.scaleIcon("resources/images/options/sponges/pistachio.png");
    ImageIcon redVelvetOption= ImageUtils.scaleIcon("resources/images/options/sponges/redVelvet.png");
    ImageIcon vanillaOption= ImageUtils.scaleIcon("resources/images/options/sponges/vanilla.png");

    OptionButtonsPanel spongeOptionButtons = new OptionButtonsPanel();

    public SpongeMode(CakeBuilderScreen cakeBuilderScreen){
        cakeBuilderScreen.setOptionsBg(spongeScreenBg);
        cakeBuilderScreen.setOptionsTitle("Choose your cakes sponge base!");
        cakeBuilderScreen.setOptionsPanel(spongeOptionButtons);

        spongeOptionButtons.setOption1(chocolateOption,"Chocolate");
        spongeOptionButtons.setOption2(pistachioOption,"Pista");
        spongeOptionButtons.setOption3(redVelvetOption,"Red Velvet");
        spongeOptionButtons.setOption4(vanillaOption,"Vanilla");

    }

}
