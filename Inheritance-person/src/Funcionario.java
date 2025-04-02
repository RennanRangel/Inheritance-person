public class Funcionario extends Pessoa{


    private String setor;
    private String trabalhando;


    public Funcionario(String name,String setor,String sexo,int idade,String trabalhando){
        super(name,idade,sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }


    public String getTrabalhando() {
        return trabalhando;
    }


    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }


    public String getSetor() {
        return setor;
    }


    public void setSetor(String setor) {
        this.setor = setor;
    }
    @Override
    public void exibirinformacoes(){
        super.exibirinformacoes();
        System.out.println("Qual o setor:"+setor);
        System.out.println("Voce esta trabalho no momento? "+trabalhando);
    }
}