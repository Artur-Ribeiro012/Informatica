
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
        if (saldo>0) {
            System.out.println("A conta tem dinheiro");
        } else {
            if (saldo<0) {
                System.out.print("Conta em débito");
            } else {
                this.setEstado(false);
            }
        }
    }
    public void depositar(float v) {
        if(estado == true) {
            saldo = saldo + v;
        } else {
            System.out.println("Impossível");
        }
    }
    public void sacar(float v) {
        if(estado == true) {
            if(saldo > v) {
                saldo = saldo - v;
            } else {
                System.out.print("Saldo Insuficiente");
            }
        } else {
            System.out.print("Impossível Sacar");
        }
    }
    public void pagarMensal() {
        float valor;
         valor = 0;
         
        if(tipo =="CC") {
            valor = 12;
        } else {
            if(tipo =="CP") {
                valor =20;
            }
            if (estado == true) {
                if(saldo > valor) {
                    saldo = saldo - valor;
                }
            }
        }
    }

    //Métodos Especiais
     public AbrirConta() {
        this.saldo = 0;
        this.estado = false;
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
