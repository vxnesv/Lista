package EX03;

public class Retangulo {
    private double base;
    private double altura;
}

    public void Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }


    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

}