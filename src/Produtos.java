import java.util.Scanner;

public class Produtos {
    record Item(String nome, int quantidade, float preco) {};
    public static int allItems;

    // Criando o produto
    public static void Criar(){
        DadosCriar();


//    final var produtos = new Item(nome, quantidade, preco);

    }

    public static void Vender (String nome){

    }

    private static void DadosCriar(){
        Scanner input = new Scanner(System.in);
        String nome; int quantidade; float preco;

        //Perguntas
        System.out.print("Digite o nome do produto: ");
        nome = input.nextLine();
        System.out.print("Digite a quantidade do produto: ");
        quantidade = input.nextInt();
        System.out.print("Digite o preço do produto: ");
        preco = input.nextFloat();



    }
}
