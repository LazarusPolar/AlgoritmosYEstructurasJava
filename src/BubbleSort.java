public class BubbleSort {

    public static void main(String args[]) {
        int[] arreglo = {20, 35, -15, 7, 55, 1, -22};

        for(int ultimoIndiceSinOrden = arreglo.length - 1; ultimoIndiceSinOrden > 0; ultimoIndiceSinOrden--){
            for(int indice1 = 0; indice1 < ultimoIndiceSinOrden; indice1++){
                if(arreglo[indice1] > arreglo[indice1 + 1]){
                    intercambia(arreglo, indice1, indice1 + 1);
                }
            }
        }

        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
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
