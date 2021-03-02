package two_degree_equation;

public class TDE {
	private int a;
	private int b;
	private int c;
	
	public void setEq(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String getEq() {
		return (this.a+"x^2"+this.b+"x"+this.c+"=0");
	}
	
	public String solve() {
		int delta = b*b-4*a*c;
		if(delta<0)
			return "Phuong trinh vo nghiem\n";
		else {
			if(delta == 0)
				return ("Phuong trinh co nghiem kep: "+(-this.b/2*this.a));
			else
				return ("Phuong trinh co nghiem rieng biet: " + (-this.b+Math.sqrt(delta))/2*this.a + "," + (-this.b-Math.sqrt(delta))/2*this.a);
		}
	}
}
