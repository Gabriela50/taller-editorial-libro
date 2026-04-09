import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("*** INGRESO DE DATOS DEL LIBRO ***");
        System.out.print("Ingrese el titulo del libro: ");
        String tituloLibro = sc.nextLine();

        System.out.print("Ingrese el precio del libro: ");
        double precioLibro = sc.nextDouble();

        System.out.print("Ingrese el numero de paginas: ");
        int numeroPaginas = sc.nextInt();

        System.out.print("Ingrese el año de publicacion: ");
        int anioPublicacion = sc.nextInt();
        sc.nextLine();

        Libro libro = new Libro(numeroPaginas, anioPublicacion, tituloLibro, precioLibro);


        System.out.println("\n*** INGRESO DE DATOS DEL DISCO ***");
        System.out.print("Ingrese el titulo del disco: ");
        String tituloDisco = sc.nextLine();

        System.out.print("Ingrese el precio del disco: ");
        double precioDisco = sc.nextDouble();

        System.out.print("Ingrese la duracion en minutos: ");
        float duracionMinutos = sc.nextFloat();
        sc.nextLine();

        Disco disco = new Disco(duracionMinutos, tituloDisco, precioDisco);


        System.out.println("\n=== INGRESO DE DATOS DEL VIDEO ===");
        System.out.print("Ingrese el titulo del video: ");
        String tituloVideo = sc.nextLine();

        System.out.print("Ingrese el precio del video: ");
        double precioVideo = sc.nextDouble();

        System.out.print("Ingrese la duracion en horas: ");
        float duracionHoras = sc.nextFloat();
        sc.nextLine();

        System.out.println("Seleccione el idioma del video:");
        System.out.println("1. ESPANOL");
        System.out.println("2. INGLES");
        System.out.println("3. PORTUGUES");
        System.out.print("Opcion: ");
        int opcionIdioma = sc.nextInt();

        Idioma idiomaVideo;

        switch (opcionIdioma) {
            case 1:
                idiomaVideo = Idioma.ESPANOL;
                break;
            case 2:
                idiomaVideo = Idioma.INGLES;
                break;
            case 3:
                idiomaVideo = Idioma.PORTUGUES;
                break;
            default:
                idiomaVideo = Idioma.ESPANOL;
                System.out.println("Opcion invalida. Se asigno ESPANOL por defecto.");
                break;
        }

        Video video = new Video(idiomaVideo, duracionHoras, tituloVideo, precioVideo);


        Publicacion[] publicaciones = new Publicacion[3];
        publicaciones[0] = libro;
        publicaciones[1] = disco;
        publicaciones[2] = video;

        System.out.println("\n*** DATOS INGRESADOS *** ");
        for (Publicacion publicacion : publicaciones) {
            System.out.println("----------------------------");
            System.out.println(publicacion.toString());
        }

        sc.close();
    }
}