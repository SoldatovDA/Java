/* import com.company.Book;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.*;

       Создать классы, спецификации которых приведены ниже. Определить кон¬структоры и методы set Тип (), get Тип (), toString().
        Определить дополнительно методы в классе, создающем массив объектов.
        Задать критерий выбора данных и вывести эти данные на консоль.
        В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
        5.	Book: id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
        Создать массив объектов. Вывести:
        a)	список книг заданного автора;
        b)	список книг, выпущенных заданным издательством;
        c)	список книг, выпущенных после заданного года.

public class Laba3a {

          public static void main(String[] args) {

              Scanner in = new Scanner(System.in);
              System.out.println("Enter the number of books: ");
              int num = in.nextInt();

              Book arrBooks[] = add(num);
              System.out.println("First list of books: ");
              FirstListOfBooks(arrBooks);
              System.out.println();
              System.out.println("Second list of books: ");
              SecondListOfBooks(arrBooks);
              System.out.println();
              System.out.println("Third list of books: ");
              ThirdListOfBooks(arrBooks);
          }


          private static Book [] add (int n) {
              Book[] flat = new Book[n];
              Scanner in = new Scanner(System.in);
              for (int i = 0; i < n; i++) {
                  System.out.println("Enter id, name, authors, publisher, year, pages, price, bindingType: ");
                  int ID = in.nextInt();
                  String name = in.nextLine();
                  String authors = in.nextLine();
                  String publisher = in.nextLine();
                  int year = in.nextInt();
                  int pages = in.nextInt();
                  int price = in.nextInt();
                  float bindingType = in.nextFloat();
                  Book[i] = Book (ID, name, authors, publisher, year, pages, price, bindingType);
              }

              return Book;
          }




          //
          public static List<Book> FirstListOfBooks(String author, Book[] books) {
              List<Book> result = new ArrayList<>();
              for (Book book : books) {
                  for (String authorBook : book.getAuthors()) {
                      if (author.equals(authorBook)) {
                          result.add(book);
                      }
                  }
              }
              return result;
          }



          //
          public static List<Book> SecondListOfBooks(String publisher, Book[] books) {
              List<Book> result = new ArrayList<>();
              for (Book book : books) {
                  if (publisher.equals(book.getPublisher())) {
                      result.add(book);
                  }
              }
              return result;
          }



          //
          private static void ThirdListOfBooks(int year, Book[] books) {
              Scanner in = new Scanner(System.in);
              System.out.print("Enter the year: ");
              int temp = 0;

              List<Book> result = new ArrayList<>();
              for (Book book : books) {
                  if (year < book.getYear())
                      result.add(book);
              }
              if(temp == 0)
                  System.out.println("Unfortunately,there are no books, which satisfies your requirements :( ");
          }
      }
*/