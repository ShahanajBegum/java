public class Book1{
String title;
double price;
String author;
Book1()
{
System.out.println("NO ARGUMENTS CONSTRUCTOR");
}
public static void main(String[] args){
Book1 b=new Book1();
System.out.println(b.title);
System.out.println(b.price);
System.out.println(b.author);
}
}