public class Bag{
  Book b;
 String color;
 int price;

void storeBook(Book b)
{this.b=b;
if(b!=null)
{
b=new Book();
System.out.println("book can store inside a bag");
}
}
void removeBook(Book b){
if(b!=null)

System.out.println("book cannot stored inside bag");
}
public static void main(String[] args){
Bag b1=new Bag();

b1.storeBook(new Book());
b1.b.getBookDetails();
b1.removeBook(new Book());
}
}