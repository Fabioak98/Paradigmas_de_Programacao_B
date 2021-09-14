
public class Mamiferos {
	public String pele ;
	public String respiracao;
	public String homeotermicos;
	
	public Mamiferos() {
		this.setPele("pelos");
		this.setRespiracao("pulmonar");
		this.setHomeotermicos("sim");
	}
	
	public void setPele(String pele) {
		this.pele = pele;
	}


	public void setRespiracao(String respiracao) {
		this.respiracao = respiracao;
	}



	public void setHomeotermicos(String homeotermicos) {
		this.homeotermicos = homeotermicos;
	}



	public String getPele() {
		return pele;
	}
	
	public String getRespiracao() {
		return respiracao;
	}
	
	public String getHomeotermicos() {
		return homeotermicos;
	}
	
	public void print() {
		System.out.println(pele);
		System.out.println(respiracao);
		System.out.println(homeotermicos);
	}
}