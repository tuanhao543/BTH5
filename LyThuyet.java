
package bth5l1;

import java.util.Scanner;


public class LyThuyet extends PhongHoc {
	private boolean mayChieu;
	
	@Override
	boolean xetDatChuan() {
		if(duAnhSang() && mayChieu == true)
			return true;
		return false;
	}

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	public LyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}

	public LyThuyet() {
		super();
	}

	public LyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
	}

	@Override
	public String toString() {
		String danhGia, mayChieu;
		
		if(xetDatChuan())
			danhGia = "Dat chuan";
		else
			danhGia = "Khong Dat chuan ";
		
		if(this.mayChieu)
			mayChieu = "Co";
		else
			mayChieu = "Khong";
		
		return super.toString()+String.format("%-15s"+"|"+"%-15s"+"|", mayChieu, danhGia);
	}
}

    



