import java.util.*;
public class Channel implements Comparable {
       String name;
       double price;
       Channel(){
       }
Channel(String a,double b){
	name=a;
	price=b;
       }

public int compareTo(Object o) {
	Channel r=(Channel)o;
	this.price=price;
        return (int)price;
	
       }
       }



class RegionalPack implements Comparable {
	String name;
	double price;
	RegionalPack(){}
	RegionalPack(String c,double d){
	this.name=c;
	this.price=d;
	}

	public int compareTo(Object o) {
        RegionalPack r=(RegionalPack)o;
	this.price=price;
	return (int)price;

	}
	}


 class TataSky {
	 String name;
	 long contactno;
	 String dateOfBirth;
	 String gender;
	 String emailId;
	 int tataskyid;
	 double balance;
	  TreeSet <Channel>channel=new TreeSet<>();
	  TreeSet <RegionalPack>pack=new TreeSet<>();
	  Scanner sc=new Scanner(System.in);
	  public void addchanel() {
		  System.out.println("1.etv");
		  System.out.println("2.maatv");
		  System.out.println("3.tv5");
		  System.out.println("4.music");
		  System.out.println("enter your choice");
		  int b=sc.nextInt();
		  switch(b) {
		  case 1 :channel.add(new Channel("etv",50.00));
		  break;
		  case 2 :channel.add(new Channel("maatv",51.00));
		  break;
		  case 3 :channel.add(new Channel("tv5",52.00));
		  break;
		  case 4 :channel.add(new Channel("music",49.00));
		  break;
		  
		  default  :System.out.println("enter the valid Channel");
		  }
	  }
	  public void addRegionalPack() {
		  System.out.println("1.Telugu");
		  System.out.println("2.English");
		  System.out.println("3.kannada");
		  System.out.println("4.Hindi");
		  System.out.println("enter your choice");
		  int b=sc.nextInt();
		  switch(b) {
		  case 1 :pack.add(new RegionalPack("1.Telugu",150.00));
		  break;
		  case 2 :pack.add(new RegionalPack("2.English",200.00));
		  break;
		  case 3 :pack.add(new RegionalPack("3.kannada",180.00));
		  break;
		  case 4 :pack.add(new RegionalPack("4.hindi",130.00));
		  break;
		  default  :System.out.println("enter the valid RegionalPack");
		  }
	  }
	  public void removeChannel()
	  {	 
		  System.out.println("enter the channel name");
		  String a1=sc.next(); 
		  for(Channel c:channel) {
			  if(a1.equals(c.name)) {
				  channel.remove(c);
				  System.out.println("removed channel");
			  }
			  
		  }
	  }
	  public void removeRegionalPack() {
		  System.out.println("enter the RegionalPack name");
		  String a2=sc.next(); 
		  for(RegionalPack r:pack) {
			  if(a2.equals(r.name)){
				  pack.remove(r);
				  System.out.println("removed regionalpack");
			  }
		  }
	  }
		  public void modifyPack() {
	  
		  System.out.println("1.addChannel");
		  System.out.println("2.addRegionalPack");
		  System.out.println("3.removeChannel");
		  System.out.println("4.removeRegionalPack");
		   int a=sc.nextInt();
		   switch(a) {
		   case 1 :addchanel();
		   break;
		   case 2 :addRegionalPack();
		   break;
		   case 3 :removeChannel();
		   break;
		   case 4 :removeRegionalPack();
		   }
		  
	  }
		  public void setName(String a) {
		  name = a;
		  System.out.println(" Name Updated");
		}
		public void setContactNumber(long b) {
			contactno = b;
			System.out.println("contactnumber Updated");
		}
		public void setDateofbirth(String c) {
			dateOfBirth = c;
			System.out.println(" dateofbirth  Updated");
		}
		public void setEmailId(String d) {
			emailId = d;
			System.out.println(" EmailId  Updated");
		}
		  
         //public String getName() {
		 // return name;
	      // }
		  //public long getContactNumber() {
		  //	  return contactno;
		  //}
		 // public String getDateOfBirth() {
		 // return dateOfBirth;
		  //}
		 // public String getEmailId() {
		//	  return emailId;
		 // }
		  
   public void myAccount() {
   	System.out.println("personal Details...................");
   	System.out.println("name          : "+name);
   	System.out.println("Date of birth : "+dateOfBirth);
   	System.out.println("Gender        : "+gender);
   	System.out.println("Contact Details.................");
   	System.out.println("ContactNumber : "+contactno);
   	System.out.println("EmailId       : "+emailId);
   	System.out.println("For modifying details..................");
	System.out.println("1.Modify name");
	System.out.println("2.Modify Date of birth");
	System.out.println("3.Modify ContactNumber");
	System.out.println("4.Modify EmailId");
	System.out.println("enter the choice");
	int a=sc.nextInt();
	switch(a) {
	case 1 :{
		     System.out.println("enter the new Name");
		     String s=sc.next();
		     setName(s);
		  //   getName();
		     break;
	}
	case 2 :{
		System.out.println("enter the  new ContactNumbe ");
	     long l=sc.nextLong();
	     setContactNumber(l);
	  //   getContactNumber();
	     break;
	}
	case 3 :
	{
		System.out.println("enter the  new dateofbirth ");
	     String l=sc.next();
	     setDateofbirth(l);
	   //  getDateOfBirth();
	     break;
	}
	case 4 :
	{
		System.out.println("enter the  new EmailId ");
	     String l=sc.next();
	     setEmailId(l);
	  //   getEmailId();
	     break;
	}
	
	}
	
	
}



public void recharge() {
	double sum =0;
	for(Channel c2:channel) {
		sum=sum+c2.price;
	}
	for(RegionalPack r2:pack) {
		sum=sum+r2.price;
	}
	System.out.println("The total Amount for the Channels &RegionalPack ="+sum);
	System.out.println("enter the Amount to recharge");
	double s1=sc.nextDouble();
	if(sum==s1) {
		System.out.println(" Recharge is Sucessfuly Done");
	}
		else 
			System.out.println("insufficent recharge");
	
    }


}


class DriverTataSky {

	public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				TataSky a=new TataSky();
				boolean flag=true;
				System.out.println("Welcome To Tata Sky");
				System.out.println("1.Enter The Name");
				a.name=sc.next();
				System.out.println("2.Enter the contact Number");
				a.contactno=sc.nextLong();
				System.out.println("3.Date of Birth");
				a.dateOfBirth=sc.next();
				System.out.println("4.Gender");
				a.gender=sc.next();
				System.out.println("5.EmailId");
				a.emailId=sc.next();
				System.out.println("6.tataSkyId");
				a.tataskyid=sc.nextInt();
				do {
				System.out.println("=========");
				System.out.println("1.Modify Pack");
				System.out.println("2.My Account");
				System.out.println("3.Recharge");
				System.out.println("4.exit");
				int c=sc.nextInt();
				switch(c) {
				case 1:a.modifyPack();
				break;
				case 2 :a.myAccount();
				break;
				case 3 :a.recharge();
				break;
				case 4 :flag=false;
				}
				}while(flag);
				System.out.println("Thank You");

			        }

	                    	}
   
	

