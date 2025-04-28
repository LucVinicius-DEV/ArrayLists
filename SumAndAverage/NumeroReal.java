public class NumeroReal {
    private double numero;

    public NumeroReal() {
    }

    public NumeroReal(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("%.2f", numero); // Aqui usamos %.2f para garantir a formatação de 2 casas decimais
    }
}
