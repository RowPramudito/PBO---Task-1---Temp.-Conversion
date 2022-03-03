/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_0401;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("+------------------------------------+");
        System.out.println(" WATER TEMPERATURE CONVERSION PROGRAM ");
        System.out.println("+------------------------------------+");

        Conversion temp = new Conversion();
        Scanner userInput = new Scanner(System.in);
        
        dataInput(temp, userInput);
        mainMenu(temp, userInput);

        userInput.close();

        System.exit(0);
    }

    static void mainMenu(Conversion temp, Scanner userInput) {
        System.out.println("");
        System.out.println("Option");
        System.out.println("------");
        System.out.println("1. View Conversion Data");
        System.out.println("2. Edit Conversion Data");
        System.out.println("3. Exit");
        System.out.print("Input: ");
        int choice = userInput.nextInt();
        switch (choice) {
            case 1:
                System.out.println("");
                System.out.println("Temperature in Celsius    : " + temp.tempCels);
                System.out.println("Temperature in Reamur     : " + temp.convertToR(temp.tempCels));
                System.out.println("Temperature in Fahrenheit : " + temp.convertToF(temp.tempCels));
                System.out.println("Temperature in kelvin     : " + temp.convertToK(temp.tempCels));
                temp.waterCondition(temp.tempCels);
                System.out.println("");
                mainMenu(temp, userInput);
                break;
            case 2: 
                dataInput(temp, userInput);
                mainMenu(temp, userInput);
                break;
            case 3: 
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("");
                System.out.println("Option does not exist. Please enter the Input Correctly.");
                mainMenu(temp, userInput);
                break;
        }

    }

    static void dataInput(Conversion temp, Scanner userInput) {
        System.out.println("");
        System.out.println("DATA ENTRY");
        System.out.println("----------");
        System.out.print("Temperature in Celsius: ");
        temp.tempCels = userInput.nextInt(); 
    }
}
