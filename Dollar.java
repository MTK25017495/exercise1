/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dollar;
import java.util.Scanner;
/**
 *
 * @author mavhivha tresia
 */
public class Dollar{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        //Declare your variables
        int dollars,amount,twenties,tens,fives,ones;
        System.out.println("Enter an amount: "); 
        dollars = scan.nextInt();
        amount = dollars;
        //Conversions of 20s
        twenties = dollars/20;
        dollars = dollars -twenties;
        //Conversions of 10s
        tens = dollars/10;
        dollars = dollars -tens;
        //Conversions of 5s
        fives = dollars/5;
        dollars = dollars - fives;
        //Conversions of 1s
        ones = dollars;
        //Displaying the conversions
        System.out.println();
        System.out.println("This is the amount of 20s in your "+amount+" dollars: "+twenties);
        System.out.println("This is the amount of 10s in your "+amount+" dollars: "+tens);
        System.out.println("This is the amount of 5s in you`r "+amount+" dollars: "+fives);
        System.out.println("This is the amount of 1s in your "+amount+" dollars: " +ones);
    }
}

