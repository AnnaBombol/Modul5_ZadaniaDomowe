package pl.devopsi.akademia;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int Tablica[] = new int[10];
        for (int x = 0; x<10; x++ )
        Tablica[x] = x + 1;

        for (int x= 0; x <20; x++) {if ((x+1)%2==0)
            System.out.println(Tablica[x] +" jest podzielna przez 2.");
            else {
                System.out.println(Tablica[x]);
            }

        }

    }
}
