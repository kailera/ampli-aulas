package geom;

// classes abstratas não podem ser instanciadas:
// são modelos para a criação de outras classes
public abstract class Geom2D {
    protected double perimetro;
    protected double area;

    // metodos abstratos (possuem apenas a assinatura, a implementação é feita na classe que herda)
    public abstract double calculaPerimetro();
    public abstract double calculaArea();

    public double getPerimetro(){
        return perimetro;
    }

    public double getArea(){
        return area;
    }
}
