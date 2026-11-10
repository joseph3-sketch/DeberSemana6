import java.util.*;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("joseph");
        Persona persona3 = new Persona(23,"melani",1.59f);
        System.out.println("lis");

        List<Persona> lista = new ArrayList<>();
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(new Persona(46,"pepe",1.60f));
        lista.add(new Persona(30,"Jospeh",1.70f));
        lista.add(new Persona(46,"maria",1.60f));

        lista.get(1).imprimirDaotos();
        lista.get(2).setEdad(18);
        lista.get(2).imprimirDaotos();

        System.out.println("set");
        Set<String> nombres = new HashSet<>();
        nombres.add("jose");
        nombres.add("melani");
        nombres.add("daniela");
        nombres.add("daniela"); // no guarda repetidos
        System.out.println(nombres);


        Set<Persona> nombre2 = new HashSet<>();
        nombre2.add(new Persona(21,"joseph",1.70f));
        nombre2.add(new Persona(23,"daniela",1.59f));
        nombre2.add(new Persona(23,"melani",1.59f));

        for(Persona p : nombre2){
            System.out.println(p.descripcion());
        }

        Map<String, Persona> codigoUnico  = new HashMap<>();
        codigoUnico.put("01",persona1);
        codigoUnico.put("02",persona2);
        codigoUnico.put("03",persona3);
        codigoUnico.put("04",lista.get(2));

        System.out.println("codigo unico 01" + codigoUnico.get("02").descripcion());

        System.out.println(codigoUnico);


        //deber semana 6 Joseph Merchan

        List<Persona> lista1 = new ArrayList<>();
        Set<Persona> nombres2 = new HashSet<>();
        Map<String, Persona> codigoUnico2  = new HashMap<>();
        int opcion;

        do {
            System.out.println("1 para ingresar a un usuario");
            System.out.println("0 para salir");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("ingrese el nombre");
                String nombre = sc.nextLine();

                System.out.println("ingrese la edad");
                int edad = sc.nextInt();

                System.out.println("ingrese la altura en cm");
                float altura = sc.nextFloat();
                sc.nextLine();

                lista1.add(new Persona(edad, nombre, altura));
                nombres2.add(new Persona(edad,nombre,altura));
                System.out.println("ingrese un id: ");
                String id = sc.nextLine();
                codigoUnico2.put(id,new Persona(edad,nombre,altura));
            } else if (opcion != 0) {
                System.out.println("Opción no válida. Intente de nuevo.");

            }

        } while (opcion != 0);

        System.out.println("¡Programa terminado! Usuarios registrados: " + lista1.size());
        for (Persona i : lista1){
            System.out.println(i.descripcion());
        }
        System.out.println(codigoUnico2.get("01").getEstatura());



    }
}