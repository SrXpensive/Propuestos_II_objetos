public class Persona {
    String dni;
    String nombre;
    String apellidos;
    int edad;
    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.apellidos = "";
        this.edad = edad;
        this.dni = "";
    }
    public void mostrarPersona(){
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellidos: "+this.apellidos);
        System.out.println("Edad: "+this.edad);
    }
    public boolean esMayorEdad(){
        return this.edad >= 18;
    }
    public boolean esJubilado(){
        return this.edad >= 67;
    }
    public int diferenciaEdad(Persona p){
        return Math.abs(this.edad - p.edad);
    }
}
