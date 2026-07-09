package it.corso;

import java.util.ArrayList;

public class LibraryService {
    ArrayList<Book> lista = new ArrayList<>();

    public void addBook(Book b){
        lista.add(b);

    }

    public Book findBook(long id)
    {
        for (Book book : lista)
        {
            if (id == book.getId())
            {
                return book;
            }
        }

        System.out.println("Non è stato trovato nessun id.");
        return null;
    }
}
