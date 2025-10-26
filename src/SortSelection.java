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

    public void sortNombres(String[] nombres){
        int size = nombres.length;
        for(int i = 0; i < size - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < size; j++){
                if (nombres[j].compareToIgnoreCase(nombres[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                String aux = nombres[i];
                nombres[i] = nombres[minIndex];
                nombres[minIndex] = aux;
            }
        }
    }

    public void sortPersonasPorNombre(Persona[] personas){
        int size = personas.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (personas[j].getNombre().compareToIgnoreCase(personas[minIndex].getNombre()) < 0) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                Persona aux = personas[i];
                personas[i] = personas[minIndex];
                personas[minIndex] = aux;
            }
        }
    }

    public void sortPersonasPorEdad(Persona[] personas){
        int size = personas.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (personas[j].getEdad() < personas[minIndex].getEdad()) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                Persona aux = personas[i];
                personas[i] = personas[minIndex];
                personas[minIndex] = aux;
            }
        }
    }

    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void printArray(String[] nombres){
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void printPersonas(Persona[] personas){
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
