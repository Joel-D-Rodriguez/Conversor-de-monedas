import java.util.Scanner;

public class ConvertirMoneda {
    public ConvertirMoneda() {
    }

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        Monedas monedas = consulta.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1 " + monedaBase + "= " + monedas.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        double cantidad = Double.parseDouble(lectura.nextLine());
        double cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("" + cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.conversion_rate());
    }

    public static void ConvertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Introduzca codigo de moneda deseada:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese codigo de moneda a consultar:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
