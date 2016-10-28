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
class DVDPlayer{
    boolean canRecord = false;
    
    void playDVD(){
    
        System.out.println("Идет проигрывание Диска");
    }
    
    void recordDVD(){
    
        System.out.println("Идет запись Диска");
    }
}


public class DVDPlayerTestDrive {
    public static void main(String[] args){
        DVDPlayer d = new DVDPlayer();
        
        d.canRecord = true;
        d.playDVD();
        
        if(d.canRecord == true){
        d.recordDVD();
    
    }
    
    }
    
}
