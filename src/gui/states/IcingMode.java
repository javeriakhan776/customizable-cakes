package gui.states;

import gui.components.OptionButtonsPanel;
import gui.screens.CakeBuilderScreen;
import gui.utils.ImageUtils;

import javax.swing.*;
import java.awt.*;

public class IcingMode {

    Image icingScreenBg=new ImageIcon("resources/images/backgrounds/greenCotton.png").getImage();

    ImageIcon chocolateOption= ImageUtils.scaleIcon("resources/images/options/icings/chocolateIcing.png");
    ImageIcon coffeeOption = ImageUtils.scaleIcon("resources/images/options/icings/coffee.png");
    ImageIcon cookiesAndCreamOption = ImageUtils.scaleIcon("resources/images/options/icings/cookiesNcream.png");
    ImageIcon strawberryOption = ImageUtils.scaleIcon("resources/images/options/icings/strawberry.png");

    OptionButtonsPanel icingOptionButtons = new OptionButtonsPanel();

    public IcingMode(CakeBuilderScreen cakeBuilderScreen){
        cakeBuilderScreen.setOptionsBg(icingScreenBg);
        cakeBuilderScreen.setOptionsTitle("Choose your cakes icing!");
        cakeBuilderScreen.setOptionsPanel(icingOptionButtons);

        icingOptionButtons.setOption1(chocolateOption,"Chocolate");
        icingOptionButtons.setOption2(coffeeOption,"Coffee");
        icingOptionButtons.setOption3(strawberryOption,"Strawberry");
        icingOptionButtons.setOption4(cookiesAndCreamOption,"Cookies");

    }

}
