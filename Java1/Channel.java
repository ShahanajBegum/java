 import java.util.*;

public class Channel implements Comparable {
String name;
double price;
Channel(){
}
Channel(String name,double price){
	this.name=name;
	this.price=price;
}
@Override
public int compareTo(Object o) {
	Channel r=(Channel)o;
	return (int)(this.price-r.price);
}

}


class RegionalPack implements Comparable{
	String name;
	double price;
	RegionalPack(){}
	RegionalPack(String name,double price){
	this.name=name;
	this.price=price;
	}
	@Override
	public int compareTo(Object o) {
		RegionalPack r=(RegionalPack)o;
		return (int)(this.price-r.price);
	}
	}



  class TataSky  {
	  String name;
	  long contactNumber;
	  String dateofbirth;
	  String gender;
	  String emailId;
	  long tataSkyId;
	  double balance;
	  TreeSet <Channel>channel=new …
[10:59 PM, 12/19/2021] +91 6300 682 284: import java.util.*;

public class Channel implements Comparable {
String name;
double price;
Channel(){
}
Channel(String name,double price){
	this.name=name;
	this.price=price;
}
@Override
public int compareTo(Object o) {
	Channel r=(Channel)o;
	return (int)(this.price-r.price);
}

}


class RegionalPack implements Comparable{
	String name;
	double price;
	RegionalPack(){}
	RegionalPack(String name,double price){
	this.name=name;
	this.price=price;
	}
	@Override
	public int compareTo(Object o) {
		RegionalPack r=(RegionalPack)o;
		return (int)(this.price-r.price);
	}
	}



  class TataSky  {
	  String name;
	  long contactNumber;
	  String dateofbirth;
	  String gender;
	  String emailId;
	  long tataSkyId;
	  double balance;
	  TreeSet <Channel>channel=new …
[10:59 PM, 12/19/2021] +91 6300 682 284: import java.util.*;

public class Driver18 {

	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		TataSky a=new TataSky();
		boolean fa=true;
		System.out.println("****Welcome To Tata Sky*****");
		System.out.println("1.Enter The Name");
		a.name=sa.next();
		System.out.println("2.Enter the contactNumber");
		a.contactNumber=sa.nextLong();
		System.out.println("3.Date of Barth");
		a.dateofbirth=sa.next();
		System.out.println("4.Gender");
		a.gender=sa.next();
		System.out.println("5.EmailId");
		a.emailId=sa.next();
		System.out.println("6.tataSkyId");
		a.tataSkyId=sa.nextLong();
do {
		System.out.println("****Welocme****");
		System.out.println("1.Modify Pack");
		System.out.println("2.My Account");
		System.out.println("3.Recharge");
		System.out.println("4.exit");
		int c=sa.nextInt();
		switch(c) {
		case 1:a.modifyPack();
		break;
		case 2 :a.myAccount();
		break;
		case 3 :a.recharge();
		break;
		case 4 :fa=false;
		}
		}while(fa);
		System.out.println("******Thank You*********");

	}

}