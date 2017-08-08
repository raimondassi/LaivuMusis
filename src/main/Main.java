package main;

import java.util.Arrays;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class Main {
    public static void main(String[] args) {
        AplinkaImplementation aplinkaImplementation = new AplinkaImplementation();
        System.out.println(Arrays.deepToString(aplinkaImplementation.lenta));
        /*
        System.out.println(Arrays.deepToString(aplinkaImplementation.lenta));
        aplinkaImplementation.padetiLaiva(4, 6, 6, Kryptis.HORIZONTAL);
        System.out.println(Arrays.deepToString(aplinkaImplementation.lenta));
        aplinkaImplementation.padetiLaiva(2, 3, 3, Kryptis.VERTICAL);
        System.out.println(Arrays.deepToString(aplinkaImplementation.lenta));
        */
    }
}
