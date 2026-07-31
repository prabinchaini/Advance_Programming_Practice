public class library {  
static class book {

            String title;
            String author;
            double price;

            book(String t, String a, double p) {
                title = t;
                author = a;
                price = p;
            }

            void display() {
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Price: $" + price);
            }

        }
         

    public static void main(String[] args) {
        book b1 = new book("Harry Potter", "J.K. Rowlings", 57.99);
        b1.display();
    }
}


