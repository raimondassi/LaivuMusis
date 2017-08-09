package main;

import org.omg.IOP.ExceptionDetailMessage;

import java.beans.ExceptionListener;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class AplinkaImplementation implements Aplinka {
    int laivoDydis, x, y;
    int laivuSkaicius;
    Laivas[][] lenta;
    Kryptis kryptis;
    int gyvuLaivuSkaicius;
    Laivas laivas;
    int keturvieciuLaivuKiekis;
    int trivieciuLaivuKiekis;
    int dvivieciuLaivuKiekis;


    public AplinkaImplementation() {
        Laivas[][] lenta = new Laivas[10][10];
        this.lenta = lenta;
    }


    @Override
    public LaivasImplementation padetiLaiva(int laivoDydis, int x, int y, Kryptis kryptis) {
        this.laivoDydis = laivoDydis;
        this.x = x;
        this.y = y;
        this.kryptis = kryptis;
        boolean arPavykoPadetiLaiva = false;
        if (kryptis == Kryptis.HORIZONTAL) {
            if (tikrinameArLaivaiSusikerta() && tikrinameArBandomeLaivaPadetiUzLentosRibu() == false) {
                try {
                    for (int i = 0; i < laivoDydis; i++) {
                        lenta[x][y] = laivas;
                        x++;
                        arPavykoPadetiLaiva = true;
                    }}
                 catch (ArrayIndexOutOfBoundsException e) {
                    arPavykoPadetiLaiva = false;
                    System.out.println("Laivo padeti nepavyko: laivas uzeina uz lentos ribu");
                }
            }
            if (arPavykoPadetiLaiva = true) {
                laivuSkaicius++;
            } else System.out.println("Laiva dedate uz lentos ribu arba keli laivai kertasi");
        }
        return padetiLaiva(laivoDydis, x, y, kryptis);
    }


    public boolean tikrinameArLaivaiSusikerta() {
        if (lenta[x][y] != laivas) {
            return true;
        } else return false;
    }


    public boolean tikrinameArBandomeLaivaPadetiUzLentosRibu() {
        if (x > 10 || x < 0 || y > 10 || y < 0) {
            return true;
        } else return false;
    }


    public boolean patikrinameArLaivasUzeinaUzLentosRibu() {
        return false;
    }


    @Override
    public int gautiLaivuSkaiciu() {
        return 0;
    }


    @Override
    public int gautiGyvuLaivuSkaiciu() {
        return gyvuLaivuSkaicius;
    }


    @Override
    public Laivas[][] gautiLenta() {
        return lenta;
    }


    @Override
    public boolean sauti(int x, int y) {
        boolean arPataikeme = false;
        if (lenta[x][y] != null) {
            lenta[x][y] = null;
            arPataikeme = true;
        }
        return arPataikeme;
    }
}
