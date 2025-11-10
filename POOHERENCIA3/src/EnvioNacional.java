public class EnvioNacional extends Envio{
    private double iva;



    public EnvioNacional(String codigo, String destino, double peso, double conteBase, double iva) {
        super(codigo, destino, peso, conteBase);
        this.iva = iva;

    }

    public EnvioNacional() {
        }
    public EnvioNacional(String codigo, String destino, double peso, double conteBase ) {
        super(codigo, destino, peso, conteBase);
        this.iva = 21;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getCosteTotal(){
        return this.getCosteBase() + (this.getCosteBase() +this.iva/100);
    }

    @Override
    public String toString() {
        return "Envio nacional " +this.codigo+ " con destino " + this.destino;
    }
}
