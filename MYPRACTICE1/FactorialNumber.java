//WRITE A JAVA PROGRAM TO FIND FACTORIAL OF GIVEN NUMBER//
public class FactorialNumber{
public static void main(String[] args){
int n=5;
while(n>0){

int r=n%10;
int f=1;
while(r>=1){
f=f*r;
r--;
}
n=n/10;
System.out.println(f);
}

}
}