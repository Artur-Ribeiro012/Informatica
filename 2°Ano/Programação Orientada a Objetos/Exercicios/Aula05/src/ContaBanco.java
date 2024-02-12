
public class ContaBanco {
   //Atributos
   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;
   //Métodos Personalizados

   public void estadoAtual() {
        System.out.println("----------------------------------------------------");
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
   }

   public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
            System.out.println("Conta aberta com sucesso");
        } else {
            if(t == "CP") {
                this.setSaldo(150);
                System.out.println("Conta aberta com sucesso");
            }
        }
   }
   public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinherio");
        } else {
            if (this.getSaldo() < 0) {
                System.out.println("A conta não pode ser Fechada pois tem debito");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com Sucesso");
            }
        }
   }
   public void depositar(float v) {
        if(this.getStatus()) {
            //this.saldo = this.saldo +v;
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Deposíto realizado com sucesso na conta de "+this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
   }
   public void sacar(float v) {
        if(this.getStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() -v);
                System.out.println("Saque realizado na conta de "+ this.getDono()); 
            } else {
                System.out.println("Saldo insuficeinte para saque");
            }
        } else {
            System.out.println("Impossivel sacar em uma conta fechada");
        }
   }
   public void pagarMensal() {
        int v;
        v = 0;
        if(this.getTipo() == "CC") {
            v = 12;
        } else {
            if(this.getTipo() == "CP") {
                v = 20;
            }
        }
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidadade paga com sucesso por "+this.getDono());
        } else {
            System.out.println("Impossivell pagar com uma conta fechada");
        }
   }
   //Métods Especiais
   public ContaBanco() {
        this.saldo = 0;
        this.status= false;
   }
   public void setTipo(String tipo) {
       this.tipo = tipo;
   }
   public void setStatus(boolean status) {
       this.status = status;
   }
   public void setSaldo(float saldo) {
       this.saldo = saldo;
   }
   public void setNumConta(int n) {
       this.numConta = n;
   }
   public void setDono(String dono) {
       this.dono = dono;
   }
   public boolean getStatus() {
       return this.status;
   }
   public String getTipo() {
       return this.tipo;
   }
   public float getSaldo() {
       return this.saldo;
   }
   public int getNumConta() {
       return this.numConta;
   }
   public String getDono() {
       return this.dono;
   }
}
