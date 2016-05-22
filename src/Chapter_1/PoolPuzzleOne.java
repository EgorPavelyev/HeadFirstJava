/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_1;

/**
 *
 * @author Егор
 */
class PoolPuzzleOne {
  public static void main (String [] args) {
    int x = 0;
    while (x < 1) { 
      System.out.print("a");
      System.out.print(" ");
      if (x < 1) {
        System.out.print("n");
        System.out.println("oise");
      }
      x = x + 2;
      if (x > 1) {
        System.out.println("annoys");
      }
      x = x - 1;
      if (x == 1) {
        System.out.print("an");
      }
      x = x + 1;
      if (x < 4) {
        System.out.print(" oyster");
      }
      System.out.println("");
    } 
  }
}