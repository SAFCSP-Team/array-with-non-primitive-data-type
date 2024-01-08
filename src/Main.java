public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("data Structures and Algorithms in Java", "Robert Lafore", 2017);
        Book bookTwo = new Book("Introduction to Algorithms", "Thomas H. Cormen", 2009);
        Book bookThree = new Book("Data Structures: Abstraction and Design Using Java", "Elliot B. Koffman", 2010);

        Book[] bookCollection = new Book[3];
        bookCollection[0] = bookOne;
        bookCollection[1] = bookTwo;
        bookCollection[2] = bookThree;
        // int x = 0;
        // while (bookCollection.length > x) {
        //     System.out.println(bookCollection[x].getTitle());
        //     x += 1;
        // }

        for(int x = 0; bookCollection.length>x ; x++){
            System.out.println(bookCollection[x].getTitle());
        }
 

        
        


    }
}
