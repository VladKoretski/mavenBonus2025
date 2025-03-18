import org.example.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void testRegisteredUnderLimit() {
        BonusService bonusCalculation = new BonusService();
        int expected = 250;
        int actual = bonusCalculation.calcBonus(5_000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnRegisteredUnderLimit() {
        BonusService bonusCalculation = new BonusService();
        int expected = 150; ///50
        int actual = bonusCalculation.calcBonus(5_000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNegativeAmountShouldThrowException() {
        int amount = -100;
        boolean isRegistered = true;
        BonusService bonusCalculation = new BonusService();

        // Ожидание исключения IllegalArgumentException при передаче отрицательной суммы
        Assertions.assertThrows(IllegalArgumentException.class, () -> bonusCalculation.calcBonus(amount, isRegistered));
    }

  /*  @Test
    public void testUnRegisteredOverLimit() {
        BonusService bonusCalculation = new BonusService();
        int actual = bonusCalculation.calcBonus(100_000, false);
        Assertions.assertEquals(BonusService.MAX_BONUS_AMOUNT, actual);
    }

    @Test
    public void testRegisteredOverLimit() {
        BonusService bonusCalculation = new BonusService();
        int actual = bonusCalculation.calcBonus(100_000, true);
        Assertions.assertEquals(BonusService.MAX_BONUS_AMOUNT, actual);

    }*/
}
