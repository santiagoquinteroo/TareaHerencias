package co.edu.uniquindio.poo.model;

public class EnvioExpres extends EnvioNacional{
    private static final double INCREMENTO = 0.30;
    private static final int ADICION_24HRS = 5000;

    private int horasMaximas;

    public EnvioExpres(String codigo, String destinatario, double peso, String ciudadDestino,
                       boolean entregaDomicilio, int horasMaximas) {
        super(codigo, destinatario, peso, ciudadDestino, entregaDomicilio);
        this.horasMaximas = horasMaximas;
    }

    public int getHorasMaximas() {
        return horasMaximas;
    }

    public void setHorasMaximas(int horasMaximas) {
        this.horasMaximas = horasMaximas;
    }

    @Override
    public double calcularCosto() {
        double costo = super.calcularCosto() + (super.calcularCosto()*INCREMENTO);
        if (horasMaximas<=24){
            costo+=5000;

        }
        return costo;

    }
}
