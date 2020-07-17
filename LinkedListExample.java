
package linkedlistexample;
import java.util.*;  
class Book implements Comparable<Book> {
    int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
public int compareTo(Book b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}
}
public class LinkedListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue <Book> queue = new PriorityQueue<Book>();
        Book b1 = new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2 = new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3 = new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        
        System.out.println("Traversing the queue elements"+
                "\n*** *** *** *** *** *** ***\n\n ");
        
        for (Book b : queue){
            System.out.println("Book ID: "+ b.id + "\nBook Name: "+b.name+"\nBook Author: "+ b.author+"\nBook Publisher: "+b.publisher+ "\nBook Quantity: "+b.quantity+"\n");
        }
        
        queue.remove();
        System.out.println("After removing one book record:"+
                "\n*** *** *** *** *** *** ***\n\n ");  
        
        for (Book b : queue){
            System.out.println("Book ID: "+ b.id + "\nBook Name: "+b.name+"\nBook Author: "+ b.author+"\nBook Publisher: "+b.publisher+ "\nBook Quantity: "+b.quantity+"\n");
        }
        
    }
    
}
