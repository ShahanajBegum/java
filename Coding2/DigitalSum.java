public class DigitalSum{
public static void main(String[] args){
int n=45992;
int sum=0;
do{
while(n>0){
int r=n%10;
sum=sum+r;
n=n/10;

}n=sum;
sum=0;


}while(n>9);

System.out.println(n);
}
}