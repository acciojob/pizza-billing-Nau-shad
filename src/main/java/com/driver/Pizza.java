package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


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
        //copied from other space probelm h only
        this.bill = ("Base Price Of The Pizza: " + (isVeg ? 300 : 400) + "\nExtra Cheese Added: 80\nExtra Toppings Added: " + (isVeg ? 70 : 120) + (takeAway ? "\nPaperbag Added: 20" : "") + "\nTotal Price: " + this.price + "\n");
        return this.bill;
    }
}
