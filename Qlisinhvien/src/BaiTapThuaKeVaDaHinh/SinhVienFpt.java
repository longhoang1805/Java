package BaiTapThuaKeVaDaHinh;

import java.util.Scanner;

public class SinhVienFpt {
	private String hoTen;

	public String gethoTen() {
		return this.hoTen;
	}

	private String nganh;

	public String getnganh() {
		return this.nganh;
	}

	protected double Diem;

	public double getDiem() {
		return this.getDiem();
	}

	private String HocLuc;

	public String getHocLuc() {
		return this.getHocLuc();
	}

	public SinhVienFpt(String hoTen, String nganh, double Diem, String HocLuc) {
		this.hoTen = hoTen;
		this.nganh = nganh;
		this.Diem = Diem;
		this.HocLuc = HocLuc;
	}

	public SinhVienFpt() {
	}

	void nhap() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap vao ten sv:");
		hoTen = scn.nextLine();
		System.out.println("Nhap vao nganh sv:");
		nganh = scn.nextLine();
		System.out.println("Diem sv:");
		Diem = scn.nextDouble();

	}

	void xuat() {
		System.out.println("Ho Ten Sv:" + hoTen);
		System.out.println("Nganh Sv:" + nganh);
		System.out.println("Diem Sv:" + Diem);
		if (Diem < 5) {
			System.out.println("Hoc Luc Yeu");
		} else if ((5 <= Diem) && (Diem < 6.5)) {
			System.out.println("Hoc Luc Trung Binh");
		} else if ((6.5 <= Diem) && (Diem < 7.5)) {
			System.out.print("Hoc Luc Kha");

		} else if ((7.5 <= Diem) && (Diem < 9)) {
			System.out.println("Hoc Luc Gioi");
		} else if (Diem > 9) {
			System.out.println("Hoc Luc Xuat Sac");
		}

	}

	public static void main(String[] args) {
		SinhVienFpt sv = new SinhVienFpt();
		sv.nhap();
		sv.xuat();
	}
}


