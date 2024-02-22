
public class Main {
    public static void main(String[] args) {
        Punto p = new Punto(3,4);
        p.mostrar();
        System.out.println("Desplazamiento: 3 vertical");
        p.desplaza(3,false);
        p.mostrar();
        System.out.println("Desplazamiento 2: 3 horizontales");
        p.desplaza(3,true);
        p.mostrar();
    }
}