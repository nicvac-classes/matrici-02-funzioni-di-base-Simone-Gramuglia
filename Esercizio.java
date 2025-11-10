import java.util.Scanner;
import java.util.Random;

class Esercizio {

    public static Scanner in = new Scanner(System.in);

    public static void assegnaMatrice(int[][] M, int RIGHE, int COLONNE, int valore) {
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                M[i][j] = valore;
            }
        }
    }

    public static void azzeraMatrice(int[][] M, int RIGHE, int COLONNE) {
        assegnaMatrice(M, RIGHE, COLONNE, 0);
    }

    public static void riempiCasuale(int[][] M, int RIGHE, int COLONNE, int minimo, int massimo) {
        Random rand = new Random();
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                M[i][j] = rand.nextInt(massimo - minimo + 1) + minimo;
            }
        }
    }

    public static void main(String args[]) {
        final int RIGHE = 3;
        final int COLONNE = 5;

        int[][] matV = new int[RIGHE][COLONNE];
        System.out.println("Quale valore inserire nelle celle della matrice?");
        int valore = in.nextInt();

        assegnaMatrice(matV, RIGHE, COLONNE, valore);
        System.out.println("Contenuto della matrice matV:");
        UtilsMatrice.visualizza(matV);
        System.out.println();

        int[][] matZ = new int[RIGHE][COLONNE];
        azzeraMatrice(matZ, RIGHE, COLONNE);
        System.out.println("Contenuto della matrice matZ:");
        UtilsMatrice.visualizza(matZ);
        System.out.println();

        int[][] matR = new int[RIGHE][COLONNE];
        System.out.println("Inserisci il valore minimo casuale:");
        int minimo = in.nextInt();
        System.out.println("Inserisci il valore massimo casuale:");
        int massimo = in.nextInt();

        riempiCasuale(matR, RIGHE, COLONNE, minimo, massimo);
        System.out.println("Contenuto della matrice matR:");
        UtilsMatrice.visualizza(matR);
    }
}
