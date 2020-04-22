import java.util.Scanner;

public class MayTinh {
	protected int tocDo, dungLuongRAM, dungLoungHDD;

	public MayTinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getTocDo() {
		return tocDo;
	}



	public void setTocDo(int tocDo) {
		this.tocDo = tocDo;
	}



	public int getDungLuongRAM() {
		return dungLuongRAM;
	}



	public void setDungLuongRAM(int dungLuongRAM) {
		this.dungLuongRAM = dungLuongRAM;
	}



	public int getDungLoungHDD() {
		return dungLoungHDD;
	}



	public void setDungLoungHDD(int dungLoungHDD) {
		this.dungLoungHDD = dungLoungHDD;
	}



	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập vào tocTo: ");
		this.tocDo = Integer.valueOf(s.nextLine());

		System.out.println("Nhập vào dungLuongRAM: ");
		this.dungLuongRAM = Integer.valueOf(s.nextLine());

		System.out.println("Nhập vào dungLoungHDD: ");
		this.dungLoungHDD = Integer.valueOf(s.nextLine());

	}

	public void output() {
		System.out.println("tocTo: " + this.tocDo);
		System.out.println("dungLuongRAM: " + this.dungLuongRAM);
		System.out.println("dungLoungHDD: " + this.dungLoungHDD);
	}

}
