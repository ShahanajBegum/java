public class Fibonous{
public static void main(String[] args){
int n=5;
int n1=0;
int n2=1;
int count=2;
System.out.println(n1+""+n2);
while(count<n){
int n3=n1+n2;
 n1=n2;
 n2=n3;
System.out.println(n3);
count++;
}

}

}