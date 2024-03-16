/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.activity2;

/**
 *
 * @author ADMIN
 */
public class Activity2 {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 3, 12};    
       
        System.out.println("Elements of the array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        int sum = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        System.out.println("Sum of all arrays:"+ sum);
    
        int max = Math.max(numbers [0], Math.max(numbers [1], Math.max(numbers
                [2],Math.max(numbers [3],numbers [4]))));

        System.out.println("Maximum value: " + max);
    }
}


