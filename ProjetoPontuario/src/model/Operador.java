package model;

public class Operador extends Funcionario{
    private double ValorHora;

    public Operador(){
        
    }
    public Operador(int idFunc, String nome, String email, String documento,double valorHora) {
        super(idFunc, nome, email, documento);
        this.ValorHora = ValorHora;

    }
    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(double valorHora) {
        ValorHora = valorHora;
    }
}
