public class Punto {
    int x;
    int y;
    Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void mostrar(){
        System.out.println("Coordenadas: ("+this.x+", "+this.y+")");
    }
    public void desplaza(int d, boolean h){
         if (h){
             this.x += d;
         }else{
             this.y += d;
         }
    }
}
