
public abstract class FiguraGeometrica {
    String cor;
    int id = 1;
    static int totalFiguras = 0;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
        this.id += totalFiguras;
        FiguraGeometrica.totalFiguras++;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getInfo() {
        return "ID: " + id + ", Cor: " + getCor();
    }

    public static int getTotalFiguras() {
        return totalFiguras;
    }

    public abstract String getDetalhes();

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract String getTipoFigura();

}
