/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_0401;



public class Conversion {
    int tempCels;

    public float convertToR(int tempCels) {
        float res = 4 * tempCels / 5;
        return res;
    }

    public float convertToF(int tempCels) {
        float res = (9 * tempCels / 5) + 32;
        return res;
    }

    public float convertToK(int tempCels) {
        float res = tempCels + 273.15f;
        return res;
    }

    public void waterCondition(int tempCels) {
        if(tempCels < 0) {
            System.out.println("Water condition is Freezing.");
        }
        else if(tempCels > 100) {
            System.out.println("Water condition is Boiling.");
        }
        else {
            System.out.println("Water condition is Normal.");
        }
    }
}

