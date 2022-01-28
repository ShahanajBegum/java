public class FacorialEven{
public static void main(String[] args){

int n=1234;
while(n>0){
int f=1;
int r=n%10;
if(r%2==0){
for(int i=r;i>1;i--){
f=f*i;
}
System.out.println(f);
}
n=n/10;
}
}
}