package EX06;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(23, 5,36);
        Hora h2 = new Hora(15,20,0);

        System.out.println(h1.formatar());
        System.out.println(h2.formatar());


    }
}