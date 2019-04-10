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
public class question_2 {
    public static void main(String [] args){
        int n;
         int sum = 0;
        double average;
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of students");
        n = s.nextInt();
        int studentmarks[] = new int[n];
        System.out.println("marks of students");
        for(int i = 0; i < n; i++)
        {
            studentmarks[i] = s.nextInt();
            sum = sum + studentmarks[i];
        }
        System.out.println("sum:"+sum);
        average = (double)sum/n;
        System.out.println("Average:"+average);
  
 
        
            
        }

    }
    

