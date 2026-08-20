import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String pass = scanner.nextLine();

        System.out.println("Criptografado: " + cripto(pass));

        scanner.close();
    }

    private static int cripto(String pass) {

        char[] alfabeto = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'
        };

        List<Integer> retorno = new ArrayList<>();

        for (int i = 0; i < pass.length(); i++) {

            for (int j = 0; j < alfabeto.length; j++) {

                if (pass.charAt(i) == alfabeto[j]) {
                    retorno.add(j + 1);
                }

            }
        }

        StringBuilder str = new StringBuilder();

        for (Integer ret : retorno) {
            str.append(ret);
        }

        return Integer.parseInt(str.toString());
    }
}