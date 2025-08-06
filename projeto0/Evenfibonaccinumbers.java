package projeto0;

public class Evenfibonaccinumbers {

    public static int evenFIbo(int i, int j) {
        int lim = 4000000;
        if(j > lim) {
            return 0;
        }
        int result = 0;
        if (j % 2 == 0) {
            result = j;
        }
        int m = i;
        i = j;
        j = m + j;
        return result + evenFIbo(i ,j);
    }

    public static void main(String[] args) {
        System.out.println(evenFIbo(1, 2));
    }

}
