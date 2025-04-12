package com.example.consumomediodois.veiculo;

public class Veiculo {

    private String modelo;
    private Double consumo; /*p/km */
        
    public Veiculo(String modelo, Double consumo) {
        this.modelo = modelo;
        if(consumo > 0){
            this.consumo = consumo;
        }
        else{
            System.out.println("O consumo do carro está errado!");
        }
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Double getConsumo() {
        return consumo;
    }
    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    } 


    



}
