package com.example.demo;

public class ConsultorPartime extends Consultor {

    private double ventaMensualSoles;
    private double bonoPorCumplimiento;

    public ConsultorPartime(String nombre, Integer codigo, double sueldo, double bonotienda, double ventaMensualSoles, double bonoPorCumplimiento) {
        super(nombre, codigo, sueldo, bonotienda);
        this.ventaMensualSoles = ventaMensualSoles;
        this.bonoPorCumplimiento = bonoPorCumplimiento;
    }

    public double getVentaMensualSoles() {
        return ventaMensualSoles;
    }

    public void setVentaMensualSoles(double ventaMensualSoles) {
        this.ventaMensualSoles = ventaMensualSoles;
    }

    public double getBonoPorCumplimiento() {
        return bonoPorCumplimiento;
    }

    public void setBonoPorCumplimiento(double bonoPorCumplimiento) {
        this.bonoPorCumplimiento = bonoPorCumplimiento;
    }

    public ConsultorPartime(String nombre, Integer codigo, double sueldo, double bonotienda) {
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
        return getSueldo() + (getVentaMensualSoles() + getBonoPorCumplimiento());
    }

}
