/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomarray;

import java.util.ArrayList;

public class RandomArray {

    
    public static void main(String[] args) {
        int chicken = 0;
        for (int i = 0; i <= 10; i = i + 1){
            chicken++;
        }
        
        int rando;
       
        rando = chicken;
        ArrayList test = new ArrayList();
        
        
        chicken = -1;
        
        for (int i = 0; i <= 5; i = i + 1){
            chicken++;
            
            test.add(chicken);
            
            System.out.println(test.get(chicken));
        }
        
    }
    
}
