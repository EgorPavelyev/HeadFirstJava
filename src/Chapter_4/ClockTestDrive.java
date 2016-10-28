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
class Clock{
    String time;
    void setTime(String t){
        time = t;
        }
    String getTime(){//Важно указывать тип возвращаемого значения
        return time;
        }        
}
public class ClockTestDrive {
    public static void main(String[] args){
        Clock c = new Clock();
        
        c.setTime("1234");
        String tod = c.getTime();
        System.out.println("время: " + tod);   
    }
}
