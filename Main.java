
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
        Persona p1 = new Persona("20134768H","Alberto","Mate Verde",17);
        Persona p2 = new Persona("Juan",68);
        p1.mostrarPersona();
        p2.mostrarPersona();
        System.out.println("¿"+p1.nombre+" es mayor de edad?: "+p1.esMayorEdad());
        System.out.println("¿"+p2.nombre+" es mayor de edad?: "+p2.esMayorEdad());
        System.out.println("¿"+p1.nombre+" es jubilado?: "+p1.esJubilado());
        System.out.println("¿"+p2.nombre+" es jubilado?: "+p2.esJubilado());
        System.out.println("La diferencia de edad entre "+p1.nombre+" y "+p2.nombre+" es de "+p1.diferenciaEdad(p2)+" años");
        Rectangulo r1 = new Rectangulo(2,3,2,3);
        r1.mostrarRectangulo();
    }
}