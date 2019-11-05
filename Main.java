import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int opsi = 0;
	static ArrayList <Karyawan> kar = new ArrayList();
	static ArrayList <Jadwal> jad = new ArrayList();
	static ArrayList <Nilai> nil = new ArrayList();
	
	public static void main(String[] args) {

	//this is version of master branch..
	System.out.println("THIS IS VERSION 5");

	//this is version 1..
	System.out.println("THIS IS VERSION 3");

		awal();
		tambahKaryawan();
		tambahJadwal();
		tambahNilai();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan pilihan: ");
		
		do{
			try {			
				opsi = input.nextInt();
				int i =1;
				
				System.out.println("=============================================");
				
				if(opsi==1) {
					System.out.println("No \t| Kode \t| Nama \t| Alamat \t| Telp");
					System.out.println("=============================================");
					for(Karyawan s:kar) {
						System.out.println(i+". "+s.getKaryawan());
						//System.out.println(i+". "+s.getKode());
						//nil.add(new Nilai(s.getKode()));
						i++;
					}
					
				}
				else if(opsi==2) {
					System.out.println("No \t| Materi \t| Tanggal \t| Lokasi \t| Sesi");
					System.out.println("=============================================");
					
					for(Jadwal s:jad) {
						System.out.println(i+". "+s.getJadwal());
						i++;
					}
				}
				else if(opsi==3) {
					System.out.println("No \t| Kode \t| Materi \t| Nilai");
					System.out.println("=============================================");
					for(Nilai s:nil) {
						System.out.println(i+". "+s.getNilai());
						i++;
					}
				}
				else {
					System.out.println("Your Number was incorrect!!");
				}				
			} catch (Exception e) {
			// TODO: handle exception
			System.out.print("Your input Should be Numeric!!\n");
			input.nextLine();
			}
			
		}while (opsi ==0);

	}

	private static void awal() {
		System.out.println("-----------------------");
		System.out.println("1. Lihat List Karyawan ");
		System.out.println("2. Lihat List Materi ");
		System.out.println("3. Lihat List Nilai");
		System.out.println("-----------------------");
	}

	private static void tambahJadwal() {
		// Tambah jadwal
		jad.add(new Jadwal("Algoritma","31-Oct-19",711,3));
		jad.add(new Jadwal("Spring Boot","12-Nov-19",728,2));
		jad.add(new Jadwal("Android","12-Nov-19",724,2));
		jad.add(new Jadwal("Phyton","12-Nov-19",706,4));
		jad.add(new Jadwal("Ajax\t","12-Nov-19",711,1));
	}

	private static void tambahKaryawan() {
		// Tambah karyawan
		kar.add(new Karyawan("PEG01","Yohana","Jakarta","12345"));
		kar.add(new Karyawan("PEG02","Yohane","Palembang","23456"));
		kar.add(new Karyawan("PEG03","Yohani","Medan\t","34567"));
		kar.add(new Karyawan("PEG04","Yohano","Surabaya","45678"));
		kar.add(new Karyawan("PEG05","Yohano","Malang","56789"));
	}
	private static void tambahNilai() {
		// Tambah karyawan
		nil.add(new Nilai("PEG01","Algoritma",86));
		nil.add(new Nilai("PEG01","Spring Boot",88));
		nil.add(new Nilai("PEG01","Android",89));
		nil.add(new Nilai("PEG01","Phyton",90));
		nil.add(new Nilai("PEG02","Spring Bot",78));
		nil.add(new Nilai("PEG02","Android",89));
		nil.add(new Nilai("PEG02","Phyton",77));
		nil.add(new Nilai("PEG03","Android",88));
		nil.add(new Nilai("PEG03","Phyton",89));
		nil.add(new Nilai("PEG03","Ajax",90));
		nil.add(new Nilai("PEG04","Spring Boot",89));
		nil.add(new Nilai("PEG04","Android",77));
		nil.add(new Nilai("PEG04","Phyton",88));
		nil.add(new Nilai("PEG04","Ajax\t",88));
		nil.add(new Nilai("PEG05","Algoritma",89));
		nil.add(new Nilai("PEG05","Spring Boot",90));
		nil.add(new Nilai("PEG05","Android",100));
	}
	
}
//trying to edit this
