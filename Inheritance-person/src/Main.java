public class Main {
    public static void main(String[] args) {


        Aluno aluno = new Aluno("Rennan", 19,"M","Desenvolvimento de Sistemas",6);
        aluno.exibirinformacoes();
        System.out.println("\n");


        Professor professor = new Professor("Rennan", "Professor de Matematica","M",19,5400);
        professor.exibirinformacoes();
        System.out.println("\n");


        Funcionario funcionario = new Funcionario("Rennan", "Tecnologia","M",19, "Sim");
        funcionario.exibirinformacoes();




    }


}