import java.time.LocalDate;

public class Customer {
    private String name;
    private int count=0;
    private int month;
    private int today;
    public Customer(String name){
        this.name=name;
        count++;
        LocalDate date=LocalDate.now();
        this.month=date.getMonthValue();
        this.today=date.getDayOfMonth();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ",来访次数为" + count +
                ",来访时间为 month=" + month +
                ",day=" + today +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
