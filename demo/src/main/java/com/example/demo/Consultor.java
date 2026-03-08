package com.example.demo;

public abstract class Consultor {

    private String nombre;
    private Integer codigo;
    private double sueldo;
    private double bonotienda;

    public Consultor(String nombre, Integer codigo, double sueldo, double bonotienda) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.sueldo = sueldo;
        this.bonotienda = bonotienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getBonotienda() {
        return bonotienda;
    }

    public void setBonotienda(double bonotienda) {
        this.bonotienda = bonotienda;
    }

    @Override
    public String toString() {
        return "Consultor{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", sueldo=" + sueldo +
                ", bonotienda=" + bonotienda +
                '}';
    }

    public abstract double SueldoFinal();
}
