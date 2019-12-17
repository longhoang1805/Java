package BaiTapThuaKeVaDaHinh;

import java.util.Scanner;

public class SinhVienBiz extends SinhVienFpt {
	double diemMarketing;
	double diemSales;

	public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {

		Scanner scanner = new Scanner(System.in);
		hoTen = scanner.nextLine();
		System.out.println("Nhập điểm Marketing: ");
		diemMarketing = scanner.nextDouble();
		System.out.println("Nhập điểm Sales: ");
		diemSales = scanner.nextDouble();
	}

	public double getDiemMarketing() {
		return diemMarketing;
	}

	public void setDiemMarketing(double diemMarketing) {
		this.diemMarketing = diemMarketing;
	}

	public double getDiemSales() {
		return diemSales;
	}

	public void setDiemSales(double diemSales) {
		this.diemSales = diemSales;
	}

	@override
	public void accelerate(double Diem) {

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

	double Diem(double diemMarketing, double diemSales) {
		return (2 * diemMarketing + diemSales) / 3;
	}
}
