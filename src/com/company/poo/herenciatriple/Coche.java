package com.company.poo.herenciatriple;

public class Coche extends Vehiculo{

    private Integer puertas;

    public Coche(){}

    public Coche(Integer puertas, Integer ruedas){
        super(ruedas);
        this.puertas = puertas;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }
}
