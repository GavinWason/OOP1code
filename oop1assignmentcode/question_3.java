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
public class question_3 {
    public static void main (String [] args){
        int [] array = new 
        int [] {95,55,103,12,30,124,72,180,39,48,28,18,8,19,65,71,70,64,196,18,53};
        
        for(int i = 1; i<array.length; i++){
            
            if(array[i]%2!=0){
            System.out.println(array[i]);
            }
        }
    }
    
}
