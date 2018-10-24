
package Program;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args){
	int pil;
	Scanner s= new Scanner (System.in);
	
	do
        {
		System.out.println("1. Input data");
		System.out.println("2. Tampil data");
		System.out.println("3. Keluar");
		System.out.print("Pilih : ");pil=s.nextInt();
	}
	while(pil != 3);
	}
}