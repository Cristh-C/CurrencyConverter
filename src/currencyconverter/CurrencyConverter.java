package currencyconverter;

import currencyconverter.Service.ars.CurrencyArs;
import currencyconverter.Service.eur.CurrencyEur;
import currencyconverter.Service.gbp.CurrencyGbp;
import currencyconverter.Service.mxn.CurrencyMxn;
import currencyconverter.Service.usd.CurrencyUsd;

import java.util.Scanner;

/**
 * Clase principal.
 * */
public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al convertidor de moneda colombiano!");


        /**Opción a elegir en el menú.*/
        int action;
        do {
            System.out.println("¿A qué moneda deseas convertir?");
            System.out.println("#1. Peso Argentino (ARS)\n" +
                    "#2. Dólar estadounidense (USD)\n" +
                    "#3. Euro (EUR)\n" +
                    "#4. Libra Esterlina (GBP)\n" +
                    "#5. Peso Méxicano (MXN).\n" +
                    "#6. Salir.");
            action = sc.nextInt();
            menuOption(action);
        } while (action != 6);
        sc.close();
    }

    public static void menuOption(int action){
        Scanner sc = new Scanner(System.in);
        double quantity;
        switch (action){
            case 1:
                System.out.println("Digita la cantidad a convertir en pesos argentinos (ARS):");
                quantity = sc.nextDouble();
                System.out.println(new CurrencyArs(quantity, 40.50).printConcurrencyConverter());
                System.out.println("¿Quieres realizar otra conversión?");
                break;
            case 2:
                System.out.println("Digita la cantidad a convertir en dólares estadounidenses (USD):");
                quantity = sc.nextDouble();
                System.out.println(new CurrencyUsd(quantity, 0.00029).printConcurrencyConverter());
                System.out.println("¿Quieres realizar otra conversión?");
                break;
            case 3:
                System.out.println("Digita la cantidad a convertir en euros (EUR):");
                quantity = sc.nextDouble();
                System.out.println(new CurrencyEur(quantity, 0.00024).printConcurrencyConverter());
                System.out.println("¿Quieres realizar otra conversión?");
                break;
            case 4:
                System.out.println("Digita la cantidad a convertir en libras esterlinas (GBP):");
                quantity = sc.nextDouble();
                System.out.println(new CurrencyGbp(quantity, 0.00021).printConcurrencyConverter());
                System.out.println("¿Quieres realizar otra conversión?");
                break;
            case 5:
                System.out.println("Digita la cantidad a convertir en pesos méxicanos (MXN):");
                quantity = sc.nextDouble();
                System.out.println(new CurrencyMxn(quantity, 0.0056).printConcurrencyConverter());
                System.out.println("¿Quieres realizar otra conversión?");
                break;

            case 6:
                System.out.println("¡Gracias por usarme, vuelve pronto!");
                System.exit(0);

            default:
                throw new IllegalStateException("¡Elige una opción correcta!");
        }
    }
}
