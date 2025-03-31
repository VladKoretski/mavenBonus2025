import org.example.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceParameterizedTest {

    @ParameterizedTest
    @CsvSource(value = {"1000,false,10","100000,true,500","1000000,false,500"})
    public void BonusServiceTest(int amount, boolean ifRegistered, int expected) {
        BonusService bonusService = new BonusService();
        int actual = bonusService.calcBonus(amount,ifRegistered);
        Assertions.assertEquals(expected,actual);
    }
}
