package main;

public interface Aplinka {
    /**
     * Metodas skirtas padeti lentoje laiva
     *
     * @param dydis
     * @param x
     * @param y
     * @param kryptis
     * @return null jeigu laivo padėti nepavyko, kitu atveju - padėto laivo objektas
     */
    Laivas padetiLaiva(int dydis, int x, int y, Kryptis kryptis);

    /**
     * Metodas skirtas sužinoti kiek laivų yra priešininko lentoje
     *
     * @return suskaičiuoti laivai
     */
    int gautiLaivuSkaiciu();

    /**
     * Metodas skirtas sužinoti dar nenuskandintų laivų skaičių
     *
     * @return suskaičiuoti laivai
     */
    int gautiGyvuLaivuSkaiciu();

    /**
     * Metodas grąžina lentą, kurioje yra sudėlioti laivai.
     *
     * @return dvimatis masyvas imituojantis lentą
     *      1 2 3 4 5 6 7 8 9 10
     *    1 * * * * * * L L L *
     *    2 * L * * * * * * * *
     *    3 * L * * * * * * * *
     *    4 * L * * * * * * * *
     *    5 * L * * * * L * * *
     *    6 * * * * * * L * * *
     *    7 * * L L L * * * * *
     *    8 * * * * * * * * * *
     *    9 * * * * * * L L L L
     *   10 * * * * * * * * * *
     */
    Laivas[][] gautiLenta();

    /**
     * Metodas šauna į lentą ir patikrina ar šūvis taiklus
     *
     * @param x šūvio x koordinatė
     * @param y šūvio y koordinatė
     * @return true - taiklus, false - netaiklus
     */
    boolean sauti(int x, int y);
}
