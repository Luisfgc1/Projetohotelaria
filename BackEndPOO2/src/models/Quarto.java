package models;

public class Quarto {
    private String numeroQuarto;
    private double valorQuarto;
    private EnumTipo tipoQuarto;

    public Quarto(String numeroQuarto, double valorQuarto, EnumTipo tipoQuarto) {
        this.numeroQuarto = numeroQuarto;
        this.valorQuarto = valorQuarto;
        this.tipoQuarto = tipoQuarto;
    }

    @Override
    public String toString() {
        return String.format("Quarto:\n" +
                             "  Número: %s\n" +
                             "  Valor: R$ %.2f\n" +
                             "  Tipo: %s",
                             numeroQuarto, valorQuarto, tipoQuarto);
    }
    

    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public double getValorQuarto() {
        return valorQuarto;
    }

    public void setValorQuarto(double valorQuarto) {
        this.valorQuarto = valorQuarto;
    }

    public EnumTipo getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(EnumTipo tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

}
