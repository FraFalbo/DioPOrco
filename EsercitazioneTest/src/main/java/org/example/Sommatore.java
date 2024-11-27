package org.example;

import java.util.List;

public class Sommatore {

    public int ciao(List<Integer> l ){
        int somma=0;
        for(int i=0;i<l.size();i++){
            somma+= l.get(i);
        }
        return somma;
    }


}
