/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5;

/**
 *
 * @author Егор
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        
        int[] location = {2,3,4};
        
        dot.setLocationCell(location);
        
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        
        if (result.equals("Попал")){
            testResult= "Пройден";
        }
        System.out.println(testResult);
    }
}
