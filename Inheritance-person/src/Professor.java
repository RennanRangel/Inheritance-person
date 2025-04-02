public class Professor extends Pessoa{


    private String especialidade;
    private float salario;




    public Professor(String name, String especialidade,String sexo,int idade,float salario) {
        super(name, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }




    public String getEspecialidade() {
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public float getSalario() {
        return salario;
    }


    public void setSalario(float salario) {
        this.salario = salario;
    }
    @Override
    public void exibirinformacoes(){
        super.exibirinformacoes();
        System.out.println("Especialidade: "+especialidade);
        System.out.println("Salario: "+salario);
    }
}