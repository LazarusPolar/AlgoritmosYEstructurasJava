public class Principal {

    public static void main(String[] args){
        // Estructura no dinamica
        int[] arreglo = new int[7];

        arreglo[0] = 20;
        arreglo[1] = 35;
        arreglo[2] = -14;
        arreglo[3] = 7;
        arreglo[4] = 12;
        arreglo[5] = 23;
        arreglo[6] = 232;

        for(int x = 0; x < arreglo.length; x++)
            System.out.println(arreglo[x]);
    }
}
