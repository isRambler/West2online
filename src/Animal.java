public abstract class Animal {
    protected String name;
    protected int age;
    protected String sex;
    protected double price;
    public Animal (String name,int age,String sex){
        System.out.println("成功购买了一只名为："+name+",年龄为："+age+",性别为："+sex+"的可爱小动物");
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public abstract String toString();
}
