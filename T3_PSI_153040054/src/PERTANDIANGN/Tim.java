/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTANDIANGN;

public class Tim {

    private String namaTim;
    private int gamePlay;
    private int skoMenang;
    private int sokrSeri;
    private int skorKalah;
    private int poinSementara;

    public Tim() {
    }

    public Tim(String namaTim, int gamePlay, int skorMenang, int skorSeri, int skorKalah, int poinSementara) {
        this.namaTim = namaTim;
        this.gamePlay = gamePlay;
        this.skoMenang = skorMenang;
        this.sokrSeri = skorSeri;
        this.skorKalah = skorKalah;
        this.poinSementara = poinSementara;
    }

    public String getNamaTim() {
        return namaTim;
    }

    public void setNamaTim(String namaTim) {
        this.namaTim = namaTim;
    }

    public int getGamePlay() {
        return gamePlay;
    }

    public void setGamePlay(int score) {
        this.gamePlay = score;
    }

    public int getSkoMenang() {
        return skoMenang;
    }

    public void setSkoMenang(int skoMenang) {
        this.skoMenang = skoMenang;
    }

    public int getSokrSeri() {
        return sokrSeri;
    }

    public void setSokrSeri(int sokrSeri) {
        this.sokrSeri = sokrSeri;
    }

    public int getSkorKalah() {
        return skorKalah;
    }

    public void setSkorKalah(int skorKalah) {
        this.skorKalah = skorKalah;
    }

    public int getPoinSementara() {
        return poinSementara;
    }

    public void setPoinSementara(int poinSementara) {
        this.poinSementara = poinSementara;
    }
}
