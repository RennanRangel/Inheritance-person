# Sistema de Pessoas em Java

Este projeto em Java demonstra conceitos de **Programação Orientada a Objetos (POO)** como **herança, encapsulamento e polimorfismo**.  
A ideia é modelar diferentes tipos de pessoas (Aluno, Professor e Funcionário), cada uma com suas características e comportamentos próprios.  

---

## 🛠 Estrutura do Projeto

### **Classe `Pessoa` (superclasse)**
- Atributos:
  - `nome`
  - `idade`
  - `sexo`
- Métodos:
  - Getters e setters
  - `exibirInformacoes()` → exibe os dados básicos da pessoa

---

### **Classe `Aluno` (subclasse de Pessoa)**
- Atributos extras:
  - `curso`
  - `materias`
- Métodos:
  - Getters e setters
  - Sobrescreve `exibirInformacoes()` → mostra também curso e quantidade de matérias

---

### **Classe `Professor` (subclasse de Pessoa)**
- Atributos extras:
  - `especialidade`
  - `salario`
- Métodos:
  - Getters e setters
  - Sobrescreve `exibirInformacoes()` → mostra também especialidade e salário

---

### **Classe `Funcionario` (subclasse de Pessoa)**
- Atributos extras:
  - `setor`
  - `trabalhando`
- Métodos:
  - Getters e setters
  - Sobrescreve `exibirInformacoes()` → mostra também setor e se está trabalhando

---

### **Classe `Main`**
- Executa o programa:
  - Cria um `Aluno`, `Professor` e `Funcionario`
  - Exibe suas informações no console

---

##  Exemplo de Uso

### Código:
```java
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rennan", 19, "M", "Desenvolvimento de Sistemas", 6);
        aluno.exibirinformacoes();
        System.out.println();

        Professor professor = new Professor("Rennan", "Professor de Matemática", "M", 19, 5400);
        professor.exibirinformacoes();
        System.out.println();

        Funcionario funcionario = new Funcionario("Rennan", "Tecnologia", "M", 19, "Sim");
        funcionario.exibirinformacoes();
    }
}
