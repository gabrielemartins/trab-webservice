package client;

import java.util.Scanner;

public class Program {
    public static String amperagem;
    public static String resistencia;
    public static String voltagem;


    public static void tensao() {
        Scanner ler = new Scanner(System.in);
        Calculadora cal = new CalculadoraService().getCalculadoraPort();
        System.out.println("Amperes:");
        amperagem = ler.next();
        System.out.println("Ohms:");
        resistencia = ler.next();
        System.out.println(cal.tensao(amperagem, resistencia));
    }

    public static void corrente() {
        Scanner ler = new Scanner(System.in);
        Calculadora cal = new CalculadoraService().getCalculadoraPort();
        System.out.println("Volts:");
        voltagem = ler.next();
        System.out.println("Ohms:");
        resistencia = ler.next();
        System.out.println(cal.corrente(voltagem, resistencia));
    }

    public static void resistencia() {
        Scanner ler = new Scanner(System.in);
        Calculadora cal = new CalculadoraService().getCalculadoraPort();
        System.out.println("Volts:");
        voltagem = ler.next();
        System.out.println("Amperes:");
        amperagem = ler.next();
        System.out.println(cal.resistencia(voltagem, amperagem));
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int option;
        System.out.println("Escolha uma opçao");
        System.out.println("1-Calcular a tensao");
        System.out.println("2-Calcular corrente");
        System.out.println("3-Calcular resistencia");
        System.out.println("Operaçoes:");
        option = ler.nextInt();

        switch (option) {
            case 1:
                tensao();
                break;
            case 2:
                corrente();
                break;
            case 3:
                resistencia();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}

