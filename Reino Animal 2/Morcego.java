
public class Morcego extends Mamiferos{
	public boolean asa;
	public String anda;
	
	public void set_locomocao() {
		this.anda = "Voa";
	}
	
	public Morcego(){
		this.setAsa(true);
	}
	
	public boolean isAsa() {
		return asa;
	}

	public void setAsa(boolean asa) {
		this.asa = asa;
	}
	
}
