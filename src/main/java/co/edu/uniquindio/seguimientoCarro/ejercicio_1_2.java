package co.edu.uniquindio.seguimientoCarro;

import co.edu.uniquindio.seguimientoCarro.utils.ArchivoUtils;

import java.io.IOException;

public class ejercicio_1_2 {
    public static void main(String[] args) throws IOException {
        String archivoRutaAbsoluta = "C:\\Users\\ASUS\\OneDrive\\Documentos\\Programacion_III\\co.edu.uniquindio.seguimientoCarro\\src\\main\\resources\\Persistencia\\archivoCarros.txt";
        String archivoRutaRelativa = "archivoCarros.txt";

        ArchivoUtils.leerArchivo("C:\\Users\\ASUS\\OneDrive\\Documentos\\Programacion_III\\co.edu.uniquindio.seguimientoCarro\\src\\main\\resources\\Persistencia\\archivoCarros.txt");

        ArchivoUtils.escribirArchivo("C:\\Users\\ASUS\\OneDrive\\Documentos\\Programacion_III\\co.edu.uniquindio.seguimientoCarro\\src\\main\\resources\\Persistencia\\archivoCarros.txt",
                "Lamborghini;Aventador SVJ;Verde; 6.5L V12, 770 hp");

        ArchivoUtils.agregarCarro("C:\\Users\\ASUS\\OneDrive\\Documentos\\Programacion_III\\co.edu.uniquindio.seguimientoCarro\\src\\main\\resources\\Persistencia\\archivoCarros.txt",
                "Hyundai;Santa Fe;Gris metalizado;2.5L Turbo");

        ArchivoUtils.guardarArchivo(archivoRutaAbsoluta, "otro carro", true);
        ArchivoUtils.guardarArchivo(archivoRutaRelativa, "otro carro", true);

    }
}