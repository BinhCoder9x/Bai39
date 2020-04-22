import java.util.Scanner;

public class NhaSanXuat {
	private String tenNSX;
	private String dicChi;
 	public NhaSanXuat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getTenNSX() {
		return tenNSX;
	}



	public void setTenNSX(String tenNSX) {
		this.tenNSX = tenNSX;
	}



	public String getDicChi() {
		return dicChi;
	}



	public void setDicChi(String dicChi) {
		this.dicChi = dicChi;
	}



	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập vào tenNSX: ");
		this.tenNSX = s.nextLine();

		System.out.println("Nhập vào dicChi: ");
		this.dicChi = s.nextLine();
		

	}
	
	public void output() {
		System.out.println("tenNSX: " + this.tenNSX);
		System.out.println("dicChi: " + this.dicChi);
	
	}
}
