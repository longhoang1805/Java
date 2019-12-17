package quanlybienlaithhutiendien;

import java.util.Scanner;

public class BienLai {
	private KhachHang khachHang;
	private int chiSoCu;
	private int chiSoMoi;
	private double soTienPhaiTra;

	public BienLai() {
		super();
	}

	public BienLai(KhachHang khachHang, int chiSoCu, int chiSoMoi, double soTienPhaiTra) {
		super();
		this.khachHang = khachHang;
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.soTienPhaiTra = soTienPhaiTra;
	}

	public void nhapBienLai() {
		khachHang = new KhachHang();
		khachHang.nhapThongTinKhachHang();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap chi so cu: ");
			chiSoCu = scanner.nextInt();
			System.out.print("Nhap chi so moi: ");
			chiSoMoi = scanner.nextInt();
		} while (chiSoCu > chiSoMoi);
		soTienPhaiTra = (double) (chiSoMoi - chiSoCu) * 750;
	}

	public void hienThiBienLai() {
		khachHang.hienThiThongTinKhachHang();
		System.out.println(" _Ma  so cu: " + chiSoCu);
		System.out.println(" _Ma so moi: " + chiSoMoi);
		System.out.println(" _So tien phai tra: " + soTienPhaiTra);
	}
}
