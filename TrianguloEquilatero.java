import java.lang.Math;

public class TrianguloEquilatero extends FiguraGeometrica {
    double lado;

    public TrianguloEquilatero(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        double area = (Math.sqrt(3) / 4) * getLado() * getLado();
        return area;
    }

    @Override
    public double calcularPerimetro(){
        return getLado() * 3;
    }

    @Override
    public String getTipoFigura(){
        return "Triângulo Equilátero";
    }

    public String getDetalhes(){
        return "Lados: " + getLado();
    }

}
