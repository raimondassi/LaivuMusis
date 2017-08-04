package main;

/**
 * Created by Raimondas on 2017.07.31.
 */
public class AplinkaImplementation implements Aplinka {
    int x, y, laivoDydis;
    int laivuSkaicius;
    Laivas[][] laivas;
    Kryptis kryptis;
    int gyvuLaivuSkaicius;
    String[][] lenta;


    public AplinkaImplementation() {
        String[][] lenta = new String[11][11];
        int stulpelioSkaicius = 0, eilutesSkaicius = 0;
        for (int i = 0; i <= 10; i++) {
            for (int k = 0; k <= 10; k++) {
                if (i == 0 && k == 0) {
                    lenta[i][k] = "";
                }
                if (i == 0 && k != 0) {
                    stulpelioSkaicius++;
                    lenta[i][k] = String.valueOf(stulpelioSkaicius);
                }
                if (i != 0 && k == 0) {
                    eilutesSkaicius++;
                    lenta[i][k] = String.valueOf(eilutesSkaicius);
                }
                if (i != 0 && k != 0) {
                    lenta[i][k] = "*";
                }
            }
        }
        this.lenta = lenta;
    }


    @Override
    public LaivasImplementation padetiLaiva(int laivoDydis, int x, int y, Kryptis kryptis) {
        this.laivoDydis = laivoDydis;
        this.x = x;
        this.y = y;
        this.kryptis = kryptis;
        LaivasImplementation naujasLaivas = new LaivasImplementation(laivoDydis, x, y, kryptis);
        if (tikrinameArLaivasPerzengiaZaidimoLenta() == true) {
            laivas = null;
        }
        if (laivas != null) {
            laivuSkaicius++;
        }
        ipiesiameLaivaILenta();
        return naujasLaivas;
    }


    public String[][] ipiesiameLaivaILenta() {
        if (kryptis == Kryptis.HORIZONTAL) {
            int ilgis = laivoDydis;
            for (int i = 0; i < ilgis; i++) {
                lenta[x][y] = "L";
                x--;
            }
        }
        if (kryptis == Kryptis.VERTICAL) {
            int ilgis = laivoDydis;
            for (int i = 0; i < ilgis; i++) {
                lenta[x][y] = "L";
                y--;
            }
        }
        return lenta;
    }


    public String[][] tikrinameArLaivaiNesusikerta() {
        return lenta;
    }


    public boolean tikrinameArLaivasPerzengiaZaidimoLenta() {
        if (x > 10 || y > 10) {
            return true;
        }
        if (x < 0 || y < 0) {
            return true;
        }
        if (kryptis == Kryptis.HORIZONTAL && (x + laivoDydis) > 10) {
            return true;
        }
        if (kryptis == Kryptis.HORIZONTAL && (x + laivoDydis) < 1) {
            return true;
        }
        if (kryptis == Kryptis.VERTICAL && (y + laivoDydis) > 10) {
            return true;
        }
        if (kryptis == Kryptis.VERTICAL && (y + laivoDydis) < 1) {
            return true;
        } else {
            return false;
        }
    }


    public int gautiLaivuSkaiciu() {
        return laivuSkaicius;
    }

////////laivus gal saugoti kazkaip kaip arskirus araay su reiksmemis????
    @Override
    public int gautiGyvuLaivuSkaiciu() {
        return gyvuLaivuSkaicius;
    }

/////////////////?
    @Override
    public Laivas[][] gautiLenta() {
        return new Laivas[0][];
    }


    @Override
    public boolean sauti(int x, int y) {
        boolean arPataikeme = false;
        if (lenta[x][y] == "L") {
            lenta[x][y] = "*";
            arPataikeme = true;
        }
        return arPataikeme;
    }
}
