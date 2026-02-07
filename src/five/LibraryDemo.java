package five;
class Library{
    int availableBooks = 3;
    public void borrowBook(int booksRequested){
        try{
            int[] books= {101,102,103};
            System.out.println("Books Requested.........."+books[booksRequested]);
        }
        catch (Exception e){
            System.out.println("Arrays out of bounds"+e);
        }
    }
}
public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.borrowBook(5);

    }
}
