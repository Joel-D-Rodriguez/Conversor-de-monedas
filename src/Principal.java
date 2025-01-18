import java.util.Scanner;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        int opcion = 0;

        while(opcion != 8) {
            System.out.println("***************************\nBienvenido al conversor de monedas\n\nAqui te dejamos algunas opciones para elegir:\n\n1.Dolar a Peso Argentino\n2.Peso Argentino a Dolar\n3.Dolar a Real Brasilero\n4.Real Brasilero a Dolar\n5.Dolar a Peso Dominicano\n6.Peso Dominicano a Dolar\n7.Convertir otra moneda:\n8.Salir\n\nEscribe la opcion deseada:\n");
            opcion = lectura.nextInt();
            lectura.nextLine();
            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "DOP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("DOP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.ConvertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }
}

