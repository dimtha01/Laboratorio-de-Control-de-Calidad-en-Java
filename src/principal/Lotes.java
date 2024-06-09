package principal;

public class Lotes {
    private String numeroLotes;// Variable para almacenar el número de lotes
    private double carbono[];// Arreglo para almacenar los niveles de carbono en cada lote
    private double magnesio[]; // Arreglo para almacenar los niveles de magnesio en cada lote
    private double promCarbono;// Variable para almacenar el promedio de carbono en los lotes
    private double promMagnesio; // Variable para almacenar el promedio de magnesio en los lotes
    private String estatutosLote;// Variable para almacenar los estatutos del lote

    // Constructor
    public Lotes(String numeroLotes, double[] carbono, double[] magnesio) {
        // Se inicializa el objeto Lotes con el número de lotes, los valores de carbono
        // y magnesio
        this.numeroLotes = numeroLotes;
        this.carbono = carbono;
        this.magnesio = magnesio;
        actualizar(); // Llama al método actualizar para realizar alguna actualización necesaria
    }

    /**
     * Este método actualiza los promedios de carbono y magnesio, y determina si el
     * lote está aprobado o reprobado.
     */
    private void actualizar() {
        double sumaCarbono = 0; // Inicializa la suma de los valores de carbono
        double sumaMagnesio = 0; // Inicializa la suma de los valores de magnesio

        // Calcula la suma de los valores de carbono
        for (int i = 0; i < carbono.length; i++) {
            sumaCarbono += carbono[i];
        }
        promCarbono = sumaCarbono / carbono.length; // Calcula el promedio de carbono

        // Calcula la suma de los valores de magnesio
        for (int i = 0; i < magnesio.length; i++) {
            sumaMagnesio += magnesio[i];
        }
        promMagnesio = sumaMagnesio / magnesio.length; // Calcula el promedio de magnesio

        // Verifica si los promedios de carbono y magnesio están dentro de los rangos
        // aceptables
        if ((promCarbono >= 24.92) && (promCarbono <= 27.92) && (promMagnesio >= 19.84) && (promMagnesio <= 25.30)) {
            estatutosLote = "aprobado"; // Establece el estado del lote como "aprobado"
        } else {
            estatutosLote = "reprobado"; // Establece el estado del lote como "reprobado"
        }
    }

    public void mostrar() {
        // Imprime el número de lotes con un ancho de campo de 8 caracteres
        System.out.printf("%-8s", numeroLotes);

        // Imprime los valores de carbono con un ancho de campo de 7 caracteres y 2
        // decimales
        for (int i = 0; i < carbono.length; i++) {
            System.out.printf("%7.2f", carbono[i]);
        }

        // Imprime los valores de magnesio con un ancho de campo de 7 caracteres y 2
        // decimales
        for (int i = 0; i < magnesio.length; i++) {
            System.out.printf("%7.2f", magnesio[i]);
        }

        // Imprime el promedio de carbono con un ancho de campo de 10 caracteres y 2
        // decimales
        System.out.printf("%10.2f", promCarbono);

        // Imprime el promedio de magnesio con un ancho de campo de 10 caracteres y 2
        // decimales
        System.out.printf("%10.2f", promMagnesio);

        // Imprime el estado de los lotes con un ancho de campo de 10 caracteres
        System.out.printf("     %-10s\n", estatutosLote);
    }

}
