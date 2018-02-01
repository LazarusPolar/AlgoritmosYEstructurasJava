public class InsertionArray {

    public static void main(String args[]) {
        int[] arreglo = {20, 35, -15, 7, 55, 1, -22};

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
