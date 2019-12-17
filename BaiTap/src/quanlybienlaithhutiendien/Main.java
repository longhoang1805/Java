package quanlybienlaithhutiendien;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int n;
		BienLai bienLai;
		Scanner scanner = new Scanner(System.in);
		ArrayList<BienLai> arrBienLai = new ArrayList<>();
		System.out.println("Nhap so ho gia dinh: ");
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			bienLai = new BienLai();
			System.out.println("Nhap thong tin cua ho gia dinh thu " + (i + 1) + ":");
			bienLai.nhapBienLai();
			arrBienLai.add(bienLai);
		}
		System.out.println("---------Thong tin bien lai cua cac ho gia dinh--------- ");
		for (int i = 0; i < arrBienLai.size(); i++) {
			System.out.println("Thong tin bien lai cua ho gia dinh thu " + (i + 1) + ":");
			arrBienLai.get(i).hienThiBienLai();
		}

	}

}
