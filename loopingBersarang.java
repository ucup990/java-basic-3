import java.util.Scanner;

public class loopingBersarang {
    // Inisialisasi final value warna yang dibutuhkan
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String args[])
    {
        int x, y;
        int bentuk;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println(ANSI_GREEN + "Input angka '1' untuk bentuk Segitiga" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Input angka '2' untuk bentuk Diamond" + ANSI_RESET);
            System.out.print(ANSI_WHITE + "Pilih bentuk output : " + ANSI_RESET);
            bentuk = input.nextInt();
            if (bentuk == 1)
            {
                System.out.print(ANSI_GREEN + "Masukkan jumlah segitiga yang ingin di print : ");
                y = input.nextInt();
                for(x=0;x<y; x++)
                {
                    segitiga();
                }
                cetakNama();
            }
            else if (bentuk == 2)
            {
                System.out.print(ANSI_BLUE + "Masukkan jumlah diamond yang ingin di print : ");
                y = input.nextInt();
                for(x=0;x<y; x++)
                {
                    diamond();
                }
                cetakNama();
            }
            else
            {
                System.out.print(ANSI_RED + "\nInput tidak sesuai !!!\n" + ANSI_RESET);
                System.out.print(ANSI_YELLOW + "Masukkan ulang opsi bentuk\n\n" + ANSI_RESET);
            }
        }
    }

    // Fungsi Cetak Pola Segitiga
    static void segitiga() {
        int a,b,c,d;
        for(a=1;a<=5;a++)
        {
            for(b=4;b>=a;b--)
            {
                System.out.print(" ");
            }
            for(c=1;c<=a;c++)
            {
                System.out.print(ANSI_GREEN + "^" + ANSI_RESET);
            }
            for(d=2;d<=a;d++)
            {
                System.out.print(ANSI_GREEN + "^" + ANSI_RESET);
            }
            System.out.println("");
        }
    }

    // Fungsi Cetak Pola Diamond
    static void diamond() {
        int a,b,c,d;
        int i,j,k,l;
        // Segitiga tegak
        for(a=1;a<=5;a++)
        {
            for(b=4;b>=a;b--)
            {
                System.out.print(" ");
            }
            for(c=1;c<=a;c++)
            {
                System.out.print(ANSI_BLUE + "^" + ANSI_RESET);
            }
            for(d=2;d<=a;d++)
            {
                System.out.print(ANSI_BLUE + "^" + ANSI_RESET);
            }
            System.out.println("");
        }

        // Segitiga terbalik
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=4;k>=i;k--)
            {
                System.out.print(ANSI_BLUE + "v" + ANSI_RESET);
            }
            for(l=3;l>=i;l--)
            {
                System.out.print(ANSI_BLUE + "v" + ANSI_RESET);
            }
            System.out.println("");
        }
    }

    // Fungsi cetak nama
    static void cetakNama() {
        System.out.println(ANSI_PURPLE + "============================================================" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Author : Mohd Yusuf Ramdhani" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Github : [https://github.com/ucup990]" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Instagram : [https://www.instagram.com/mohdyusuframdhani_/]" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "============================================================" + ANSI_RESET);
    }
}