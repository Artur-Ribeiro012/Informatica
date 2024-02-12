package aula11;
public class Aula11 {
    public static void main(String[] args) {
    /*  Visitante v1 = new Visitante();
      v1.setNome("Juvenal");
      v1.setIdade(22);
      v1.setSexo("M");
      v1.fazerAniversario();
      System.out.println(v1.toString()); */
      
      Aluno a1 = new Aluno();
      a1.setNome("Cláudio");
      a1.setMatricula(11111);
      a1.setCurso("Infomática");
      a1.setIdade(16);
      a1.setSexo("M");
      a1.pagarMensalidade();
      Bolsista b1 = new Bolsista();
      b1.setMatricula(2222);
      b1.setNome("João");
      b1.setBolsa(12.5f);
      b1.pagarMensalidade();
    }
    
}
