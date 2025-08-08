import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);
        ConversorMonedas convertir = new ConversorMonedas();

        while(opcion != 7){
            /*
            String menu = """
                        ****¡ConversorMonedas de Monedas!:****
                        1. Dólar => Peso Argentino
                        2. Peso Argentino => Dólar
                        3. Dólar => Real Brasileño
                        4. Real Brasileño => Dólar
                        5. Dólar => Peso Colombiano
                        6. Peso Colombiano => Dólar"
                        7. Salir");
                        Elija una opción válida:
                """;
            */

            //menú
            System.out.println("********************************");
            System.out.println("¡ConversorMonedas de Monedas!, Opciones:");
            System.out.println("1. Dólar => Peso Argentino");
            System.out.println("2. Peso Argentino => Dólar");
            System.out.println("3. Dólar => Real Brasileño");
            System.out.println("4. Real Brasileño => Dólar");
            System.out.println("5. Dólar => Peso Colombiano");
            System.out.println("6. Peso Colombiano => Dólar");
            System.out.println("7. Salir");
            System.out.println("\nDigite opción válida:");

            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    convertir.convertirMoneda("USD","ARS");
                    break;
                case 2:
                    convertir.convertirMoneda("ARS","USD");
                    break;
                case 3:
                    convertir.convertirMoneda("USD","BRL");
                    break;
                case 4:
                    convertir.convertirMoneda("BRL","USD");
                    break;
                case 5:
                    convertir.convertirMoneda("USD","COP");
                    break;
                case 6:
                    convertir.convertirMoneda("COP","USD");
                    break;
                case 7:
                    System.out.println("********************************");
                    System.out.println("Programa Finalizado");
                    teclado.close();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}