public class Book4{
private int bookid;
private String title;
private int price;
public int getId(){
return bookid;
}
 void setTitle(String title){
this.title=title;
}
public String getTitle(){
return title;
}
 void setPrice(int price){
this.price=price;
}
public int getPrice(){
return price;
}
Book4(){
}
Book4(int bookid){
this.bookid=bookid;
}
Book4(int a,String b, int c){
this.bookid=a;
this.title=b;
this.price=c;
System.out.println(bookid+ ""   + " "+title+"  "+price);
}
}