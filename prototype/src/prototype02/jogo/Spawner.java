package prototype02.jogo;

// desovar eh bem estranho
public class Spawner<T extends Inimigo>{

	private T base;

	public Spawner(T base) {
		this.base = base;
	}
	
	public T spawn() throws Exception {
		return (T) base.clonar();
	}
}
