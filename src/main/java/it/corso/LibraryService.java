package it.corso;

import java.util.ArrayList;

public class LibraryService {
    ArrayList<Book> lista = new ArrayList<>();

    public void addBook(Book b){
        lista.add(b);
    }
}
