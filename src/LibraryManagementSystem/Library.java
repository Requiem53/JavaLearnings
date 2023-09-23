package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public void displayAllBookTitles(){
        for(Book book: books){
            System.out.println(book.title);
        }
    }

    public Library(){
        books = new ArrayList<Book>();
    }

    public void borrowByTitle(String title){
        boolean found = false;
        for(Book book: books){
            if(book.title.equals(title)){
                if(book.isAvailable){
                    book.borrow();
                    System.out.println("Book " + book.title + " has been borrowed.");
                    found = true;
                }else{
                    System.out.println("Book " + book.title + " has already been borrowed.");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Book " + title + " not found.");
        }
    }

    public void returnByTitle(String title){
        boolean found = false;
        for(Book book: books){
            if(book.title.equals(title)){
                if(!book.isAvailable){
                    book.returnBook();
                    System.out.println("Book " + book.title + " has been returned.");
                    found = true;
                }else{
                    System.out.println("Book " + book.title + " has not been borrowed.");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Book " + title + " not found.");
        }
    }
}
