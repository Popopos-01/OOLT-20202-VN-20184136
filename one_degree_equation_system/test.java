package one_degree_equation_system;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ODES eqs = new ODES();
		eqs.setSystem(1,2,3,4,5,6);
		System.out.println(eqs.solve());
	}

}
