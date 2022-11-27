import java.time.LocalDate;
import java.time.LocalDateTime;

public interface AnimalShop {
    void buy(int judge);
    void reception(Customer name);
    void operation(LocalDateTime localDateTime);
}
