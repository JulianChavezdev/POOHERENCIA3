public class Envio {
    protected String codigo;
    protected String destino;
    private double peso;
    private double costeBase;

    public Envio(String codigo, String destino, double peso, double conteBase) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.costeBase = conteBase;
    }

    public Envio() {
    }

    public double getCosteTotal() {
        return this.costeBase;
    }

    public boolean esPesado(){
        return this.peso >= 10 ;
    }

    @Override
    public String toString() {
        return "Envio " +this.codigo + " con destino " +this.destino;
    }

}
