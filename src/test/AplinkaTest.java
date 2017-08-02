package test;

import main.Aplinka;
import main.Laivas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class AplinkaTest {
    Aplinka aplinkaGlobal;


    @Before
    public void pradzia() {
        aplinkaGlobal = new Aplinka();
    }


    @Test
    public void tikrinameArPradziojeYraNulis() {
        //  padetiLaiva(1, 1, 2 );
        Aplinka aplinka = new Aplinka();
        Integer kiekis = aplinka.gautiLaivuSkaiciu();
        Assert.assertTrue(kiekis == 0);
        System.out.println("Hello world");
    }


    @Test
    public void tikrinameArPoPadejimoLaivuYraVienas() {
        Aplinka aplinka = new Aplinka();
        aplinka.padetiLaiva(5, 5, 4);
        Integer kiekis = aplinka.gautiLaivuSkaiciu();
        Assert.assertTrue(kiekis == 1);
    }


    @Test
    public void tikrinameArLaivoDydisDidesnisUzNuli() {
        Laivas laivas = aplinkaGlobal.padetiLaiva(3, 3, 4);
        Assert.assertTrue(laivas.gautiDydi() > 0);
    }


    @Test
    public void tikrinameArLaivoDydisNevirsijaMakximalausDydio() {
        Laivas laivas = aplinkaGlobal.padetiLaiva(3, 3, 4);
        Assert.assertTrue(laivas.gautiDydi() <= 4);
    }


    //sitas namu darbas
    @Test
    public void tikrintiArLaivuiPriskyreXIrYKoordinates() {
        Laivas laivas = aplinkaGlobal.padetiLaiva(2, 2, 4);
        Assert.assertTrue(laivas.gautiX() == 2);
        Assert.assertTrue(laivas.gautiY() == 2);
    }


    //sitas namuDarbas
    @Test
    public void tikrinameArPaduotosKoordinatesNeiseinaUzLentosRibu() {
        Laivas laivas1 = new Laivas(11, 11, 4);
        Laivas laivas2 = new Laivas(4, 4, 4);
        Assert.assertTrue(laivas1 == null);
        Assert.assertTrue(laivas2 != null);
    }
}
