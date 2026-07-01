import java.util.Scanner;

public class Firma {
    static Scanner teclado;
    static FuncionarioClasse funcionario;

    public static void main(String[] args) throws Exception {
    teclado = new Scanner(System.in);
    funcionario = new FuncionarioClasse(); 
    System.out.println("Cadastro de funcionários!");
    setInfo();
    getInfo();
    }
    
    public static void setInfo(){
    System.out.println("Informe Nome, Idade, Setor, Salário e Tipo Sanguíneo do funcionário: ");
    funcionario.nome = teclado.next();
    funcionario.idade = teclado.nextInt();
    funcionario.setor = teclado.next();
    funcionario.salario = teclado.nextInt();
    funcionario.sanguineo = teclado.next();
    }
    
    public static void getInfo(){
    System.out.println("Nome: " + funcionario.nome);
    System.out.println("Idade: " + funcionario.idade);
    System.out.println("Setor: " + funcionario.setor);
    System.out.println("Salário: " + funcionario.salario);
    System.out.println("Tipo sanguíneo: " + funcionario.sanguineo);
    }
}
