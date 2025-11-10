public class EnvioUrgente extends Envio{
    private double recargo;

    public EnvioUrgente() {
    }

    public EnvioUrgente(String codigo, String destino, double peso, double conteBase, double recargo) {
        super(codigo, destino, peso, conteBase);
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
    public double getCosteTotal(){
        return getCosteTotal() + (this.getCosteBase()+this.recargo/100);
    }
    @Override
    public String toString() {
        return "Envio Urgente " +this.codigo+ " con destino " +this.destino;
    }
}
