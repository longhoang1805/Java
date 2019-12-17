package BaiTapThuaKeVaDaHinh;

import java.util.Scanner;

public class SinhVienIT extends SinhVienFpt {

	private double diemJava, diemHTML, diemCSS;

	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHTML, double diemCSS) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên sinh viên: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập điểm Java: ");
		diemJava = scanner.nextDouble();
		System.out.println("Nhập điểm HTML: ");
		diemHTML = scanner.nextDouble();
		System.out.println("Nhập điểm CSS: ");
		diemCSS = scanner.nextDouble();
	}

	public double getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}

	public double getDiemHTML() {
		return diemHTML;
	}

	public void setDiemHTML(double diemHTML) {
		this.diemHTML = diemHTML;
	}

	public double getDiemCSS() {
		return diemCSS;
	}

	public void setDiemCSS(double diemCSS) {
		this.diemCSS = diemCSS;
	}

	@override
	public void accelerate(double Diem) {

	}

	double Diem(double diemJava, double diemHTML, double diemCSS) {
		return (2 * diemJava + diemHTML + diemCSS) / 4;
	}

	void xuat() {
		System.out.println("Ho Ten Sv:" + diemJava);
		System.out.println("Nganh Sv:" + diemHTML);
		System.out.println("Diem Sv:" + diemCSS);

	}

	@Override
	public String gethoTen() {
		// TODO Auto-generated method stub
		return super.gethoTen();
	}

	@Override
	public String getnganh() {
		// TODO Auto-generated method stub
		return super.getnganh();
	}

	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return super.getDiem();
	}

	@Override
	public String getHocLuc() {
		// TODO Auto-generated method stub
		return super.getHocLuc();
	}
}
