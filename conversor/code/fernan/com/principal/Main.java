package fernan.com.principal;

import fernan.com.models.ExchangeRateConvertor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExchangeRateConvertor conversorMoneda = new ExchangeRateConvertor();
        boolean seguir = true;
        Scanner scanner = new Scanner(System.in);
        double monto;
        int opcion;
        do {
            System.out.println("""
                    *********BIENVENIDO AL CONVERSOR DE MONEDAS**********
                        Seleccione entre las diferentes Opciones:
                        
                        1) Dolar -> Peso Argentino
                        2) Peso Argentino -> Dolar
                        3) Real Brasileño -> Dolar
                        4) Dolar -> Real Brasileño
                        5) Dolar -> Peso Colombiano
                        6) Peso Colombiano -> Dolar
                        7) Salir
                        
                    """);
            try{
                opcion = scanner.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el monto respectivo que desea convertir: ");
                        monto = scanner.nextDouble();
                        System.out.println("[USD]" + monto
                                + " a [Ars]=" +
                                conversorMoneda.calcularDolarAPesosArgentinos(monto));
                        break;

                    case 2:
                        System.out.println("Ingrese el monto respectivo que desea convertir: ");
                        monto = scanner.nextDouble();
                        System.out.println("[ARS]" + monto
                                + " a [USD]=" +
                                conversorMoneda.pesoArgentinoADolar(monto));
                        break;

                    case 3:
                        System.out.println("Ingrese el monto respectivo que desea convertir: ");
                        monto = scanner.nextDouble();
                        System.out.println("[BRL]" + monto
                                + " a [USD]=" +
                                conversorMoneda.calcularRealBrasilenoADolar(monto));
                        break;

                    case 4:
                        System.out.println("Ingrese el monto respectivo que desea convertir: ");
                        monto = scanner.nextDouble();
                        System.out.println("[USD]" + monto
                                + " a [BRL]=" +
                                conversorMoneda.calcularDolarARealBrasileno (monto));
                        break;

                    case 5:
                        System.out.println("Ingrese el monto respectivo que desea convertir: ");
                        monto = scanner.nextDouble();
                        System.out.println("[USD]" + monto
                                + " a [COP]=" +
                                conversorMoneda.calcularDolarAPesoColombiano (monto));
                        break;

                    case 6:
                        System.out.println("Ingrese el monto respectivo que desea convertir: ");
                        monto = scanner.nextDouble();
                        System.out.println("[COP]" + monto
                                + " a [USD]=" +
                                conversorMoneda.calcularPesoColombianoADolar(monto));
                        break;
                    case 7: break;
                }
            }catch(Exception e){

            }

        }while(seguir);




    }
}