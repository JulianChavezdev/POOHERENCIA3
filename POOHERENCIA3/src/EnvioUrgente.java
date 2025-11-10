public class EnvioUrgente extends Envio{
    private double recargo;

    public EnvioUrgente() {
    }

    public EnvioUrgente(String codigo, String destino, double peso, double costeBase, double recargo) {
        super(codigo, destino, peso, costeBase);
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
    public double getCosteTotal(){
        return this.getCosteBase() + this.recargo;
    }
    @Override
    public String toString() {
        return "Envio Urgente " +this.codigo+ " con destino " +this.destino;
    }
}
