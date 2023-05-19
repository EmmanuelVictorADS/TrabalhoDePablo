package confeitariaEstagio;

enum  LojaSalgadosOpcoes {
    COXINHA_FRANGO(4.25),
    PASTEL_FRANGO(4.25),
    EMPADA(6.25),
    BOLINHO_QUEIJO(3.50),
    VOLTAR(0);
    
    private double salgadopreco;
	
	LojaSalgadosOpcoes(double salgadopreco) {
		this.salgadopreco = salgadopreco;
	}
	
	double getSalgadopreco() {
		return salgadopreco;

	}
}
