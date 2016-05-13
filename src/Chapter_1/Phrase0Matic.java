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
public class Phrase0Matic {
    public static void main(String[] args) {
        //Creating a set of words
        String[] wordListOne = {"Круглосуточный0 "+"Круглосуточный1"+"Круглосуточный2"+
                "Круглосуточный3"+"Круглосуточный4"+"Круглосуточный5"+"Круглосуточный6"+
                "Круглосуточный7"+"Круглосуточный8"+"Круглосуточный9"+"Круглосуточный10"+
                "Круглосуточный11"+"Круглосуточный12"};
        String[] wordListTwo = {"Магазин0"+"Магазин1"+"Магазин2"+
                "Магазин3"+"Магазин4"+"Магазин5"+"Магазин6"+
                "Магазин7"+"Магазин8"+"Магазин9"+"Магазин10"+
                "Магазин11"+"Магазин12"};
        String[] wordListThree = {"Портал0"+"Портал1"+"Портал2"+
                "Портал3"+"Портал4"+"Портал5"+"Портал6"+
                "Портал7"+"Портал8"+"Портал9"+"Портал10"+
                "Портал11"+"Портал12"};
        //calculating a number of words in the list
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;
        //We generate three random numbers
        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);
        //build phrase
        String phrase = wordListOne[rand1] + " "+ wordListTwo[rand2]+ " " + 
                wordListThree[rand3]  +  " ";
        //concluded phrase on the screen
         System.out.println("Все, что нам нужно, - это " + phrase );
         
    }//end main
    
}//end class Phrase0Matic
