public class Retangulo extends FiguraGeometrica{
    double largura;
    double altura;

    public Retangulo(String cor, double largura, double altura){
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

     @Override
    public double calcularArea(){
        double area = getAltura() * getLargura();
        return area;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * (getAltura() + getLargura());
    }

    @Override
    public String getTipoFigura(){
        return "Retângulo";
    }

    public String getDetalhes(){
        return "Altura: " + getAltura() + ", Largura: " + getLargura();
    }
    
}
