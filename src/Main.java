import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaCEP consultaCEP = new ConsultaCEP();

        System.out.print("Digite um CEP: ");
        var cep = scan.nextLine();

        try {
            Endereco endereco = consultaCEP.buscar(cep);
            System.out.println(endereco);
            gerarJson gerar = new gerarJson();
            gerar.gerar(endereco);
        } catch(RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
