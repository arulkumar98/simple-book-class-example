
class Book {
  String title;
  String author;
  int numberOfPages;
}

class Lesson {

public static void main(String[] args) {
 

      Book myBook = new Book();
 
     myBook.title = "Harry Potter";
     myBook.author = "J.K.Rowlin";
     myBook.numberOfPages = 445;
      
   //Print the values
   System.out.println("The title of the book is " + myBook.title + "\nIts author is" + myBook.author + "\nIt contains " + myBook.numberOfPages);
     
}

}
