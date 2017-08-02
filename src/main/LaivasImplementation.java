package main;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class LaivasImplementation implements Laivas {
    int koordinateX, koordinateY;
    Kryptis kryptis;
    int getLaivoDydis;
    private int laivoDydis;


    public LaivasImplementation(int koordinateX, int koordinateY, int laivoDydis, Kryptis kryptis) {
        this.laivoDydis = laivoDydis;
        this.koordinateX = koordinateX;
        this.koordinateY = koordinateY;
        this.kryptis=kryptis;


        }



    public boolean tikrinameArLaivasNeperzengiaKoordinaciu() {
        if (koordinateX > 10 || koordinateY > 10) {
            return false;
        } else {
            return true;
        }
    }


    public int gautiDydi() {
        return laivoDydis;
    }


    public int gautiX() {
        return koordinateX;
    }


    public int gautiY() {
        return koordinateY;
    }
}
