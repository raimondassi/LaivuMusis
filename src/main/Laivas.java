package main;

import java.awt.*;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class Laivas {
    int koordinateX, koordinateY;
    int getLaivoDydis;
    private int laivoDydis;


    public Laivas(int koordinateX, int koordinateY, int laivoDydis) {
        this.laivoDydis = laivoDydis;
        this.koordinateX = koordinateX;
        this.koordinateY = koordinateY;
        tikrinameArLaivasNeperzengiaKoordinaciu();
    }


    public Laivas tikrinameArLaivasNeperzengiaKoordinaciu() {
        if (koordinateX > 10 || koordinateY > 10) {
        }
        return null;
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
