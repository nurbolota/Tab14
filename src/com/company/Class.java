package com.company;

import java.util.Arrays;

public class Class {
    private int nomer;
    private String soz;
    private int[] masiv;

    public Class(int nomer, String soz, int[] masiv) {
        this.nomer = nomer;
        this.soz = soz;
        this.masiv = masiv;
    }
    private Class() {
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMasiv() {
        return masiv;
    }

    public void setMasiv(int[] masiv) {
        this.masiv = masiv;
    }

    @Override
    public String toString() {
        return "Class{" +
                "nomer=" + nomer +
                ", soz='" + soz + '\'' +
                ", masiv=" + Arrays.toString(masiv) +
                '}';
    }
}
