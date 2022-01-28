interface A1 {
int demo();
}
interface B1 extends A1{
int demo();
}
class C1 implements A1,B1{
int a=10;
}