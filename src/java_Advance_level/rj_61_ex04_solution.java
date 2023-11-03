package java_Advance_level;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books=0;
    }

    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+"has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book: this.books) {
            if(book == null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issue!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }
}
public class rj_61_ex04_solution {
    public static void main(String[] args) {
        //You have to implement a library using java class "Library"
        //method: addBook, issueBook, returnBook, showAvailableBooks
        //properties: Array to store the available Books,
        //Array to store the issue books

        Library l = new Library();
        l.addBook("The human book");
        l.addBook("algorithms");
        l.addBook("c++");
        l.showAvailableBooks();

        l.issueBook("c++");
        l.showAvailableBooks();

        l.returnBook("c++");
        l.showAvailableBooks();


    }
}
