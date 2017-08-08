package main;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class LaivasImplementation implements Laivas {
    int x, y, laivoDydis;
    Kryptis kryptis;


    public LaivasImplementation(int laivoDydis, int x, int y, Kryptis kryptis) {
        this.laivoDydis = laivoDydis;
        this.x = x;
        this.y = y;
        this.kryptis = kryptis;
    }


    @Override
    public int gautiX() {
        return x;
    }


    @Override
    public int gautiY() {
        return y;
    }


    @Override
    public int gautiDydi() {
        return laivoDydis;
    }
}
