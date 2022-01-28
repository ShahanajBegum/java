public class Book2{
String title;
double price;
String author;
Book2(String title, double price,String author)
{
this.title=title;
this.price=price;
this.author=author;
System.out.println("NO ARGUMENTS CONSTRUCTOR");
}
public static void main(String[] args){
Book2 b=new Book2("maths",1000,"shahanaj");
System.out.println(b.title);
System.out.println(b.price);
System.out.println(b.author);
}
}