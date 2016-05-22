/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_1;

/**
 *
 * @author egorpavelyev
 */
public class Exercise1a {
    public static void main(String[] args){
        int x = 5;
        while (x > 2){
            x = x - 1;
            if (x < 3){
                System.out.println("Little X");//выводится пока while (x > 2)
            }//end if
        }//end while
        }//end main
}//end class Exercise1a
