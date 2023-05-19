package confeitariaEstagio;

public class ComboP2 {
	private int bolo;
	  private int cocacola;
	  private int salgados;

	  public int getBolo() {
	       return bolo;
	  }
	  
	  public void setBolo(int bolo) {
	       this.bolo = bolo;
	  }
	  
	  public int getCocacola() {
	       return cocacola;
	  }
	  
	  public void setCocacola(int cocacola) {
	       this.cocacola = cocacola;
	  }
	  
	  public int getSalgados() {
	       return salgados;
	  }
	  
	  public void setSalgados(int salgados) {
	       this.salgados = salgados;
	  }

	  static void fazercombo (int getBolo, int getCocacola, int getSalgados){
	    int combo = (getBolo + getCocacola + getSalgados)*75/100;
	    System.out.println("Preço do combo: R$"+combo+",00");
	  }
	  
}

