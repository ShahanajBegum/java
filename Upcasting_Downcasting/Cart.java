import java.util.Scanner;
public class Cart{
Animal a;
Bird b;
public void addCart(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter ur choice");
boolean flag=true;
do{
        System.out.println("1.Animal");
        System.out.println("2.bird");
        int a=sc.nextInt();
switch(a){
case 1:
        {
        Animal a=new Animal();
        int c=sc.nextInt();
        if(c==1)
                 {
                 System.out.println("1.Dog");
                 a.addDog();
                 }

        else     {
                 System.out.println("2.Cat");
                 a.addCat();
                  }
        }
case 2: {
         Bird b=new Bird();
         int d=nextInt();
         if(d==1){
                  System.out.println("1.Parrot");
                  b.addParrot();
                }

         else   { 
                  System.out.println("2.pegion");
                  b.addPegion();
                }
             }
case 3: flag=false
         }while(flag);
         }
public void isEmpty(){
        if(a==null && b==null)
        System.out.println("empty");
        else
        System.out.println("not empty");
        }
public void display(){
if(a!=null){
          if(a instanceof Dog){
          Dog d=(Dog)a;
          System.out.println(d.price+"   "   + d.color+ " " + d.age);}
          else{
          Cat c=(Cat)a;
          System.out.println(c.price+"   "   + c.color+ " " + c.age);}
          
          }
else{ 
    if(b instanceof Parrot){
    Parrot p=(Parrot)b;
    System.out.println(p.price+"   "  + p.age);}
    else {
    pegion p1=(Pegion)b;
    System.out.println(p1.price+"   "  + p1.age);
    }

    }
public static void main(String[] args){
Cart c= new Cart();
boolean flag=true;
do{
   System.out.println("1.add cart");
   System.out.println("2.isempty");
   System.out.println("1.display");
   int z=sc.nextInt();
   switch(z){
   }
  }while(flag)

}

}

}
}