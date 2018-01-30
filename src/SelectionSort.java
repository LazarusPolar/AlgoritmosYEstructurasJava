public class SelectionSort {

    //Algoritmo cuadratico
    //A comparacion con el Bubble Sort, est es un algoritmo inestable
    public static void main(String[] args) {
        int[] arreglo = {20, 35, 15, 21, 32, -23, 12};

        for(int ultimoIndiceDesordenado = arreglo.length -1; ultimoIndiceDesordenado > 0; ultimoIndiceDesordenado--){
            int enteroMasGrade = 0;
            for(int i = 1; i <= ultimoIndiceDesordenado; i++){
                if(arreglo[i] > arreglo[enteroMasGrade]){
                    enteroMasGrade = i;
                }
            }
            intercambia(arreglo, enteroMasGrade, ultimoIndiceDesordenado);
        }

        for(int i = 0; i <= arreglo.length; i++){
            System.out.println(arreglo[i]);
        }

    }

    public static void intercambia(int array[], int indice1, int indice2){
        if(indice1 == indice2){
            return;
        }

        int temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }
}
