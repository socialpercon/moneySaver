/*
 * Implementation of each funtions.
 */
package moneysaver;

import java.util.*;


/**
 *
 * @author David
 */
public class functionImplement{
    
    Scanner scan = new Scanner(System.in);
    
    public double num = 0;
    public String str = " ";
    public String say = " ";
    
    //implementation for money cost on daily supplies
    public double daily(){
        System.out.println("Please enter the money spent on daily supplies: ");
        double cost = scan.nextDouble();
        
        num = cost;
        str = "Daily supplies";
        say = "\nPay attention to discounts of supermarkets and go to NJ to fill your gas to save money.\n";
        
        return cost;
    }
    
    
    //implementation for money cost on buying cloths
    public double cloth(){
        
        System.out.println("Please enter the money spent on cloth: ");
        double cost = scan.nextDouble();
        
        if (num < cost){
            num = cost;
            str = "Cloth";
            say = "\nPay attention to discounts in cloth shops while end of season sale to save money.\n";
        }
        
        return cost;
    }
    
    //implementation for money cost on buying food.
    public double food(){
        
        System.out.println("Please enter the money spent on food: ");
        double cost = scan.nextDouble();
        
        if (num < cost){
            num = cost;
            str = "Food";
            say = "\nPay attention to discounts of food markets and save coupons they give to you everytime to save money.\n";
        }
        
        return cost;
    }
    
    
    //implementation for money cost on buying electronic supplies
    public double electronic(){
        
        System.out.println("Please enter the money spent on electronic services: ");
        double cost = scan.nextDouble();
        
        if (num < cost){
            num = cost;
            str = "Electronic Supplies";
            say = "\nDo not let your phone fall on the ground again!\n";
        }
        
        return cost;
    }
    
    //implementation for money cost on playing.
    public double play(){
        
        System.out.println("Please enter the money spent on playing: ");
        double cost = scan.nextDouble();
        
        if (num < cost){
            num = cost;
            str = "Play Outside";
            say = "\nDo not smoke or charge in games.\n";
        }
        
        return cost;
    }
    
    //implementation for money cost on buying snacks
    public double snacks(){
        
        System.out.println("Please enter the money spent on snacks: ");
        double cost = scan.nextDouble();
        
        if (num < cost){
            num = cost;
            str = "Snacks";
            say = "\nFor your tooth health and saving money, do not eat snacks often.\n";
        }
        
        return cost;
    }
    
    //implementation for money cost on luxury
    public double luxury(){
        
        System.out.println("Please enter the money spent on luxury: ");
        double cost = scan.nextDouble();
        
        if (num < cost){
            num = cost;
            str = "Luxury";
            say = "\nMan you are rich, you don't need me at all :( \n";
        }
        
        return cost;
    }
   
    //implementation for money cost on others
    public double other(){
        
        System.out.println("Please enter the money spent on other aspects: ");
        double cost = scan.nextDouble();
        
        if (num < cost){
            num = cost;
            str = "Others";
            say = "\nYour are unique. Keep going.\n";
        }
        return cost;
    }
    
    public void getBiggest(){
        
        System.out.println("\nYou spent " + "$" + num + " on " + str + " mostly. \n");
    }
    
//    public double countRate(double count, double total){
//        
//        return count/total;
//    }
    
//    public void list(){
//        
//    }
//    
//    public void display(){
//        
//    }
    
    
}
