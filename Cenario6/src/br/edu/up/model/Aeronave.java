package br.edu.up.model;

public class Aeronave {
    private String codigo;
    private String tipo;
    private int qtdAssentos;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getQtdAssentos() {
        return qtdAssentos;
    }
    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    
}
