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

class Echo{//создание класса
    int count = 0;//создание переменной экземпляра
    void hello(){//создание метода класса
    System.out.println("Привет...");//вывод на печать
    }
}

public class EchoTestDrive {//создание тестового класса
    public static void main(String[] args){//главный мелод
        Echo e1 = new Echo();//создание объекта класса Echo
        Echo e2 = new Echo();//создание объекта класса Echo        
        int x = 0;//объявление переменной 
        while(x < 4){//цикл пока x < 4 прогоняет 4 раза так как x = 0
            e1.hello();//используя оператор доступа (точка) вызываем метод hello() класса Echo для вывода на печать "Привет..."
            e1.count = e1.count + 1;//используя оператор доступа (точка)присваиваем значение переменной count класса Echo
            
            if(x == 3){//если x == 3 тогда
            e2.count = e2.count + 1;//переменной count объекта e1 присваивается значение + 1
            
            }
            if(x > 0){//если x > 0 тогда
            e2.count = e2.count + e1.count;//переменной count объекта e2 присваивается значение + count объекта e1 
            
            }
            x = x + 1;
            
        }
        System.out.println(e2.count);//выводится сумма значений count объектов e1 и e2
    }
}
