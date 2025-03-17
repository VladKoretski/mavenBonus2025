package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusService bonusesToBeReturned = new BonusService();
        int bonus = bonusesToBeReturned.calcBonus(5_000, true);
        System.out.println(bonus);

        bonus = bonusesToBeReturned.calcBonus(5_000, false);
        System.out.println(bonus);

        int expected = 250;
        int actual = bonusesToBeReturned.calcBonus(5_000, true);

        System.out.println(expected + " is equal to " + actual + " !?");

        actual = bonusesToBeReturned.calcBonus(-5_000, true);
    }
}