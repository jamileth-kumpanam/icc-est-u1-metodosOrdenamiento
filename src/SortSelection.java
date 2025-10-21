public class SortSelection {
    
    public SortSelection() {
    }

    public void sortAscendente(int[] numeros){
        int size = numeros.length;
        for(int i = 0; i < size - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < size; j++){
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int aux = numeros[i];
                numeros[i] = numeros[minIndex];
                numeros[minIndex] = aux;
            }
        }    
    }

    public void sortDescendente(int[] numeros){
        int size = numeros.length;
        for(int i = 0; i < size - 1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < size; j++){
                if (numeros[j] > numeros[maxIndex]) {
                    maxIndex = j;
                }
            }
            if(i != maxIndex){
                int aux = numeros[i];
                numeros[i] = numeros[maxIndex];
                numeros[maxIndex] = aux;
            }
        }    
    }

    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("]");
    }
}
