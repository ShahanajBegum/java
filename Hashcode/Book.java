public class Book{
int bid;
double price;
Book(int bid,double price){
this.bid=bid;
this.price=price;
}
public int hashcode(){
int hc1=bid;
double hc2=price;
int hc=hc1+(int)hc2;
return hc;
}
public static void main(String[] args){
Book b1=new Book(10,20.0);
Book b2=b1;
Book b3=new Book(10,10.0);
System.out.println(b1.hashcode()==b2.hashcode());
System.out.println(b1.hashcode()==b3.hashcode());

}


}