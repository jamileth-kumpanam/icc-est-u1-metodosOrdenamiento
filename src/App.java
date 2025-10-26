public class App {
    public static void main(String[] args) throws Exception {

        SortSelection selection = new SortSelection();

        int[] numeros = {10, 0, -5, 5, 15, 2};
        System.out.println("1. Arreglo de números enteros");
        System.out.println("Método Selección");
        System.out.println("Original");
        selection.printArray(numeros);
        selection.sortAscendente(numeros);
        System.out.println("Ordenado Ascendente");
        selection.printArray(numeros);
        selection.sortDescendente(numeros);
        System.out.println("Ordenado Descendente");
        selection.printArray(numeros);
        System.out.println("--------------------------------------------------");

        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        System.out.println("2. Arreglo de cadenas (nombres)");
        System.out.println("Array de Nombres Original:");
        selection.printArray(nombres);
        selection.sortNombres(nombres);
        System.out.println("Ordenado por Nombre:");
        selection.printArray(nombres);
        System.out.println("--------------------------------------------------");

        Persona[] personas = {
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };
        System.out.println("3. Arreglo de personas ordenado por nombre");
        System.out.println("Array de Personas Original:");
        selection.printPersonas(personas);
        selection.sortPersonasPorNombre(personas);
        System.out.println("\nOrdenado por Nombres de Personas:");
        selection.printPersonas(personas);
        System.out.println("--------------------------------------------------");

        Persona[] personasEdad = {
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };
        System.out.println("4. Arreglo de personas ordenado por edad");
        System.out.println("Array de Personas Original:");
        selection.printPersonas(personasEdad);
        selection.sortPersonasPorEdad(personasEdad);
        System.out.println("\nOrdenado por EDAD de Personas:");
        selection.printPersonas(personasEdad);
    }
}
