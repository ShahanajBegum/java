 class Animal
{
Dog d;
Cat c;
Dog addDog(){
return new Dog();
}
Cat addCat(){
return new Cat();
}
}
class Dog extends Animal
{
  int price=30000;
  String colour="balck";
  String age="10 months";

public void display(){
System.out.println(price);
System.out.println(colour);
System.out.println(age);
}
}
class Cat extends Animal
{
  int price=20000;
  String colour="white";
  String age="2 months";
  public void display(){
System.out.println(price);
System.out.println(colour);
System.out.println(age);

}
}
class Bird 
{
	Parrot p;
	Pegion pe;

	Parrot addParrot(){
	return new Parrot();
	}
	Pegion addPegion(){
	return new Pegion();
	}
}


class Parrot extends Bird
{ 
int price=5000;
String age= "1 month";
public void display(){
System.out.println(price);
System.out.println(age);

}
}

class Pegion extends Bird
{ 
	int price=1000;
String age= "5 month";
public void display(){
System.out.println(price);
System.out.println(age);
}
} class Cart 
{
Animal a; 
Bird b; 

  public void addtocart(int a,int b){
  if(a==1){
 this. a=new Animal();
 if(b==1){
 this.a=this.a.addDog();
 System.out.println("Dog is added");
 }
 else if(b==2){
	 this. a=this.a.addCat();
	 System.out.println("cat is added");
 }
}
else if(a==2){
	this.b=new Bird();
	if(b==1){
this.b=this.b.addParrot();
System.out.println("Parrot is added");
	}
	else if(b==2){
	this.b=this.b.addPegion();
	System.out.println("Pegion is added");
	
	}
}
}
public void isempty(){
if(a==null&&b==null)
	System.out.println("cart is empty");
else
	System.out.println("cart is not empty");
}
public void display(){
 if( a instanceof Dog){
     Dog d1=(Dog)a;
	d1.display();
 }
 if( a instanceof Cat){
     Cat c1=(Cat)a;
	c1.display();
 }
   if( b instanceof Parrot){
    Parrot p1=(Parrot)b;
	p1.display();
 }
 if( b instanceof Pegion){
     Pegion pa1=(Pegion)b;
	pa1.display();
 }

}
}


 import java.util.Scanner;
class Driver212
{
  

	public static void main(String[] args) 
	{  Scanner sc=new Scanner(System.in);
		Cart ca=new Cart();
		boolean flag=true;
   do{ 
	   System.out.println("***************");
	   System.out.println("1.addtocart");
	    System.out.println("2.isempty");
		 System.out.println("3.display");
		  System.out.println("4.exit");
		  int s=sc.nextInt();
		  switch(s){
			case 1:{System.out.println("1.Animal");
			        System.out.println("2.Bird");
					int f=sc.nextInt();
					if(f==1){
						System.out.println("1.Dog");
						System.out.println("2.Cat");
						}
                     else if(f==2){
					 System.out.println("1.Parrot");
					 System.out.println("2.pegion");
					 }
					 int r=sc.nextInt();
					 ca.addtocart(f,r);
				
			}
			break;
			 case 2:{ ca.isempty();
					 
					 }

				break;
			case 3 :{
				    ca.display();
					}
					break;

			case 4 : flag=false;
		  }

	
   }while(flag);
	  
		
	}
        }