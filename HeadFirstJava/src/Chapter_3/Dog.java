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
public class Dog {
    String name;
    public static void main(String[] args){
        //Создаем объект Dog  и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";
        
        //Создадим массив типа Dog
        Dog[] myDogs = new Dog[3];
        //Поместим в массив элементы
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        //Получаем доступ к объектам Dog с помошью ссылок из массива
        
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";
        
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);
        
        //Перебор элементов массива и вызов для каждого метода bark()
        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
           
            x = x + 1;
                            }
                }
        public void bark(){
        System.out.println(name + " сказал Гав!");
    }
    public void eat(){}
    public void chaseCat(){     }
}

