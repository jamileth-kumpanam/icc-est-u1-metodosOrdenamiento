public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = {10, 0, -5, 5, 15, 2};
        SortBubble sorter = new SortBubble();
        System.out.println("Array Original: ");
        sorter.printArray(numeros);
        System.out.println("Ordenando Ascendentemente: ");
        sorter.sortAscendenteMejorado(numeros);
        sorter.printArray(numeros);
        System.out.println("Ordenando Descendentemente: ");
        sorter.sortDescendente(numeros);
        sorter.printArray(numeros);
    }
}
