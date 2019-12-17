import java.util.Scanner;

public class SanPham {
	static String tenSp;
	static double donGia;
	double giamGia;

	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public SanPham(String tenSp, double donGia) {
		this(tenSp, donGia, 0);
	}

	private double getthueNhapKhau;

	double getthueNhapKhau() {
		return this.donGia * 10 / 100;
	}
	void Nhap() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap  ten sp:");
		this.tenSp = scn.next();
		System.out.println("Don Gia:");
		this.donGia = scn.nextDouble();
		System.out.println("Giam Gia:");
		this.giamGia = scn.nextDouble();
		this.getthueNhapKhau = ((this.donGia * 10) / 100);
	}

	void Xuat() {
		System.out.println("Ten San Pham:" + this.tenSp);
		System.out.println("Don Gia:" + this.donGia);
		System.out.println("Giam gia:" + this.giamGia);
		System.out.println("Thue Nhap Khau:" + this.getthueNhapKhau);
	}

	public static void main(String[] args) {
		SanPham[] listofSanPham = new SanPham[2];
		for (int i = 0; i < 2; i++) {
			SanPham sp = new SanPham();
			sp.Nhap();
			sp.Xuat();
			listofSanPham[i] = sp;

		}
		Scanner scn = new Scanner(System.in);
		String tenSP1 = null, tenSP2 = null;
		double donGia1, donGia2, giamGia1;
		System.out.println(" Nhap thong tin san pham 1");
		System.out.println(" Ten san pham :");
		tenSP1 = scn.nextLine();
		System.out.println(" Gia san pham :");
		donGia1 = scn.nextDouble();
		System.out.println(" Giam gia :");
		giamGia1 = scn.nextDouble();
		scn.nextLine();
		System.out.println("----------------");
		System.out.println(" Nhap thong tin san pham 2");
		System.out.println(" Ten san pham :");
		tenSP2 = scn.nextLine();
		System.out.println(" Gia san pham :");
		donGia2 = scn.nextDouble();
		SanPham sp1 = new SanPham(tenSP1, donGia1, giamGia1);
		SanPham sp2 = new SanPham(tenSP2, donGia2);
		System.out.print("Thong tin san pham 1 :");
		sp1.Xuat();
		System.out.print("Thong tin san pham 2 :");
		sp2.Xuat();
	}

	public SanPham() {
	}
}


