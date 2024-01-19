package co.com.screenplay.project;


public class Main {

    /*
     * Actividad - Desarrollar un algoritmo básico en el lenguaje de programación que domine
     *  el candidato (Ordenar un arreglo de enteros de menor a mayor sin usar funcionales como
     *  Arrays.sort())
     * */

    public static void main(String[] args) {

        // Arreglo de enteros desordenado
        int[] arreglo = {5, 2, 8, 1, 6};

        // Llamar al método de ordenamiento
        ordenarArreglo(arreglo);

        System.out.println("Arreglo ordenado:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }

    // Método de ordenamiento de burbuja
    public static void ordenarArreglo(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;

        do {
            intercambio = false;

            for (int i = 0; i < n - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;

                    intercambio = true;
                }
            }

            // Reducir la cantidad de elementos a comparar en cada iteración
            n--;

        } while (intercambio);
    }
}

