package singleton2;

public class CalcImposto {

	private float aliquota;
	private static CalcImposto instance;
	
	private CalcImposto() {}
	
	public static CalcImposto getInstace() {
		
		if(instance == null) {
			instance = new CalcImposto();
		}
		
		return instance;
	}
	
	public float getAliquota() {
		return aliquota;
	}
	
	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}
	
	public float calcImposto(float valor) {
		return valor * aliquota / 100;
	}
	
}
