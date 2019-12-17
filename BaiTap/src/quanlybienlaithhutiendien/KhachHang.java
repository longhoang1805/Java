package quanlybienlaithhutiendien;

import java.util.Scanner;

public class KhachHang {
	private String hoTenChuNha;
	private String soNha;
	private int maSoCongTo;

	public KhachHang() {
		super();
	}

	public KhachHang(String hotenChuNha, String soNha, int maSoCongTo) {
		super();
		this.hoTenChuNha = hotenChuNha;
		this.soNha = soNha;
		this.maSoCongTo = maSoCongTo;
	}

	public void nhapThongTinKhachHang() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho ten chu ho: ");
		hoTenChuNha = scanner.nextLine();
		System.out.print("Nhap so nha: ");
		soNha = scanner.nextLine();
		System.out.print("Nhap ma so cong to: ");
		maSoCongTo = scanner.nextInt();
	}

	public void hienThiThongTinKhachHang() {
		System.out.println(" _Ho ten chu ho: " + hoTenChuNha);
		System.out.println(" _So nha: " + soNha);
		System.out.println(" _Ma so cong to: " + maSoCongTo);
	}
}
