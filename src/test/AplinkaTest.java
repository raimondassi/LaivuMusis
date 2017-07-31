package test;

import main.Aplinka;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Raimondas on 2017.07.31.
 */
public class AplinkaTest {

    @Before
    public void pradzia() {
        Aplinka aplinkaGlobal = new Aplinka();
    }


    @Test
    public void tikrinameArPradziojeYraNulis() {
        //  padetiLaiva(1, 1, 2 );
        Aplinka aplinka = new Aplinka();
        Integer kiekis = aplinka.gautiLaivuSkaiciu();
        Assert.assertTrue(kiekis == 0);
        System.out.println("Hello world");
    }


    public void tikrinameArPoPadejimoLaivuYraVienas() {
        Aplinka aplinka = new Aplinka();
        aplinka.padetiLaiva();
        Integer kiekis = aplinka.gautiLaivuSkaiciu();
        Assert.assertTrue(kiekis == 1);
    }
}
