package co.edu.uniquindio.poo.model;

public abstract class Envío {
    private final String codigo;
    private final String destinatario;
    private final double peso;

    public Envío(String codigo, String destinatario, double peso) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public double getPeso() {
        return peso;
    }

    public abstract double calcularCosto();
}
