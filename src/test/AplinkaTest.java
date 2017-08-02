package test;

import main.AplinkaImplementation;
import main.Kryptis.*;
import main.LaivasImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static main.Kryptis.HORIZONTAL;
import static main.Kryptis.VERTICAL;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class AplinkaTest {
    AplinkaImplementation aplinkaGlobal;


    @Before
    public void pradzia() {
        aplinkaGlobal = new AplinkaImplementation();
    }


    @Test
    public void tikrinameArPradziojeYraNulis() {
        //  padetiLaiva(1, 1, 2 );
        AplinkaImplementation aplinka = new AplinkaImplementation();
        Integer kiekis = aplinka.gautiLaivuSkaiciu();
        Assert.assertTrue(kiekis == 0);
        System.out.println("Hello world");
    }


    @Test
    public void tikrinameArPoPadejimoLaivuYraVienas() {
        AplinkaImplementation aplinka = new AplinkaImplementation();
        aplinka.padetiLaiva(5, 5, 4, VERTICAL);
        Integer kiekis = aplinka.gautiLaivuSkaiciu();
        Assert.assertTrue(kiekis == 1);
    }


    @Test
    public void tikrinameArLaivoDydisDidesnisUzNuli() {
        LaivasImplementation laivas = aplinkaGlobal.padetiLaiva(3, 3, 4, VERTICAL);
        Assert.assertTrue(laivas.gautiDydi() > 0);
    }


    @Test
    public void tikrinameArLaivoDydisNevirsijaMakximalausDydio() {
        LaivasImplementation laivas = aplinkaGlobal.padetiLaiva(3, 3, 4, HORIZONTAL);
        Assert.assertTrue(laivas.gautiDydi() <= 4);
    }


    //sitas namu darbas
    @Test
    public void tikrintiArLaivuiPriskyreXIrYKoordinates() {
        LaivasImplementation laivas = aplinkaGlobal.padetiLaiva(2, 2, 4, VERTICAL);
        Assert.assertTrue(laivas.gautiX() == 2);
        Assert.assertTrue(laivas.gautiY() == 2);
    }


    //sitas namuDarbas
    @Test
    public void tikrinameArPaduotosKoordinatesNeiseinaUzLentosRibu() {

        LaivasImplementation laivas1 = new LaivasImplementation(11, 11, 4, HORIZONTAL);
        LaivasImplementation laivas2 = new LaivasImplementation(4, 4, 4, VERTICAL);
        Assert.assertTrue(laivas1 == null);
        Assert.assertTrue(laivas2 != null);
    }
}
