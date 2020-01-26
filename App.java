//O algoritmo esta muito simples e permite apenas uma empresa por vez, mas cumpre seu propósito

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        
        double energetico = 4.5;
        int qntd;
        double impostototal;

        
        System.out.println("Insira o nome do cliente: ");
        String cliente = in.nextLine();

        System.out.println("Insira a quantidade de energéticos: ");
        qntd = in.nextInt();
        
        double ICMS = (qntd*energetico)*0.18;
        double IPI = (qntd*energetico)*0.4;
        double PIS = (qntd*energetico)*0.0186;
        double COFINS = (qntd*energetico)*0.0854;

        double total = ICMS + IPI + PIS + COFINS + (qntd*energetico);
        
        System.out.println("Cliente: " + cliente);
        System.out.println("ICMS: %.2f %n" + ICMS + "\nIPI: " + IPI + "\nPIS: " + PIS + "\nCOFINS: " + COFINS + "\nTOTAL: " + total);
    }
}
