public class PrintStrongNumbers{
public static void main(String[] args){
for(int i=1;i<=500;i++){
int sum=0;
while(i>0){
int r=i%10;
int f=1;
while(r>1){
f=f*r;
r--;
}
sum=sum+f;
i=i/10;
}
}
if(sum==i)
System.out.println(sum);
}


}