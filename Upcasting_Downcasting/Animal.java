public class Animal{
Public Dog addDog(){
return new Dog();
}
public Cat addCat(){
return new Cat();
}
}


class Dog extends Animal{
int price=30000;
String color="Black";
int age=10;
}

class Cat extends Animal{
int price=20000;
String color="white";
int age=2;
}
}
