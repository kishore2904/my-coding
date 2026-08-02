package clientInterview;

class Car{
     void drive(){
        System.out.println("Car");
    }
}

class BMW extends Car{
     void drive(){
        System.out.println("BMW");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Car c = new BMW();
        c.drive();
    }
}
