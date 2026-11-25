import java.util.Scanner;

public class Main extends Estoque{

    public static void main(String[] args)  {
        Inicio();
    }

    private static int Opcoes(){
        Scanner input = new Scanner(System.in);
        int OpcaoEscolida;

        System.out.println("1 - Verificar o Estoque");
        System.out.println("2 - Vender Produto");
        System.out.println("3 - Criar Produto");

        System.out.print("Qual você escolhe?: ");

        // Verificação
        while (true){
            if(!input.hasNextInt()){
                System.out.print("Opção inválida");
                input.next();
                continue;
            }

            OpcaoEscolida = input.nextInt();

            if(OpcaoEscolida > 3){
                System.out.print("Digite somente de 1 a 4.");
                continue;
            }
            break;
        }

        input.nextLine();
        return OpcaoEscolida;
    }

    private static void Inicio(){
        System.out.println("----- Gerenciador de Estoque ----- \n" +
                "Sistema feito por Gabriel Gomes \n" +
                "---------------------------------- \n"
                + "Escolha o que você quer fazer:");
        int opicao = Opcoes();

        switch (opicao){
            case 1:
                if(Confimacao()) {
                System.out.println("Você Escolheu Sim");
                }
                break;
            case 2:
                Vender("");
                break;
            case 3:
            //  Criar()
                break;
        }
    }

    private static boolean Confimacao() {
        Scanner lendoResposta = new Scanner(System.in);

        while (true){
        System.out.print("Você tem certeza que deseja prosseguir? Digite S (Sim), e N (Não): ");
        String resposta = lendoResposta.next().trim();

            if(resposta.equalsIgnoreCase("S")){
                return true;
            }else if(resposta.equalsIgnoreCase("N")){
                System.out.println("Voltando para o início ... \n");
                //  Uma pausa de 2 segundos
                pausa(2000);
                // Voltando ao início
                Inicio();
                return false;
            }else{
                System.out.println("Resposta inválida. Tente novamente");
            }
        }

    }

    private static void pausa(long mil){
        try{
            Thread.sleep(mil);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
