package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    /*
 Veg pizza base price = 300
Non-veg pizza base price = 400
Extra Cheese Price = 80
Extra Toppings For Veg Pizza = 70
Extra Toppings For Non-veg Pizza = 120
Paper bag Price = 20
    * */
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
         if(isVeg==true){
             price=300;

         }
        else{
            price=400;

         }

    }

    public int getPrice(){

        return price;
    }
   private boolean cheeseExtra=false;
    public void addExtraCheese(){
        if(cheeseExtra==false){
            price+=80;
            cheeseExtra=true;
        }

    }
    private boolean topping=false;
    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true){
            price+=70;
        }
        else{
            price+=120;
        }
        topping=true;
    }
    private boolean takeAway=false;
    public void addTakeaway(){
        // your code goes here
        if(takeAway==false){
            price+=20;
              }
        takeAway=true;
    }

    public String getBill(){
        bill = "Base Price Of The Pizza: "+(isVeg?300:400)+"\n"+(cheeseExtra?("Extra Cheese Added: "+80+"\n"):"")+(topping?("Extra Toppings Added: "+(isVeg?70:120)+"\n"):"")+
                (takeAway?("Paperbag Added: "+20+"\n"):"")+"Total Price: "+price+"\n";

        return this.bill;
    }
}
