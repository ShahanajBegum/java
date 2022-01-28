public class StrongNumberRangeMethod{
public static void main(String[] args){
for(int n=100;n<=500;n++){
if(Strong(n))
System.out.println(n);
}
}
public static boolean Strong(int n){
int t=n;
int sum=0;
while(n>0){
int r=n%10;
sum=sum+fact(r);
n=n/10;
}
return sum==t;
}

static int fact(int r){
int fact=1;
for(int i=1;i<=r;i++){
fact=fact*1;
}
return fact;
}
}
