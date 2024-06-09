package principal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Apoyo {
    // Método para contar el número de registros en el archivo "Lotes.txt" y agregar
    // comentarios explicativos
    public static int registro() throws IOException {
        int numRegistro = 0; // Inicializar el contador de registros
        Scanner leerArchivo = new Scanner(new File("Lotes.txt")); // Crear un objeto Scanner para leer el archivo
        while (leerArchivo.hasNextLine()) { // Iterar sobre cada línea del archivo
            leerArchivo.nextLine(); // Leer la siguiente línea del archivo
            numRegistro++; // Incrementar el contador de registros
        }
        leerArchivo.close(); // Cerrar el Scanner para liberar recursos
        return numRegistro; // Devolver el número total de registros
    }

    public static void leoLote(Lotes lotes[]) throws IOException {
        // Abre el archivo "Lotes.txt" para lectura
        Scanner leerArchivo = new Scanner(new File("Lotes.txt"));
        String numero;
        int filas = 0;
        // Mientras haya líneas por leer en el archivo
        while (leerArchivo.hasNextLine()) {
            // Lee el número del lote
            numero = leerArchivo.next();
            double carbono[] = new double[3];
            // Lee los valores de carbono del lote
            for (int i = 0; i < carbono.length; i++) {
                carbono[i] = leerArchivo.nextDouble();
            }
            double magnesio[] = new double[3];
            // Lee los valores de magnesio del lote
            for (int i = 0; i < magnesio.length; i++) {
                magnesio[i] = leerArchivo.nextDouble();
            }
            // Crea un objeto Lotes con el número, valores de carbono y valores de magnesio,
            // y lo guarda en el array de lotes
            lotes[filas] = new Lotes(numero, carbono, magnesio);
            filas++;
        }
        // Cierra el archivo después de la lectura
        leerArchivo.close();
    }

    public static void mostrar(Lotes lotes[]) {
        // Imprimir encabezado de la tabla
        System.out.println("lote            Carbono             Magnesio      " + "    Prom %C    Prom%Mg    Estatus");
        // Iterar a través de cada lote y llamar al método mostrar
        for (int i = 0; i < lotes.length; i++) {
            lotes[i].mostrar(); // Llamar al método mostrar del objeto lote[i]
        }
    }

}
