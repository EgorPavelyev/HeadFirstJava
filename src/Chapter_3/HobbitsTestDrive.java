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
class Hobbits{
    String name;

}
public class HobbitsTestDrive {
    public static void main(String[] args){
        Hobbits[] h = new Hobbits[3];
        int z = 0;
        
        while(z < 2){
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Бильбо";
            if (z == 1){
                h[z].name = "Caм";
                }
        System.out.print(h[z].name + " -");
        System.out.println("Имя хорошего хоббита");
        }
      }
    }
