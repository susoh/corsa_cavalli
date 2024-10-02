package com.example;

public class MioThread extends Thread {
    private int l;
    private int v;

    public MioThread(int lunghezza){
        l = lunghezza;
        this.v = 0; 
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void run() {
        for (int i = 0; i < l; i++){
            v++;
        }
    }
}
