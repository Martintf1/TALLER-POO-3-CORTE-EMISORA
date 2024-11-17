import java.util.Scanner;

public class Encuesta {
    private static Persona[] personas = new Persona[6];
    private static int contador = 0;

    public static void agregarPersona() {
        if (contador < personas.length) {
            Scanner scanner = new Scanner(System.in);

            Persona persona = new Persona();

            System.out.print("Nombre: ");
            persona.setNombre(scanner.nextLine());

            System.out.print("Cedula: ");
            persona.setCedula(scanner.nextLine());

            System.out.print("Fecha de Nacimiento: ");
            persona.setFechaNacimiento(scanner.nextLine());

            System.out.print("Correo: ");
            persona.setCorreo(scanner.nextLine());

            System.out.print("Ciudad de Residencia: ");
            persona.setCiudadResidencia(scanner.nextLine());

            System.out.print("Ciudad de Origen: ");
            persona.setCiudadOrigen(scanner.nextLine());

            for (int i = 0; i < 3; i++) {
                System.out.print("Titulo de la cancion favorita " + (i + 1) + ": ");
                String titulo = scanner.nextLine();
                System.out.print("Artista de la cancion favorita " + (i + 1) + ": ");
                String artista = scanner.nextLine();
                Cancion cancion = new Cancion(titulo, artista);
                persona.agregarCancion(cancion);
            }

            personas[contador++] = persona;
        } else {
            System.out.println("No se pueden agregar mas personas.");
        }
    }

    public static void mostrarInformacionPersona(byte posicion) {
        if (posicion >= 1 && posicion <= contador) {
            System.out.println("Infornacion de la persona en posicion "+posicion+":");
            personas[posicion-1].mostrarInformacion();
        } else {
            System.out.println("Posicion invalida.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte opcion;

        do {
            System.out.println("\t\tMenu:");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Mostrar Informacion de Persona");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextByte();

            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    System.out.print("\t\tIngresar la posicion de la persona: ");
                    byte posicion = scanner.nextByte();
                    mostrarInformacionPersona(posicion);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentalo de nuevo.");
            }
        } while (opcion != 3);
    }
}
