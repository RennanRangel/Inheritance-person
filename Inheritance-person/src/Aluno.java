public class Aluno extends Pessoa{


    private String curso;
    private int materias;


    public Aluno(String name,int idade,String sexo,String curso,int materia){
        super(name, idade, sexo);
        this.curso = curso;
        this.materias = materia;
    }


    public int getMaterias() {
        return materias;
    }


    public void setMaterias(int materia) {
        this.materias = materia;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void exibirinformacoes(){
        super.exibirinformacoes();
        System.out.println("Nome do Curso:"+curso);
        System.out.println("Quantas materias terão:"+materias);
    }
}