package one_degree_equation;

public class one_dg_equation {
	private int a;
	private int b;
	
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return this.a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getB() {
		return this.b;
	}
	public void solve() {
		if(this.a == 0) {
			if(this.b == 0) {
				System.out.println("Phuong trinh vo so nghiem\n");
			}
			else {
				System.out.println("Phuong trinh vo nghiem\n");
			}
		}
		else {
			System.out.printf("Phuong trinh co nghiem: %d\n", (-this.b)/(this.a));
		}
	}
}
