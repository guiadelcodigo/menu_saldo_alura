import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        double saldo = 250000;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        String nombre = "Maik";
        String tipoDeCuenta = "Corriente";
        String menu = """
                *** escriba el numero de la opcion deseada ***
                1.- Consultar saldo
                2.- Retirar saldo
                3.- Depositar saldo
                9.- Salir
                """;

        System.out.println("*********************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("el tipo de cuenta es: "+ tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$ ");
        System.out.println("*********************");



        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println("El saldo actualizado es: "+saldo+"$");
                break;

            case 2:
                System.out.println("Cual es el valor que desea retirar?");
                double valorARetirar = teclado.nextDouble();
                if (saldo < valorARetirar){
                    System.out.println("saldo insuficiente");
                }
                else{
                    saldo = saldo - valorARetirar;
                    System.out.println("el saldo actualizado es: "+saldo);
                }
                break;
            case 3:
                System.out.println("Cual es el valor que desea depositar?");
                double valorADepositar = teclado.nextDouble();
                saldo += valorADepositar;
                System.out.println("el saldo actualizado es: "+saldo);
                break;
            case 9:
                System.out.println("has salido...");
                break;
            default:
                System.out.println("has seleccionado una opcion no valida");
        }
        }
    }
}
