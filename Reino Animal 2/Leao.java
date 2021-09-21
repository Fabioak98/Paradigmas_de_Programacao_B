
public class Leao extends Mamiferos{
	public String Garra;
	public String anda;
	
	public void set_locomocao() {
		this.anda = "Corre";
	}
	
	public Leao() {
		this.setGarra("Afiadas");
	}

	public String getGarra() {
		return Garra;
	}

	public void setGarra(String garra) {
		Garra = garra;
	}
		
		
}
