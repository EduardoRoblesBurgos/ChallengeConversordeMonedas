import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        int cantidad = 0;
        /*
        String menu = """
                        ****¡Conversor de Monedas!:****
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

        Scanner teclado = new Scanner(System.in);
        Conversor convertir = new Conversor();

        while(opcion != 7){
            //menú
            System.out.println("********************************");
            System.out.println("¡Conversor de Monedas!, Opciones:");
            System.out.println("1. Dólar => Peso Argentino");
            System.out.println("2. Peso Argentino => Dólar");
            System.out.println("3. Dólar => Real Brasileño");
            System.out.println("4. Real Brasileño => Dólar");
            System.out.println("5. Dólar => Peso Colombiano");
            System.out.println("6. Peso Colombiano => Dólar");
            System.out.println("7. Salir");
            System.out.println("\nDigite opción válida:");

            opcion = teclado.nextInt();
            int resultado = 0;
            switch (opcion){
                case 1:
                    //System.out.println("Digite la cantidad de la moneda a convertir:");
                    //cantidad = teclado.nextInt();
                    //resultado = convertir.convertirMoneda("USD","ARG",cantidad);
                    resultado = convertir.convertirMoneda2("USD","ARG");
                    System.out.println(cantidad + "USD es equivalente a: " + resultado + "ARG");
                    //System.out.println("uno"+cantidad);
                    break;
                case 2:
                    System.out.println("Digite la cantidad de la moneda a convertir:");
                    cantidad = teclado.nextInt();
                    resultado = convertir.convertirMoneda("USD","ARG",cantidad);
                    System.out.println(cantidad + "USD es equivalente a: " + resultado + "ARG");
                    //System.out.println("uno"+cantidad);
                    break;
                case 3:
                    System.out.println("Digite la cantidad de la moneda a convertir:");
                    cantidad = teclado.nextInt();
                    resultado = convertir.convertirMoneda("USD","ARG",cantidad);
                    System.out.println(cantidad + "USD es equivalente a: " + resultado + "ARG");
                    //System.out.println("uno"+cantidad);
                    break;
                case 4:
                    System.out.println("Digite la cantidad de la moneda a convertir:");
                    cantidad = teclado.nextInt();
                    resultado = convertir.convertirMoneda("USD","ARG",cantidad);
                    System.out.println(cantidad + "USD es equivalente a: " + resultado + "ARG");
                    //System.out.println("uno"+cantidad);
                    break;
                case 5:
                    System.out.println("Digite la cantidad de la moneda a convertir:");
                    cantidad = teclado.nextInt();
                    resultado = convertir.convertirMoneda("USD","ARG",cantidad);
                    System.out.println(cantidad + "USD es equivalente a: " + resultado + "ARG");
                    //System.out.println("uno"+cantidad);
                    break;
                case 6:
                    System.out.println("Digite la cantidad de la moneda a convertir:");
                    cantidad = teclado.nextInt();
                    resultado = convertir.convertirMoneda("USD","ARG",cantidad);
                    System.out.println(cantidad + "USD es equivalente a: " + resultado + "ARG");
                    //System.out.println("uno"+cantidad);
                    break;
                case 7:
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}