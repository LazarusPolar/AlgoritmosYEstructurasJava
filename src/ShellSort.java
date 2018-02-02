public class ShellSort {

    public static void main(String args[]) {
        int[] arreglo = {20, 35, -15, 7, 55, 1, -22};

        for(int gap = arreglo.length/2; gap > 0; gap /= 2){

            for (int i = gap; i < arreglo.length; i++){
                int nuevoElemento = arreglo[i];
                int j = i;

                while (j >= gap && arreglo[j - gap] > nuevoElemento){
                    arreglo[j] = arreglo[j-gap];
                    j -= gap;
                }

                arreglo[j] = nuevoElemento;


            }

        }

        for(int primerArregloSinOrganizar = 1; primerArregloSinOrganizar < arreglo.length; primerArregloSinOrganizar++){
            int nuevoElemento = arreglo[primerArregloSinOrganizar];
            int i;
            for(i = primerArregloSinOrganizar; i > 0 && arreglo[i-1] > nuevoElemento; i--){
                arreglo[i] = arreglo[i-1];
            }

            arreglo[i] = nuevoElemento;
        }

        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }
}
