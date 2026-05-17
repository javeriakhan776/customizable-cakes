package logic;


  public  class Order {
      private Cake cake;



      public Cake getCake() {
          return cake;
      }

      int quantity=1;
      double price = 0;
public Order(Cake cake){
    this.cake=cake;
}
        public double calculate_price() {

           if (cake.getPounds()==1){
               price=price+500;
           }
           else if (cake.getPounds()==2) {
               price=price+1000;
           }
           else if (cake.getPounds()==3) {
               price=price+1500;
           }
           else if (cake.getPounds()==4) {
               price=price+2500;
           }
           else if (cake.getPounds()==5) {
               price=price+3500;
           }
           else if (cake.getPounds()==6) {
               price=price+4500;
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
            return price * quantity;
            }




        public static void main(String[] args) {

            Cake cake1=new Cake();

            Order order1 = new Order(cake1);

            System.out.println(order1.calculate_price());


        }
    }

