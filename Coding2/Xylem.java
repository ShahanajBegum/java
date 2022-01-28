public class Xylem{
public static void main(String[] args){
int endsum=0;
int middlesum=0;
int n=112136;
int t=n;
do{
int r=n%10;
if((n==r)||(n==t))
endsum=endsum+r;
else
middlesum=middlesum+r;
n=n/10;

}while(n>0);
if(endsum==middlesum)
System.out.println("xylem");
else
System.out.println("not xylem");


}

}