package main;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class AplinkaImplementation implements Aplinka {
    int x, y;
    private int laivuSkaicius;
    Laivas laivas;


    @Override
    public Laivas padetiLaiva(int dydis, int x, int y, Kryptis kryptis) {
        LaivasImplementation naujasLaivas = new LaivasImplementation(dydis, x, y, kryptis);
        laivuSkaicius++;
        if (x > 10 || y > 10) {
            naujasLaivas = null;
        }
            return naujasLaivas;

    }


    public boolean tikrinameArLaivasNeperzengiaKoordinaciu() {
        if (x > 10 || y > 10) {
            return false;
        } else {
            return true;
        }
    }


    public int gautiLaivuSkaiciu() {
        return laivuSkaicius;
    }


    @Override
    public int gautiGyvuLaivuSkaiciu() {
        return 0;
    }


    @Override
    public Laivas[][] gautiLenta() {
        return new Laivas[0][];
    }


    @Override
    public boolean sauti(int x, int y) {
        return false;
    }



/*
    public int nustatomeRandominiLaivoDydi(){
        int laivoDysis;
        Random random=new Random();
        laivoDysis=random.;
        return laivoDysis;
    }
 */
}
