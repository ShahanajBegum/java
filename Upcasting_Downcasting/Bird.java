public class Bird{
Public Parrot addParrot(){
return new Parrot();
}
public Pegion addPegion(){
return new Pegion();
}
}


class Parrot extends Bird{
int price=500;
int age=1;
}

class Pigeon extends Bird{
int price=1000;
int age=5;
}
}