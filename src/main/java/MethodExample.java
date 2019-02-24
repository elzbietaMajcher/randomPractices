public class MethodExample {
    public static void main (String[] args){
        System.out.println("check if 1 is prime: " + isNumberPrime(1));
        System.out.println("check if 2 is prime: " + isNumberPrime(2));
        System.out.println("check if 3 is prime: " + isNumberPrime(3));
        System.out.println("check if 4 is prime: " + isNumberPrime(4));
        System.out.println("check if 5 is prime: " + isNumberPrime(5));
        System.out.println("check if 0 is prime: " + isNumberPrime(0));
    }

    public static boolean isNumberPrime(int a){
        if (a < 2 )return false;
        else
        for (int i = 2; i < a ; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
