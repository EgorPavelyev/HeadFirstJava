/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_4;

/**
 *
 * @author Егор
 */


class GoodDog{
    private int size;
    
    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;    
    }
    void bark(){
        {
           System.out.println("Как лает собака: ");
           
        }  
        if (size > 60){
            System.out.println("Гав-Гав");
            }
        else if (size > 14){
            System.out.println("Вуф-Вуф");        
            }
        else {
            System.out.println("Тяф-Тяф");  
             }   
                }
             }
public class GoodDogTestDrive {
    public static void main (String[] args){
        
        GoodDog one = new GoodDog();
        one.setSize(70);
        
        GoodDog two = new GoodDog();
        two.setSize(8);
        
           System.out.println("Первая собака: " + one.getSize());  
    
           System.out.println("Вторая собака: " + two.getSize());
           
           one.bark(); 
           two.bark();
    }
    
}
