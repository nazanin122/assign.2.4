/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task24;

/**
 *
 * @author 2277120
 */
public class Task24 {


    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*'); 
            }
            System.out.println(); 
        }

        
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*'); 
            }
            System.out.println(); 
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' '); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*'); 
            }
            System.out.println(); 
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' '); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*'); 
            }
            System.out.println(); 
        }
    }
}
