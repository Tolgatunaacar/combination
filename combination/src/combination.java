import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("C(n/r)");
        System.out.println("n değerini girin:");
        int n = input.nextInt();
        System.out.println("r değerini girin:");
        int r = input.nextInt();
        int nfac =1;
        int rfac =1;
        int nrfac =1;

        for (int i =1; i<=n; i++){
            nfac = nfac*i;
        }
        for (int j =1; j<=r; j++){
            rfac = rfac*j;
        }
        for (int k =1; k <= (n-r); k++){
            nrfac = nrfac*k;
        }
        int comb = nfac / (rfac*nrfac);
        System.out.println("Combination:"+comb);
    }
}
