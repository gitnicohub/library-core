package it.corso;

import java.util.ArrayList;

public class LibraryService {
    ArrayList<Book> lista = new ArrayList<>();

    public void addBook(Book b){
        lista.add(b);
    }


    public void removeBook(Long id) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getId().equals(id)) {
                lista.remove(i);
                break;
            }
        }

    }

    }
