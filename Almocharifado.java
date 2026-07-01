import java.util.Scanner;
public class Almocharifado {
    static Scanner teclado;
    static Produto produto;
    
    public static void main(String[] args) {
    
    produto = new Produto();

    System.out.println("Cadastro de produtos!");
    setInfo();
    getInfo();
    }

    public static void setInfo(){
    teclado = new Scanner(System.in);
          
    System.out.println("Insira o Nome, Preço, Quantidade, Peso, Categoria e marca: ");
    produto.nome = teclado.next();
    produto.preco = teclado.nextInt();
    produto.quantidade = teclado.nextInt();
    produto.peso = teclado.nextDouble();
    produto.categoria = teclado.next();
    produto.marca = teclado.next();
    }
    
    public static void getInfo(){
    System.out.println("Nome: " + produto.nome);
    System.out.println("Preço: " + produto.preco);
    System.out.println("Quantidade: " + produto.quantidade);
    System.out.println("Peso: " + produto.peso);
    System.out.println("Categoria: " + produto.categoria);
    System.out.println("Marca: " + produto.marca);
    }
}
