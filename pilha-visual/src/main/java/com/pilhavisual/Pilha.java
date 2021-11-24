package com.pilhavisual;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Collections;

public class Pilha<E> {
    private final int size;
    private int topo;
    private E[] info;

    public Pilha (int tam) {
        if (tam>0)
            size=tam;
        else
            size=10;
        topo=-1;

        info = (E[]) new Object[size];
    }

    public Pilha() {
        this(10);
    }

    public void push (E valor) {
        if (topo == size-1)
            throw new PilhaCheiaExcecao();
        info[++ topo] = valor;
    }

    public E pop() {
        if (topo==-1)
            throw new PilhaVaziaExcecao();
        return info[topo--];
    }

    public String imprimi() {
        ArrayList aList = new ArrayList();

        int i;
        String aux = "";
        for(i=0;i<topo+1;i++){
            aList.add(info[i]);
        }
        Collections.reverse(aList);
        for(i=0;i<aList.size();i++){
            aux += aList.get(i) + "\n";
        }
        return aux;
    }
}

class PilhaCheiaExcecao extends RuntimeException {
    public PilhaCheiaExcecao(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("-");
        alert.setHeaderText("Erro ao empilhar");
        alert.setContentText("Sua pilha está CHEIA, não foi possível realizar a ação de empilhar.");
        alert.showAndWait();
    }
}

class PilhaVaziaExcecao extends RuntimeException {
    public PilhaVaziaExcecao(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("-");
        alert.setHeaderText("Erro ao desempilhar");
        alert.setContentText("Sua pilha está VAZIA, não foi possível realizar a ação de desempilhar.");
        alert.showAndWait();
    }
}