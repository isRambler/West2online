public class Bird extends Animal{
    private double price=300.0;
    public Bird(String name,int age,String sex){
        super(name,age,sex);
        System.out.println("啾啾！");
    }
    public String toString(){
        return "这是一只一只名为："+super.name+",年龄为："+super.age+",性别为："+super.sex+",价值为："+this.price+"的鹦鹉";
    }
    public void sing(){
        System.out.println("jojojo");
    }
}
