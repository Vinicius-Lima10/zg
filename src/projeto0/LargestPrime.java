package projeto0;

public class LargestPrime {
    public static void main(String[] args) {
        long valor = 600851475143L;
        int i = 2;
        int alvo = 0;

        while (valor != 1) {
            if (valor % i == 0) {
                valor /= i;
                alvo = i;
            } else {

                i++;
            }
        }

        System.out.println(alvo);
    }
}
