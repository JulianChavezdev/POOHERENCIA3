public class EnvioInternacional extends Envio {
    private double tasaAduanas;
    private String paisDestino;

    public EnvioInternacional(String codigo, String destino, double peso, double conteBase, double tasaAduanas, String paisDestino) {
        super(codigo, destino, peso, conteBase);
        this.tasaAduanas = tasaAduanas;
        this.paisDestino = paisDestino;
    }

    public EnvioInternacional() {
    }

    public double getTasaAduanas() {
        return tasaAduanas;
    }

    public void setTasaAduanas(double tasaAduanas) {
        this.tasaAduanas = tasaAduanas;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public double getCosteTotal(){
        return getCosteBase()+ (getCosteBase()+this.tasaAduanas/100);
    }
    @Override
    public String toString() {
        return "Envio Internacional " +this.codigo+ " con destino " +this.destino +" ( " +this.paisDestino+ " ( ";
    }
}
