package listas.lista01.contribuinte;

public class ContribuinteTest {
    public static void main(String[] args) {
        Contribuinte contribuinte = new Contribuinte(65, "M", 20);
        System.out.println("Pode aposentar? " + contribuinte.podeAposentar());
    }
}
