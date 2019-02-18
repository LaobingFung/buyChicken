package main.java.fung;

import main.java.fung.service.BuyChicken;
import main.java.fung.service.BuyChickenNotAbstract;

public class Main {
    public static void main(String[] args) {
        BuyChicken.buyChicken(100.0, 100);
        System.out.println("---------------------------------------");
        BuyChickenNotAbstract.buyChicken(100.0, 100);
    }
}
