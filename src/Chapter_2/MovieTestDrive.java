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
class Movie{
    String title;
    String genre;
    int rating;
    void playIt(){
            System.out.println("Play Film");
}

}
public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "How to burn on shares";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost of Office";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte-Club";
        three.genre = "Tragedy";
        three.rating = 127;
        
    }
}
