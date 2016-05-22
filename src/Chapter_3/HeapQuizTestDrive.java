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
class HeapQuiz {
    int id = 0;
}
    public class HeapQuizTestDrive{
    public static void main(String[] args){
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        
        while ( x < 3){
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
            }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = hq[1];
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        //что то делается...
        int res = hq[x].id;
        System.out.println(res);
    }
}
