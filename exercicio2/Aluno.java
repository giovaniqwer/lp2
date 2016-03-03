public class Aluno {
    String nome, numeroMatricula;
    int idade;
    
    public void imprimirDadosCadastrais(String nome, String numeroMatricula, int idade){
        System.out.println("Nome:" + this.nome + " - Idade:"+ this.idade + " - Matrícula:"+ this.numeroMatricula);
    }

    public static void main(String[] args) {
        Aluno al1 = new Aluno();
        al1.idade = 16;
        al1.nome = "Giovani";
        al1.numeroMatricula = "7777777";
        al1.imprimirDadosCadastrais(al1.nome, al1.numeroMatricula, al1.idade);
    
        Aluno al2 = new Aluno();
        al2.idade = 17;
        al2.nome = "Rafaela";
        al2.numeroMatricula = "111111";
        al2.imprimirDadosCadastrais(al2.nome, al2.numeroMatricula, al2.idade);
        
        Aluno al3 = new Aluno();
        al3.idade = 17;
        al3.nome = "Bruna";
        al3.numeroMatricula = "000000";
        al3.imprimirDadosCadastrais(al3.nome, al3.numeroMatricula, al3.idade);
        
        Aluno al4 = new Aluno();
        al4.idade = 18;
        al4.nome = "Fulaninho";
        al4.numeroMatricula = "092872";
        al4.imprimirDadosCadastrais(al4.nome, al4.numeroMatricula, al4.idade);
    }
}
