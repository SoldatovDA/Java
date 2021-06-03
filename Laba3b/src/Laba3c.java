import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections.*;
import java.util.*;
import com.company.Complex;


      /*  Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы set Тип (), get Тип (), toString().
        Определить дополнительно методы в классе, создающем массив объектов.
        Задать критерий выбора данных и вывести эти данные на консоль.
        В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

        5.	Определить класс Комплекс, действительная и мнимая часть которой представлены в виде Рациональной Дроби.
        Создать массив/список/множество размерности п из комплексных координат.
         Передать его в метод, который выполнит сложение/умножение его элементов.
       */


public class Laba3c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        int c[] = new int[size];
        int d[] = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            System.out.println("a" + i +":");
            a[i] = input.nextInt();
            System.out.println("b" + i +":");
            b[i] = input.nextInt();
            System.out.println("c" + i +":");
            c[i] = input.nextInt();
            System.out.println("d" + i +":");
            d[i] = input.nextInt();
        }

        int summa = 0;
        int summb = 0;
        int summc = 0;
        int summd = 0;
        for (int i = 0; i < size; i++ ){
            summa+= a[i];
            summb+= b[i];
            summc+= c[i];
            summd+= d[i];
        }

        float summA = (float) summa/summb;
        float summB = (float) summc/summd;

        int multa = 1;
        int multb = 1;
        int multc = 1;
        int multd = 1;
        for (int i = 0; i < size; i++ ){
            multa= multa * a[i];
            multb= multb * b[i];
            multc*= c[i];
            multd*= d[i];
        }

        float multA = (float) multa/multb;
        float multB = (float) multc/multd;


        System.out.print("Элементы массива:" + "\n");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println("summ A = " + summA);
        System.out.println("summ B = " + summB);
        System.out.println("mult A = " + multA);
        System.out.println("mult B = " + multB);
    }

}
