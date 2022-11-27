public class Cat extends Animal{
    private double price=200.0;
    public Cat(String name,int age,String sex){
        super(name,age,sex);
        System.out.println("喵喵！");
    }
    public String toString(){
        return "这是一只一只名为："+super.name+",年龄为："+super.age+",性别为："+super.sex+",价值为："+this.price+"的猫猫";
    }

}
