package main.java.fung.service;

import main.java.fung.model.Chick;
import main.java.fung.model.Hen;
import main.java.fung.model.Rooster;

public class BuyChicken {
    private static Rooster rooster = new Rooster();
    private static Hen hen = new Hen();
    private static Chick chick = new Chick();

    public static void buyChicken(double cost, int total) {
        for (int i = 0; i <= cost / rooster.getPrice(); i++) {
            for (int j = 0; j <= cost / hen.getPrice(); j++) {
                int k = total - i - j;
                if ((i * rooster.getPrice() + j * hen.getPrice() + k * chick.getPrice()) == cost) {
                    System.out.println("方案：" + i + "只公鸡" + j + "只母鸡" + k + "只小鸡");
                }
            }
        }
    }
}
