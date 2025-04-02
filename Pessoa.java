public class Pessoa {


 private String name;
 private int idade;
 private String sexo;






  public  Pessoa(String name,int idade,String sexo){
     this.name = name;
     this.idade = idade;
     this.sexo = sexo;
  }




   public void setName(String name) {
      this.name = name;
  }


   public String getName() {
       return name;
   }


   public String getSexo() {
       return sexo;
   }


   public void setSexo(String sexo) {
       this.sexo = sexo;
   }


   public int getIdade() {
       return idade;
   }


   public void setIdade(int idade) {
       this.idade = idade;
   }






 public void exibirinformacoes(){
     System.out.println("Nome:" + name);
     System.out.println("Idade: " + idade);
     System.out.println("Sexo: " +sexo);
 }


}
