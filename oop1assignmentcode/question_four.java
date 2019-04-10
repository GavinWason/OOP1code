/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_work_3;

/**
 *
 * @author user
 */
public class question_four {
    public static void main(String [] args){
        
        int [] numbers= new
         int []{71,73,79,83,97,101,103,107,109,113};
        int [] numbers2 = new
         int [] {23,29,31,37,41,43,47,53,59,61,67,71};
        
        int smallest = numbers[0];
        int s = numbers2[0];
        int largest = numbers[0];
        int l = numbers2[0];
      
        
        
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]> largest)
                largest = numbers[i];
            else if (numbers[i]< smallest)
                smallest = numbers[i];
       
        }
         for(int i=1; i<numbers2.length; i++){
            if(numbers2[i]> l)
                l = numbers2[i];
            else if (numbers2[i]< s)
                s = numbers2[i];
        }
        System.out.println("Largest Number is:"+largest);
        System.out.println("Largest number is:"+ l);
        System.out.println("smallest number is"+ smallest);
        System.out.println("smallest number is" + s);
        System.out.println("difference:");
        System.out.println(largest-smallest);
        System.out.println(l-s);
        
    }
    
}
