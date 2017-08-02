package main;

import java.awt.*;
import java.util.Random;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class Aplinka {
    private int laivuSkaicius;


    public int gautiLaivuSkaiciu() {
        return laivuSkaicius;
    }


    public Laivas padetiLaiva(int koordinateX, int koordinateY, int laivoDydis) {
        Laivas naujasLaivas = new Laivas(koordinateX, koordinateY, laivoDydis);
        laivuSkaicius++;
        return naujasLaivas;
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
