public class FactorialRecursion {

    public static void main(String[] args){

        System.out.println(factorialRecursivo(5));
        System.out.println(factorialIteracion(5));
    }


    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n * (n-1)!

    public static int factorialRecursivo (int num){
        if(num == 0){
            return 1;
        }

        System.out.println(num);
        return num * factorialRecursivo(num -1);
    }


    // Corre mas rapido y ocupa menos memoria 
    public static int factorialIteracion(int num){
        if(num == 0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= 1;
        }

        return factorial;
    }
}
