import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ListaJava5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0.0;
        int quantidade = 12;

        DecimalFormat df = new DecimalFormat("0.0",
                new DecimalFormatSymbols(new Locale("pt", "BR")));

        for (int i = 1; i <= quantidade; i++) {
            double temperatura;

            while (true) {
                System.out.print("Digite a " + i + "ª temperatura (4 a 10 ºC): ");
                temperatura = scanner.nextDouble();

                if (temperatura >= 4 && temperatura <= 10) {
                    break;
                } else {
                    System.out.println("Temperatura inválida! Digite um valor entre 4 e 10.");
                }
            }

            soma += temperatura;
        }

        double media = soma / quantidade;

        System.out.println("A média de hoje das temperaturas é: " 
                + df.format(media) + "º C");

        scanner.close();
    }
}