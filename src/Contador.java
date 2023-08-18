import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo deve ser maior que o primeiro!");
        }

        sc.close();
    }
    static void contar(int one, int two) throws ParametrosInvalidosException {
        if (one > two) {
            throw new ParametrosInvalidosException();
        } else {
            int loop = two - one;
            for (int i = 0; i < loop; i++) {
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
    }

    private static class ParametrosInvalidosException extends Exception {
    }
}