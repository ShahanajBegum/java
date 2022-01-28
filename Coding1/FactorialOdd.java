public class FactorialOdd{
public static void main(String[] args){

int n=13;
while(n>0){
int f=1;
int r=n%10;
if(r%2==1){
for(int i=r;i>=1;i--){
f=f*i;
}
System.out.println(f);
}
n=n/10;
}
}
}