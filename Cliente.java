package confeitariaEstagio;

public class Cliente {
		private String nome;
	    private String[] endereco;
	    private String telefone;

	    public Cliente(String nome, String[] endereco, String telefone) {
	        this.nome = nome.isEmpty() ? "Sem Informação" : nome;
	        this.endereco = new String[2];
	        this.endereco[0] = endereco[0].isEmpty() ? "Sem Informação" : endereco[0];
	        this.endereco[1] = endereco[1].isEmpty() ? "Sem Informação" : endereco[1];
	        this.telefone = telefone.isEmpty() ? "Sem Informação" : telefone;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String[] getEndereco() {
	        return endereco;
	    }

	    public String getTelefone() {
	        return telefone;
	    }
	}
