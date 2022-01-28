public Class Book{
String bname;
Book(String bname){
this.bname=bname;
}
@Override
public boolean equals(Object o)
{
Book b=(Book)o;
if(this.bname==b.bname)
return true;
else 
return false;
}
}
class Driver2{
public static void main(String[] args){
Book b1=new Book("java");
Book b2=b1;
System.out.println(b1.name);
System.out.println(b2.name);
}
}