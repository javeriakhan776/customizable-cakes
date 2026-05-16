package logic;
import logic.Cake;

  public  class Order {
      private Cake cake;

      public void setCake(Cake cake) {
              this.cake = cake;
      }

      public Cake getCake() {
          return cake;
      }

      int number_of_products;

        enum Flavour {CHOCOLATE, VANILLA, STRAWBERRY, LOTUS, PINEAPPLE}

        ;

        enum Toppings {CHOCOLATE_CHIPS, CHOCOLATE_DRIPPING, STRAWBERRY_CHUNKS, LOTUS_DRIPPING, PINEAPPLE};
        enum Icing {CHOCOLATE, VANILLA, STRAWBERRY, LOTUS};
        double price;
public Order(Cake cake){
    this.cake=cake;
}
        public double calculate_price() {
            double price = 0;
           if (cake.getPounds()==1){
               price=price+350;
           }
           else if (cake.getPounds()==2) {
               price=price+600;
           }
           else if (cake.getPounds()==3) {
               price=price+900;
           }
           else if (cake.getPounds()==4) {
               price=price+1350;
           }
           else if (cake.getPounds()==5) {
               price=price+1650;
           }
           else if (cake.getPounds()==6) {
               price=price+2000;
           }
           if(cake.getSpongeFlavour()==Sponge.RED_VELVET){
               price=price+250;
           }
           else if (cake.getSpongeFlavour()==Sponge.PISTACHIO){
               price =price + 220;
           }
           else if (cake.getSpongeFlavour()==Sponge.CHOCOLATE){
               price =price + 200;
           }
           else if (cake.getSpongeFlavour()==Sponge.VANILLA){
               price =price + 180;
           }
            if(cake.getIcingFlavour()== logic.Icing.CHOCOLATE){
                price=price+200;
            }
            else if (cake.getIcingFlavour()== logic.Icing.STRAWBERRY){
                price =price + 180;
            }
            else if (cake.getIcingFlavour()== logic.Icing.COFFEE){
                price =price + 250;
            }
            else if (cake.getIcingFlavour()== logic.Icing.COOKIES){
                price =price + 280;
            }
            if(cake.getFlower()== Flower.VANILLA){
                price=price+200;
            }
            else if (cake.getFlower()== Flower.ROSE){
                price =price + 220;
            }
            else if (cake.getFlower()== Flower.SUNFLOWER){
                price =price + 250;
            }
            else if (cake.getFlower()== Flower.LAVENDER){
                price =price + 280;
            }
            return price * number_of_products;
            }




        public static void main(String[] args) {

            Cake cake1=new Cake();
            Cake cake2=new Cake();

            Order order1 = new Order(cake1);
            Order order2 = new Order(cake2);

            System.out.println(order1.calculate_price());


        }
    }

