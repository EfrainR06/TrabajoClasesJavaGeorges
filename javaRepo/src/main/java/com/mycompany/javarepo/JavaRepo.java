/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javarepo;

/**
 *
 * @author ESCINF
 */
public class JavaRepo {

    public static void main(String[] args) {
        int columnSize = 3;
        System.out.println("Hello World!");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.print("      ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(convertToString(i, columnSize));
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        for (int x = 1; x <= 10; x++) {
            System.out.print(convertToString(x,columnSize));
            System.out.print(" | ");
            for (int y = 1; y <= 10; y++) {
                System.out.print(convertToString(x*y,columnSize));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static public String convertToString(int input, int size){
        int inputSize = intCount(input);

        if (inputSize >= size) {
            return String.valueOf(Math.abs(input));
        }
        else {
            int diff = size - inputSize;
            String output = "";
            for (int i = 0; i < diff; i++) {
                output += " ";
            }
            output += String.valueOf(Math.abs(input));
            return output;
        }
    }

    static public int intCount(int input){
        int count = 0;
        while (input != 0){
            count ++;
            input /= 10;
        }
        return count;
    }
}
