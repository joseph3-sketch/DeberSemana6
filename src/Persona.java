public class Persona {
    private String nombre;
    private int edad;
    private float estatura;

    public Persona(){}

    public Persona(int edad, String nombre, float estatura){
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public  Persona(String nombre){ this.nombre = nombre;}

    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    public float getEstatura(){return estatura;}

    public void setNombre(String new_nombre){ this.nombre = new_nombre;}
    public void setEdad(int new_edad){ this.edad = new_edad;}
    public void setEstatura(float new_estatura){ this.estatura = new_estatura;}

    public String descripcion(){
        return "persona: " + nombre;
    }
    public void imprimirDaotos(){
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura);
    }
    public Persona copiar(){
        return new Persona(nombre);
    }
}