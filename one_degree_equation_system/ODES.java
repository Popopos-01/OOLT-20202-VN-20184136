package one_degree_equation_system;

public class ODES{ //one degree equation system
	private int a11;
	private int a12;
	private int a21;
	private int a22;
	private int b1;
	private int b2;
	
	public void setSystem(int a11, int a12, int b1, int a21, int a22, int b2) {
		this.a11 = a11;
		this.a12 = a12;
		this.b1 = b1;
		this.a21 = a21;
		this.a22 = a22;
		this.b2 = b2;
	}
	
	public String getSystem() {
		String text;
		text = this.a11 + "x1 +" + this.a12 + "x2 = " + this.b1 + "\n" 
			 + this.a12 + "x1 +" + this.a22 + "x2 = " + this.b2 + "\n";
		return text;
	}
	
	public String solve() {
		int d = a11*a22-a21*a12;
		int d1 = b1*a22-b2*a12;
		int d2 = b2*a11-b1*a21;
		if(d != 0) {
			return ("Phuong trinh co nghiem: "+ d1/d + "," + d2/d);
		}
		else {
			if(d1 == 0 && d2 == 0) {
				return ("Phuong trinh co vo so nghiem\n");
			}
			else {
				return ("Phuong trinh vo nghiem\n");
			}
		}
	}
}
