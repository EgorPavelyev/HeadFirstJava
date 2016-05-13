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
class Books {
    String title;
    String autor;
}
public class BooksTestDrive {
    public static void main(String[] args){
        
        Books[] myBooks = new Books[3];
        //сохдание объектов
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        //присвоение значений переменным объектов
        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гетсби";
        myBooks[2].title = "Сборник рецептов по Java";
        
        myBooks[0].autor = "Боб";
        myBooks[1].autor = "Сью";
        myBooks[2].autor = "Ян";
        
        int x = 0;
        while (x < myBooks.length){
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].autor);
            x = x + 1;
        
        }
    
    }
}
