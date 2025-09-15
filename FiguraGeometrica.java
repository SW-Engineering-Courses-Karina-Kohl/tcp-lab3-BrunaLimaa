import java.util.UUID;

public class FiguraGeometrica {
    String cor;
    static int id = 1;
    static int totalFiguras = 1;


    public FiguraGeometrica(String cor){
        this.cor = cor;
        FiguraGeometrica.id = id++; 
        FiguraGeometrica.totalFiguras++;       
    }

     public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public void getInfo(){
        System.out.println("ID: " + id + ", Cor: " + getCor());
    }
}
