package gui.states;

import gui.components.CakeCanvas;
import gui.components.OptionButtonsPanel;
import gui.screens.CakeBuilderScreen;
import gui.utils.ImageUtils;
import logic.Cake;
import logic.Sponge;

import javax.swing.*;
import java.awt.*;

public class SpongeMode {

    private Sponge sponge;

    public void addButtonListener(JButton button, CakeCanvas cakeCanvas, ImageIcon imageIcon, Sponge sponge, Cake cake, CakeBuilderScreen cakeBuilderScreen){
        button.addActionListener(e ->{
            cakeCanvas.getCake().setIcon(imageIcon);
            this.sponge=sponge;
            cake.setSpongeFlavour(sponge);
            cakeBuilderScreen.showOk(true);
            cakeBuilderScreen.renderOk(spongeOptionButtons,this.sponge);
        });
    }

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

    public SpongeMode(CakeBuilderScreen cakeBuilderScreen, CakeCanvas cakeCanvas, Cake cake){
        cakeBuilderScreen.setOptionsBg(spongeScreenBg);
        cakeBuilderScreen.setOptionsTitle("Choose your cake's sponge sponges!");
        cakeBuilderScreen.setOptionsPanel(spongeOptionButtons);

        spongeOptionButtons.setOption1(chocolateOption,"Chocolate");
        spongeOptionButtons.setOption2(pistachioOption,"Pista");
        spongeOptionButtons.setOption3(redVelvetOption,"Red Velvet");
        spongeOptionButtons.setOption4(vanillaOption,"Vanilla");
        
        addButtonListener(spongeOptionButtons.getOption1(),cakeCanvas,chocolateSponge,Sponge.CHOCOLATE,cake, cakeBuilderScreen);
        addButtonListener(spongeOptionButtons.getOption2(),cakeCanvas,pistachioSponge,Sponge.PISTACHIO, cake, cakeBuilderScreen);
        addButtonListener(spongeOptionButtons.getOption3(),cakeCanvas,redVelvetSponge,Sponge.RED_VELVET, cake, cakeBuilderScreen);
        addButtonListener(spongeOptionButtons.getOption4(),cakeCanvas,vanillaSponge,Sponge.VANILLA, cake, cakeBuilderScreen);


    }
}
