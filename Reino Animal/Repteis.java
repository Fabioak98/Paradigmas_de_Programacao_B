
public class Repteis {
	public String pele;
	public String respiracao;
	public String homeotermicos;
	
	public Repteis(){
		this.setPele("Escamas");
		this.setRespiracao("Pulmonar");
		this.setHomeotermicos("Nao");
	}
	
	public String getPele() {
		return pele;
	}
	public void setPele(String pele) {
		this.pele = pele;
	}
	public String getRespiracao() {
		return respiracao;
	}
	public void setRespiracao(String respiracao) {
		this.respiracao = respiracao;
	}
	public String getHomeotermicos() {
		return homeotermicos;
	}
	public void setHomeotermicos(String homeotermicos) {
		this.homeotermicos = homeotermicos;
	}
	
	public void print() {
		System.out.println(pele);
		System.out.println(respiracao);
		System.out.println(homeotermicos);
	}
	
}
