package main;

import java.util.Arrays;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class Main {
    public static void main(String[] args) {

      AplinkaImplementation aplinkaImplementation=new AplinkaImplementation();
        aplinkaImplementation.padetiLaiva(4,6,6,Kryptis.HORIZONTAL);


//kaip atspausdinti array kaip lentele
        System.out.println(Arrays.deepToString(aplinkaImplementation.lenta));
    }

}
