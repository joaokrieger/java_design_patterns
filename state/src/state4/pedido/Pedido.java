package state4.pedido;

public class Pedido {

	private PedidoEstado estado;

	public void setEstado(PedidoEstado estado) {
		this.estado = estado;
	}
	
	public Pedido() {
		this.estado = new EstadoRegistrado(this);
	}
	
	public void analisar() throws Exception  {
		this.estado.analisar();
	}
	
	public void suspender() throws Exception  {
		this.estado.suspender();
	}
	
	public void retomar() throws Exception  {
		this.estado.retomar();
	}
	
	public void cancelar() throws Exception  {
		this.estado.cancelar();
	}
	
	public void aprovar() throws Exception  {
		this.estado.aprovar();
	}
	
	public void atender() throws Exception  {
		this.estado.atender();
	}
}
