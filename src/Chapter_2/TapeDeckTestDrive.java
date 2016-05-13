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
class TapeDeck {

    boolean canRecord = false;

    void playTape() {
            System.out.println("Tape Player");
    }

    void recordTape() {
            System.out.println("Tape Recording");
    }
}

class TapeDeckTestDrive {
    public static void main (String [] args) {

            TapeDeck t = new TapeDeck();

            t.canRecord = true;
            t.playTape();

            if (t.canRecord == true) {
                    t.recordTape();
            }
    }
}