// Emmanuel Dávila
// Ejemplo #15 - Eliminar todos los elementos de una colas

// Importamos las herramientas necesarias para el ejercicio
import java.util.LinkedList;
import java.util.Queue;

public class Ejemplo15{
    // Método para eliminar los elementos
    public static void eliminarTodos(Queue<Integer> cola){

        // Verificar que la cola no esté vacía junto a un ciclo para que se elimine hasta estar vacío
        while(!cola.isEmpty()){
            // Eliminar el cada número de la cola
            Integer num = cola.poll();
            System.out.println("Número eliminado: " + num);
            System.out.println("Cola actual: " + cola);
        }

        System.out.println("Todos los números se han eliminado");

        // Mostrar la cola final
        System.out.println("Cola final: " + cola);

    }

    public static void main(String[] args) {
        //Crear una cola
        Queue<Integer> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.add(10);
        cola.add(50);
        cola.add(12);
        cola.add(52);
        cola.add(85);

        // Mostramos la cola actual
        System.out.println("Cola actual: " + cola);

        // Llamamos el método encargado de eliminar los elementos
        eliminarTodos(cola);
    }
}