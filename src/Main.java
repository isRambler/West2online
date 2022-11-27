import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        MyAnimalShop myAnimalShop=new MyAnimalShop();
        myAnimalShop.setMoney(1000.0);
        myAnimalShop.buy(1);
        myAnimalShop.buy(1);
        myAnimalShop.buy(2);
        myAnimalShop.buy(2);
        myAnimalShop.buy(3);
        myAnimalShop.buy(3);
        System.out.println(myAnimalShop.getAnimal());
        Customer a=new Customer("a");
        Customer b=new Customer("b");
        Customer c=new Customer("c");
        System.out.println(myAnimalShop.getCustomer());
        myAnimalShop.reception(a);
        System.out.println(myAnimalShop.getCustomer());
        System.out.println(myAnimalShop.getAnimal());
        myAnimalShop.reception(b);
        System.out.println(myAnimalShop.getCustomer());
        System.out.println(myAnimalShop.getAnimal());
        myAnimalShop.reception(c);
        System.out.println(myAnimalShop.getCustomer());
        System.out.println(myAnimalShop.getAnimal());
        LocalDateTime localDateTime=LocalDateTime.now();
        myAnimalShop.operation(localDateTime);
    }
}