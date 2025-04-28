public class Negativos {
    private int numero;

    public Negativos() {
    }

    public Negativos(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
}
