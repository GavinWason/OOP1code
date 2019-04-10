/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_work_3;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class LAB_WORK_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        int length = 2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a beverage index:");
        length = input.nextInt();
        
        String [] beverage = {"Fanta","Johnnie Walker"};
        int [] price = {60,300};
        String [] type = {"soft","Alcohol"};
        
        
        for(int counter = 0; counter < length; counter++){
            System.out.println(beverage[0]+"is a"+type[0]+"drink and costs Kshs. "+price[0]+"thus three bottles cost 180");
            beverage[counter] = input.next();
        }
        
        input.close();
         System.out.println("Output");
         for(int counter = 0; counter < length; counter++){
             System.out.println(beverage[counter]);
         }
       
       
       
        
        
    }
    
    
}
