public class EnvioNacional extends Envio{
    private double iva;



    public EnvioNacional(String codigo, String destino, double peso, double conteBase, double iva) {
        super(codigo, destino, peso, conteBase);
        this.iva = 21;

    }

    public EnvioNacional() {
        }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getCosteTotal(){
        return getCosteTotal() + this.iva;
    }
    @Override
    public String toString() {
        return "Envio nacional " +this.codigo+ " con destino " + this.destino;
    }
}
