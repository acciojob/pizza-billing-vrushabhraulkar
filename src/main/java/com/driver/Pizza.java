package com.driver;

public class  Pizza {

//    private int price;
//    private Boolean isVeg;
//    private String bill;
    public int cheesePrice;
    public int basePrice;
    public int toppingPrice;
    public int paperbagPrice;
    public int totalprice;
    public boolean ischessadded;
    public boolean isToppingadded;
    public boolean isPaperabackadded;
    boolean isbillgenrated;
    public  String bill;

    public Pizza(Boolean isVeg){

        // your code goes here

        if(isVeg){
            basePrice=300;
            toppingPrice=70;
            this.totalprice= this.totalprice+basePrice+toppingPrice;

        }
        else{
            basePrice=400;
            toppingPrice=120;
            this.totalprice= this.totalprice+basePrice+toppingPrice;
        }
        paperbagPrice=20;
        cheesePrice=80;
         ischessadded=false;
         isToppingadded=false;
         isPaperabackadded= false;
        boolean isbillgenrated=false;
        bill="Base Price Of The Pizza: "+basePrice+"\n";

    }

    public int getPrice(){

        return this.totalprice;
    }

    public void addExtraCheese(){
        // your code goes here

        if(ischessadded){
            int a=20;
        }
        else{
            ischessadded=true;
            this.totalprice=this.totalprice+cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here

        if(isToppingadded==false){
            this.totalprice=this.totalprice+toppingPrice;
            isToppingadded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperabackadded==false){
            this.totalprice=this.totalprice+paperbagPrice;
            isPaperabackadded=true;
        }
    }

    public String getBill(){
        // your code goes here

        if(isbillgenrated==false){
            isbillgenrated=true;

            if(ischessadded==true){
                bill=bill+"Extra Cheese Added: "+cheesePrice+"\n";
            }
            if(isToppingadded==true){
                bill=bill+"Extra Toppings Added: "+toppingPrice+"\n";
            }
            if(isPaperabackadded==true){
                bill=bill+"Paperbag Added: "+paperbagPrice+"\n";
            }
            bill=bill+"Total Price: "+this.totalprice+"\n";

        }

            return bill;


    }
}
