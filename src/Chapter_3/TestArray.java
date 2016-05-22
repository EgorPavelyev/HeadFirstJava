/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_3;

/**
 *
 * @author Егор
 */
public class TestArray {
    public static void main(String[] args){
        String[] islands = new String[4];
        int[] index = new int[4];

        int y = 0;
         
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
               
        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";
        
               
        
       
        while(y < 4){
             int ref;
        ref = index[y];
                System.out.print("острова = ");
                System.out.println(islands[ref]);
                y = y + 1;
        
        }
           
    }
}
