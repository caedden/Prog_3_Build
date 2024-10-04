package Resourses;

import java.util.LinkedList;

public class Pizza {
    private String massa;
    private String tamanho;
    private LinkedList<String>  ingredientes = new LinkedList<>();

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void addIngredientes(String ingredientes){
        this.ingredientes.push(ingredientes);
    }
    @Override
    public String toString(){
    return "Pizza com Massa "+this.massa+", do tamanho "+this.tamanho+ " com os seguintes ingredientes" +this.ingredientes;
        }
}
