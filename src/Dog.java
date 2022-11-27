public class Dog extends Animal{
    private boolean isVaccineInjected;
    private double price=100.0;
    public Dog(String name,int age,String sex,Boolean isVaccineInjected){
        super(name,age,sex);
        System.out.println("汪汪！");
    }
    public String toString(){
        return "这是一只一只名为："+super.name+",年龄为："+super.age+",性别为："+super.sex+",价值为："+this.price+"的中华田园犬";
    }
}
