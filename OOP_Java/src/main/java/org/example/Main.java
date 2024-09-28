package org.example;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


// Создайте класс Book и Author
// Книгу могут написать много авторов (в классе Book
// есть поле Author[] authors)
// Создайте конструкторы, get/set (где необходимо
//сделайте проверку), также метод toString()
//Создайте массив из 5 книг





 class Author{
     private String name;

     private String surname;


     public Author ( String name, String surname){
         this.name = name;
         this.surname = surname;
     }

     public String getName(){
         return "Имя автора:" + ' ' + name;
     }

     public void setName(String name){
         this.name = name;
     }

     public String getSurname(){
         return surname;
     }
     public void setSurname(String surname){
         this.surname = surname;
     }

     @Override
     public String toString(){
         return "Author [name=" + name + ", surname=" + surname + "]";
     }


     }


class Book {
     private String title;
     private Author []authors;


public Book(String title,Author []authors ){
     this.title = title;
     this.authors = authors;

}
public String getTitle(){
    return title;
}
public void setTitle(String title){
    this.title = title;
}
public Author[] getAuthors(){
    return authors;
}
public void setAuthors(Author []authors){
    this.authors = authors;
}

@Override
    public String toString(){
    return "Book [title=" + title + ", authors:" + Arrays.toString(authors) + "]";
}



}


 public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("John", "Doe");
        Author author2 = new Author("J.K.", "Rowling");
        Author author3 = new Author("Leo", "Tolstoy");
        Author author4 = new Author("Fyodor", "Dostoevsky");
        Author author5 = new Author("Jane", "Austen");





        Book book1 = new Book("1984", new Author[]{author1});
        Book book2 = new Book("Harry Potter", new Author[]{author2});
        Book book3 = new Book("War and Peace", new Author[]{author3});
        Book book4 = new Book("Crime and Punishment", new Author[]{author4});
        Book book5 = new Book("Pride and Prejudice", new Author[]{author5});


        System.out.println(author1.getName());
        author1.setName("Rive");
        System.out.println(author1.getName());




    Book[] books = {book1,book2,book3,book4,book5};

    for(Book book:books){
        System.out.println(book);
     }



    }
}