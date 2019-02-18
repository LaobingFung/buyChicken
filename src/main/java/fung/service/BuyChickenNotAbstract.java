package main.java.fung.service;

import main.java.fung.model.ChickenNotAbstract;

public class BuyChickenNotAbstract {
    private static ChickenNotAbstract rooster = new ChickenNotAbstract(5.0);
    private static ChickenNotAbstract hen = new ChickenNotAbstract(3.0);
    private static ChickenNotAbstract chick = new ChickenNotAbstract(1/3.0);

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
