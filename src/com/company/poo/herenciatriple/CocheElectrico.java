package com.company.poo.herenciatriple;

public class CocheElectrico extends Coche{

    private Double autonomia;

    public CocheElectrico(){}

    public CocheElectrico(Double autonomia, Integer puertas, Integer ruedas){
        super(puertas, ruedas);
        this.autonomia = autonomia;
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "autonomia=" + autonomia +
                ", puertas=" + super.getPuertas() +
                ", ruedas=" + getRuedas() +
                ", ruedas=" + super.getRuedas() +
                //", ruedas=" + super.super.getRuedas() + // no se puede acceder más allá de 1 nivel superior

                '}';
    }
}
