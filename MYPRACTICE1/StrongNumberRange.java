public clasS StrongNumberRange{
public static void main(String[] args){
int sum=0;
for(int n=100;n<=500;n++){
int n1=n;
while(n>0){
int r=n%10;
int f=1;
while(r>1){
f=f*r;
r--;
}
sum=sum+f;
n=n/10;
}
if(sum==n1)
System.out.println(n);
}
}
}