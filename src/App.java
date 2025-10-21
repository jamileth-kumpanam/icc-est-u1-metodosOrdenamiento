public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = {10, 0, -5, 5, 15, 2};
        // SortBubble sorter = new SortBubble();
        // System.out.println("Array Original: ");
        // sorter.printArray(numeros);
        // System.out.println("Ordenando Ascendentemente: ");
        // sorter.sortAscendenteMejorado(numeros);
        // sorter.printArray(numeros);
        // System.out.println("Ordenando Descendentemente: ");
        // sorter.sortDescendente(numeros);
        // sorter.printArray(numeros);
        SortSelection selection = new SortSelection();
        System.out.println("Estudiante Jamileth Kumpanam");
        System.out.println("Metodo Seleccion");
        System.out.println("Array Original: ");
        selection.printArray(numeros);
        System.out.println("Ordenado Ascendentemente: ");
        selection.sortAscendente(numeros);
        selection.printArray(numeros);
        System.out.println("Ordenado Descendentemente: ");
        selection.sortDescendente(numeros);
        selection.printArray(numeros);
    }
}
