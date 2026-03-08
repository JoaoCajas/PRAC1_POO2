package com.example.demo;

public class ConsultorFulltime extends Consultor {

    private double bonoDision;

    public ConsultorFulltime(String nombre, Integer codigo, double sueldo, double bonotienda, double bonoDision) {
        super(nombre, codigo, sueldo, bonotienda);
        this.bonoDision = bonoDision;
    }

    public double getBonoDision() {
        return bonoDision;
    }

    public void setBonoDision(double bonoDision) {
        this.bonoDision = bonoDision;
    }

    public ConsultorFulltime(String nombre, Integer codigo, double sueldo, double bonotienda) {
        super(nombre, codigo, sueldo, bonotienda);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setCodigo(Integer codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public void setSueldo(double sueldo) {
        super.setSueldo(sueldo);
    }

    @Override
    public void setBonotienda(double bonotienda) {
        super.setBonotienda(bonotienda);
    }

    @Override
    public double SueldoFinal() {
        return 0;
    }
}
