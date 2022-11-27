import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MyAnimalShop implements AnimalShop{
    private double money;
    private double profit;
    ArrayList<Animal> animal=new ArrayList<Animal>();
    ArrayList<String> customer=new ArrayList<String>();
    private int number=0;

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public double getProfit() {
        return profit;
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public ArrayList<String> getCustomer() {
        return customer;
    }

    @Override
    public void buy(int judge){
        String name;
        int age;
        String sex;
        Boolean isVaccineInjected;

        if(judge==1){
            try{
                if(money<100){
                    throw new InsufficientBalanceException(money);
                }
                else{
                    System.out.println("请依次输入你想要购买的小狗的名字，年龄，性别以及疫苗接种情况");
                    Scanner scanner=new Scanner(System.in);
                    name=scanner.next();
                    age=scanner.nextInt();
                    sex= scanner.next();
                    isVaccineInjected=scanner.nextBoolean();
                    Dog dog=new Dog(name,age,sex,isVaccineInjected);
                    animal.add(dog);
                    this.money-=100;
                    this.number++;
                }
            }catch(InsufficientBalanceException e){
                System.out.println("InsufficientBalanceException=>"+e);
            }
        } else if (judge==2) {
            try{
                if(money<200){
                    throw new InsufficientBalanceException(money);
                }
                else{
                    System.out.println("请依次输入你想要购买的小猫的名字，年龄，性别");
                    Scanner scanner=new Scanner(System.in);
                    name=scanner.next();
                    age=scanner.nextInt();
                    sex= scanner.next();
                    Cat cat=new Cat(name,age,sex);
                    animal.add(cat);
                    this.money-=200;
                    this.number++;
                }
            }catch(InsufficientBalanceException e){
                System.out.println("InsufficientBalanceException=>"+e);
            }
        } else if (judge==3) {
            try{
                if(money<300){
                    throw new InsufficientBalanceException(money);
                }
                else{
                    System.out.println("请依次输入你想要购买的小鸟的名字，年龄，性别");
                    Scanner scanner=new Scanner(System.in);
                    name=scanner.next();
                    age=scanner.nextInt();
                    sex= scanner.next();
                    Bird bird=new Bird(name,age,sex);
                    animal.add(bird);
                    this.money-=300;
                    this.number++;
                }
            }catch(InsufficientBalanceException e){
                System.out.println("InsufficientBalanceException=>"+e);
            }
        }
    }

    @Override
    public void reception(Customer name) {
        int n;
        int m;
        customer.add(name.getName());
        try{
            if(this.number==0){
                throw new AnimalNotFoundException(this.number);
            }
            else{
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入你想要列表中的第几只宠物：范围为0-"+(this.number-1)+",以及宠物的种类（小狗：1，小猫：2，小鸟：3）");
                n=scanner.nextInt();
                m=scanner.nextInt();
                System.out.println("购买成功！以下为您的宠物信息：");
                System.out.println(animal.remove(n));
                if(m==1){
                    this.money+=150;
                    this.profit+=50;
                }
                if(m==2){
                    this.money+=260;
                    this.profit+=60;
                }
                if(m==3){
                    this.money+=320;
                    this.profit+=20;
                }
                this.number-=1;
            }
        }catch(AnimalNotFoundException e){
            System.out.println("AnimalNotFoundException=>"+e);
        }

    }

    @Override
    public String toString() {
        return "MyAnimalShop{" +
                "animal=" + animal +
                '}';
    }

    @Override
    public void operation(LocalDateTime localDateTime) {
        int hour;
        hour=localDateTime.getHour();
        if(hour>=17){
            System.out.println("本店今日歇业啦！");
            System.out.println("感谢以下列表中客户的关顾："+customer);
            System.out.println("今日的利润为："+this.profit);
            this.profit=0;
        }else{
            System.out.println("本店仍在营业中！");
        }
    }
}
