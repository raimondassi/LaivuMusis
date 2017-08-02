package main;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class Laivas {
    int koordinateX, koordinateY;
    int getLaivoDydis;
    private int laivoDydis;
    Laivas laivas;


    public Laivas(int koordinateX, int koordinateY, int laivoDydis) {
        this.laivoDydis = laivoDydis;
        this.koordinateX = koordinateX;
        this.koordinateY = koordinateY;
        if (tikrinameArLaivasNeperzengiaKoordinaciu() == false) {
            laivas = null;
            // return null;
        }
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
