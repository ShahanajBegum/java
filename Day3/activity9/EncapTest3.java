public class EncapTest3{

public static void main(String[] args){
Book4 b1=new Book4();
Book4 b2=new Book4(1);
Book4 b3=new Book4(1,"maths",2500);

b1.setTitle("science");
b1.setPrice(3000);
b2.setTitle("harrypotter");
b2.setPrice(3500);
b3.setTitle("social");
b3.setPrice(3100);
System.out.println(b1.getId());
System.out.println(b1.getPrice());
System.out.println(b1.getTitle());
System.out.println(b2.getId());
System.out.println(b2.getPrice());
System.out.println(b2.getTitle());
System.out.println(b3.getId());
System.out.println(b3.getPrice());
System.out.println(b3.getTitle());
}
}