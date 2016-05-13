/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_3;//пакет классов

/**
 *
 * @author Егор
 */
class Triangle{ //объявление класса
    double area; //объявление действительной числовой переменной(с точкой)
    int lengh; //целочисленная переменная
    int height;
    void setArea(){//объявление метода класса
       area = (height * lengh) / 2; //присваивание значения и действия с ним
    
        }
}
public class TriangleTestDrive {

    public static void main(String[] args){
         int x = 0 ;//целочисленная переменная
         int y = x;
//        переменная x меняется в объектах массива lengh и height,
//        но не меняется глобально например тут "треугольник " + x +", зона"
         Triangle[] ta = new Triangle[4];//объявление массива из 4 элементов
        
        while(x < 4){//цикл пока x < 4 
           ta[x] = new Triangle();//создание объекта массива черех х 
           ta[x].height = (x + 1) * 2;//присваивание значения переменной в объекте и произведение действий с ней
           ta[x].lengh = x + 4;
           ta[x].setArea();//вызов метода класса
           System.out.print("треугольник " + x +", зона");//вывод на печать данных о х 
           System.out.println(" = " + ta[x].area);//вывод на печать данных о значении переменной area 
           x = x + 1;
}
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", зона t5 = " + t5.area);
    
    
    
    }
}
