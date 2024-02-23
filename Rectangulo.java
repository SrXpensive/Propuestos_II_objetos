public class Rectangulo {
    int x1;
    int y1;
    int x2;
    int y2;
    public Rectangulo(int x1, int y1, int x2,int y2){
        this.x1 = x1;
        this.y1 = y1;
        if(x2 <= x1 && y2 <= y1){
            System.out.println("Los valores asignados son erróneos");
        }else{
            this.x2 = x2;
            this.y2 = y2;
        }
    }
    public void mostrarRectangulo(){
        System.out.println("Punto inferior izquierdo: ("+this.x1+", "+this.y1+")");
        System.out.println("Punto superior derecho: ("+this.x2+", "+this.y2+")");
    }
    public double perimetro(){
        double base = this.x2-this.x1;
        double altura = this.y2-this.y1;
        return (base*2)+(altura*2);
    }
    public double area(){
        double base = this.x2-this.x1;
        double altura = this.y2-this.y1;
        return base*altura;
    }
}
