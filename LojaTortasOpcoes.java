package confeitariaEstagio;

enum  LojaTortasOpcoes {
    TORTA_LIMAO(49.91),
    TORTA_FRANGO(57.10),
    TORTA_CHOCOLATE(79.56),
    TORTA_MORANGO(74.20),
    VOLTAR(0);
    
    private double tortapreco;
	
	LojaTortasOpcoes(double tortapreco) {
		this.tortapreco = tortapreco;
	}
	
	double getTortapreco() {
		return tortapreco;
	}
}