import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);
        ConversorMonedas convertir = new ConversorMonedas();

        String menu = """
                        ****¡ConversorMonedas de Monedas!:****
                        1. Dólar => Peso Argentino
                        2. Peso Argentino => Dólar
                        3. Dólar => Real Brasileño
                        4. Real Brasileño => Dólar
                        5. Dólar => Peso Colombiano
                        6. Peso Colombiano => Dólar"
                        7. Salir")""";
        System.out.println(menu);
        System.out.println("***************************");
        while(opcion != 7){
            System.out.println("Elija una opción:");
            try{
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
                        System.out.println("Número no presente en las opciones. Elija nuevamente");
                        break;
                }
            }catch (Exception e){
                System.out.println("No ingresate un número entero. Error tipo: " + e + ", " +e.getMessage());
                teclado.nextLine(); // Limpia el buffer de la entrada inválida, al tomar el último enter
                //teclado.next(); // Consume the invalid input to prevent an infinite loop, but have a limited time of wait
                System.out.println("----------------------------------------------------------------------");
            }
        }
    }
}