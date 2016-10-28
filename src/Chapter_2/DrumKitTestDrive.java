/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_2;

/**
 *
 * @author Егор
 */
class DrumKit{
    boolean topHat = true;
    boolean snare = true;
     
    void playSnare(){
        System.out.println("Бах-Бах-Бах");
    }
    void playTopHat(){
        System.out.println("Динь-Динь-Динь");
    }
   

}
public class DrumKitTestDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        
        d.snare = false;
        d.playSnare();
        
        if(d.snare == true){
            d.playSnare();
        
        }
        
        d.topHat = false;
        d.playTopHat();
        
        if(d.snare == true){
            d.playTopHat();
        
        }
    
    }
    
}
