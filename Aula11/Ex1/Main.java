package Aula11.Ex1;

public class Main {
    public static void main(String[] args) {
        VIP ingressoVip = new VIP(125.95, 200);
        System.out.println("Vip: ");
        ingressoVip.imprimeDados();

        System.out.println("Normal: ");
        Normal ingressoNormal = new Normal(125.95, "B12");
        ingressoNormal.imprimeDados();
    }
}