
public class AbrirConta {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean estado;
    private float saldo;

    //métodos

    public void AbrirConta(String t) {
        this.setTipo(t);
        this.setEstado(true);
        if (t == "CC") {
            this.setSaldo(50); 
        } else {
            this.saldo = 150; 
        }
    }

    public void fecharConta() {

    }
    public void depositar() {

    }
    public void sacar() {
        
    }
    public void pagarMensal() {

    }

    //Métodos Especiais
     public AbrirConta() {
        saldo = 0;
        estado = false;
    } 
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }
    public String getDono() {
        return dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean getEstado() {
        return estado;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }

}
