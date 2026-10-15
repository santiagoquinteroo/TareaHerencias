package co.edu.uniquindio.poo.model;

public class EnvioNacional extends Envío{
    private static final short COSTO_FIJO=6000;
    private static final short COSTO_POR_KILO=2000;
    private static final short ADICION_DOMICILIO=3000;

    private final String ciudadDestino;
    private final boolean entregaDomicilio;

    public EnvioNacional(String codigo, String destinatario, double peso, String ciudadDestino, boolean entregaDomicilio) {
        super(codigo, destinatario, peso);
        this.ciudadDestino = ciudadDestino;
        this.entregaDomicilio = entregaDomicilio;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public boolean isEntregaDomicilio() {
        return entregaDomicilio;
    }

    @Override
    public double calcularCosto() {
        double costo = COSTO_FIJO + (getPeso()*COSTO_POR_KILO);
        if (isEntregaDomicilio()==true){
            costo+=ADICION_DOMICILIO;
        }
        return costo;
    }

}
