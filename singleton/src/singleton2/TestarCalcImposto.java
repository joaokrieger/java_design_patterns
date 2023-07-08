package singleton2;

public class TestarCalcImposto {

	public static void main(String[] args) {
		CalcImposto ci = CalcImposto.getInstace();
		ci.setAliquota(5);
		System.out.println(ci.calcImposto(100));
	}
}
