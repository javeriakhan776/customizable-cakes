package logic;

public class Cake {
    private int pounds;
    private Sponge spongeFlavour;
    private Icing icingFlavour;
    private Flower flower;

    public void setPounds(int pounds) {
        this.pounds = pounds;
    }

    public int getPounds() {
        return pounds;
    }

    public void setSpongeFlavour(Sponge spongeFlavour) {
        this.spongeFlavour = spongeFlavour;
    }

    public Sponge getSpongeFlavour() {
        return spongeFlavour;
    }


    public void setIcingFlavour(Icing icingFlavour) {
        this.icingFlavour = icingFlavour;
    }

    public Icing getIcingFlavour() {
        return icingFlavour;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public Flower getFlower() {
        return flower;
    }
}
