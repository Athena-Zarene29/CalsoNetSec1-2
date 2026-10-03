/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author Admin
 */
public class FormatOutput {
    
    public static void main(String[]args){
        int age = 23;
        double money = 123;
        System.out.println("Age is " + age);
        System.out.println("Money is Php " + money);
        System.out.println("After format:");
        System.out.printf("Age is %d and money is PHp%.2f", age, money);
        
    }
    
}
