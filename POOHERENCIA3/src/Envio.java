public class Envio {
    protected String codigo;
    protected String destino;
    private double peso;
    private double costeBase;

    public Envio(String codigo, String destino, double peso, double conteBase) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.costeBase = costeBase;
    }

    public Envio() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCosteBase() {
        return costeBase;
    }

    public void setCosteBase(double costeBase) {
        this.costeBase = costeBase;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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
