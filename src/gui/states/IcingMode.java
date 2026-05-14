package gui.states;

import gui.components.CakeCanvas;
import gui.components.OptionButtonsPanel;
import gui.screens.CakeBuilderScreen;
import gui.utils.ImageUtils;
import logic.Cake;
import logic.Icing;
import logic.Sponge;

import javax.swing.*;
import java.awt.*;

public class IcingMode {

    Image icingScreenBg=new ImageIcon("resources/images/backgrounds/greenCotton.png").getImage();

    ImageIcon chocolateOption= ImageUtils.scaleIcon("resources/images/options/icings/chocolateIcing.png", 340, 340);
    ImageIcon coffeeOption = ImageUtils.scaleIcon("resources/images/options/icings/coffee.png", 340, 340);
    ImageIcon cookiesAndCreamOption = ImageUtils.scaleIcon("resources/images/options/icings/cookiesNcream.png", 340, 340);
    ImageIcon strawberryOption = ImageUtils.scaleIcon("resources/images/options/icings/strawberry.png", 340, 340);

    private final ImageIcon chocolate_chocolate =  ImageUtils.scaleIcon("resources/images/layers/icings/chocolate/chocolate.png", 400, 340);
    private final ImageIcon chocolate_coffee =  ImageUtils.scaleIcon("resources/images/layers/icings/chocolate/coffee.png", 400, 340);
    private final ImageIcon chocolate_strawberry =  ImageUtils.scaleIcon("resources/images/layers/icings/chocolate/strawberry.png", 400, 340);
    private final ImageIcon chocolate_cookies =  ImageUtils.scaleIcon("resources/images/layers/icings/chocolate/cookiesAndCream.png", 400, 340);

    private final ImageIcon pistachio_chocolate =  ImageUtils.scaleIcon("resources/images/layers/icings/pista/chocolate.png", 400, 340);
    private final ImageIcon pistachio_coffee =  ImageUtils.scaleIcon("resources/images/layers/icings/pista/coffee.png", 400, 340);
    private final ImageIcon pistachio_strawberry =  ImageUtils.scaleIcon("resources/images/layers/icings/pista/strawberry.png", 400, 340);
    private final ImageIcon pistachio_cookies =  ImageUtils.scaleIcon("resources/images/layers/icings/pista/cookiesAndCream.png", 400, 340);

    private final ImageIcon redVelvet_chocolate =  ImageUtils.scaleIcon("resources/images/layers/icings/redVelvet/chocolate.png", 400, 340);
    private final ImageIcon redVelvet_coffee =  ImageUtils.scaleIcon("resources/images/layers/icings/redVelvet/coffee.png", 400, 340);
    private final ImageIcon redVelvet_strawberry =  ImageUtils.scaleIcon("resources/images/layers/icings/redVelvet/strawberry.png", 400, 340);
    private final ImageIcon redVelvet_cookies =  ImageUtils.scaleIcon("resources/images/layers/icings/redVelvet/cookiesAndCream.png", 400, 340);

    private final ImageIcon vanilla_chocolate =  ImageUtils.scaleIcon("resources/images/layers/icings/vanilla/chocolate.png", 400, 340);
    private final ImageIcon vanilla_coffee =  ImageUtils.scaleIcon("resources/images/layers/icings/vanilla/coffee.png", 400, 340);
    private final ImageIcon vanilla_strawberry =  ImageUtils.scaleIcon("resources/images/layers/icings/vanilla/strawberry.png", 400, 340);
    private final ImageIcon vanilla_cookies =  ImageUtils.scaleIcon("resources/images/layers/icings/vanilla/cookiesAndCream.png", 400, 340);


    OptionButtonsPanel icingOptionButtons = new OptionButtonsPanel();

    public void addButtonListener(JButton button, CakeCanvas cakeCanvas, ImageIcon imageIcon, Cake cake, Icing icingFlavour, CakeBuilderScreen cakeBuilderScreen){
        button.addActionListener(e ->{
            cakeCanvas.getCake().setIcon(imageIcon);
            cake.setIcingFlavour(icingFlavour);
            cakeBuilderScreen.showOk(true);
            cakeBuilderScreen.renderOk(icingOptionButtons);
        });
    }

    public IcingMode(CakeBuilderScreen cakeBuilderScreen, CakeCanvas cakeCanvas, Sponge sponge, Cake cake){

        cakeBuilderScreen.setOptionsBg(icingScreenBg);
        cakeBuilderScreen.setOptionsTitle("Choose your cake's icing!");
        cakeBuilderScreen.setOptionsPanel(icingOptionButtons);

        icingOptionButtons.setOption1(chocolateOption,"Chocolate");
        icingOptionButtons.setOption2(coffeeOption,"Coffee");
        icingOptionButtons.setOption3(strawberryOption,"Strawberry");
        icingOptionButtons.setOption4(cookiesAndCreamOption,"Cookies");

        switch (sponge){
            case CHOCOLATE -> {
                addButtonListener(icingOptionButtons.getOption1(), cakeCanvas, chocolate_chocolate, cake, Icing.CHOCOLATE,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption2(), cakeCanvas, chocolate_coffee, cake, Icing.COFFEE,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption3(), cakeCanvas, chocolate_strawberry, cake, Icing.STRAWBERRY,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption4(), cakeCanvas, chocolate_cookies, cake, Icing.COOKIES,cakeBuilderScreen);
            }
            case PISTACHIO -> {
                addButtonListener(icingOptionButtons.getOption1(), cakeCanvas, pistachio_chocolate, cake, Icing.CHOCOLATE,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption2(), cakeCanvas, pistachio_coffee, cake, Icing.COFFEE,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption3(), cakeCanvas, pistachio_strawberry, cake, Icing.STRAWBERRY,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption4(), cakeCanvas, pistachio_cookies, cake, Icing.COOKIES,cakeBuilderScreen);
            }
            case RED_VELVET -> {
                addButtonListener(icingOptionButtons.getOption1(), cakeCanvas, redVelvet_chocolate, cake, Icing.CHOCOLATE,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption2(), cakeCanvas, redVelvet_coffee, cake, Icing.COFFEE,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption3(), cakeCanvas, redVelvet_strawberry, cake, Icing.STRAWBERRY,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption4(), cakeCanvas, redVelvet_cookies, cake, Icing.COOKIES,cakeBuilderScreen);
            }
            case VANILLA -> {
                addButtonListener(icingOptionButtons.getOption1(), cakeCanvas, vanilla_chocolate, cake, Icing.CHOCOLATE,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption2(), cakeCanvas, vanilla_coffee, cake, Icing.COFFEE,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption3(), cakeCanvas, vanilla_strawberry, cake, Icing.STRAWBERRY,cakeBuilderScreen);
                addButtonListener(icingOptionButtons.getOption4(), cakeCanvas, vanilla_cookies, cake, Icing.COOKIES,cakeBuilderScreen);
            }
        }
    }

}
