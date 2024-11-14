package model;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Entrada> entradas;

    public Pedido(){
        this.entradas = new ArrayList<Entrada>();
    }

    public void adicionaEntrada(Entrada entrada){
        entradas.add(entrada);
    }

    public double calculaValorTotal(){
        return 0.0f;
    }
}
