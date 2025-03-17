package org.example;


public class BonusService {

    float BONUS_IF_REGISTERED = 0.05F;
    float BONUS_IF_NOT_REGISTERED = 0.01F;
    public static final int MAX_BONUS_AMOUNT = 500;

    public int calcBonus(int amount, boolean ifRegistered) {

        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        int bonusValue;
        if (ifRegistered) {
            bonusValue = (int) (amount * BONUS_IF_REGISTERED);
        } else bonusValue = (int) (amount * BONUS_IF_NOT_REGISTERED);

        if (bonusValue > MAX_BONUS_AMOUNT) {
            bonusValue = MAX_BONUS_AMOUNT;
        }

        return bonusValue;
    }
}