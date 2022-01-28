public class Book3{
String title;
double price;
String author;
{
System.out.println("non static initializer");
}
public void demo(){
System.out.println(title);
System.out.println(price);
System.out.println(author);
}
Book3()
{
System.out.println("NO ARGUMENTS CONSTRUCTOR");
}
public static void main(String[] args){
Book3 b=new Book3();
b.title="harrypotter";
b.price=250;
b.author="shahanaj";
b.demo();
}
}                                                                                                                                                                   ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
                                              