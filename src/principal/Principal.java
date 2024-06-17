package principal;

public class Principal {
    public static void main(String[] args) throws Exception {
        // Declaración e inicialización de la variable cantidaRegistro
        int cantidaRegistro;
        // Llamada al método registro() de la clase Apoyo para obtener la cantidad de
        // registros
        cantidaRegistro = Apoyo.registro();
        // Creación de un arreglo de objetos de tipo Lotes con la cantidad de registros
        // obtenida
        Lotes lotes[] = new Lotes[cantidaRegistro];
        // Llamada al método leoLote() de la clase Apoyo para leer y almacenar los lotes
        // en el arreglo
        Apoyo.leoLote(lotes);
        // Llamada al método mostrar() de la clase Apoyo para mostrar los lotes
        // almacenados
        Apoyo.mostrar(lotes);
    }
}   
