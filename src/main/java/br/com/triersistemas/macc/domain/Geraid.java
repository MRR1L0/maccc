package br.com.triersistemas.macc.domain;

import java.util.SplittableRandom;

public class Geraid {
    private int id;

    public Geraid() {
        this.id = gerarId();
    }

    private int gerarId(){
        var rd = new SplittableRandom();
        int id = rd.nextInt();
        return id;
    }
}
