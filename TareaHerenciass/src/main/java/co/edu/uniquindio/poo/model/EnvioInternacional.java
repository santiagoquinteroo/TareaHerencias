package co.edu.uniquindio.poo.model;

public class EnvioInternacional extends Envío{
    private static final short COSTO_FIJO=15000;
    private static final short COSTO_KILO=9000;
    private static final short ADICION_SEGURO=20000;

    private final String paisDestino;
    private final boolean necesitaSeguro;

    public EnvioInternacional(String codigo, String destinatario, double peso,
                              String paisDestino, boolean necesitaSeguro) {
        super(codigo, destinatario, peso);
        this.paisDestino = paisDestino;
        this.necesitaSeguro = necesitaSeguro;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public boolean isNecesitaSeguro() {
        return necesitaSeguro;
    }

    @Override
    public double calcularCosto() {
    double costo = COSTO_FIJO + (getPeso()*COSTO_KILO);
    if (isNecesitaSeguro()==true){
            costo += ADICION_SEGURO;
        }
    return costo;
    }
}
