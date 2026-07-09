# library-core

Libreria Java sviluppata con Maven per la gestione di una collezione di libri.

## Funzionalità

### Book
- id
- titolo
- autore

### LibraryService

- addBook(Book)
- removeBook(Long id)
- findBook(Long id)
- listBooks()

## Utilizzo

```java
LibraryService service = new LibraryService();

service.addBook(new Book(1L, "Clean Code", "Robert C. Martin"));

Book book = service.findBook(1L);

service.listBooks();