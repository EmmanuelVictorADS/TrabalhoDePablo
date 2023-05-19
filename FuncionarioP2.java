package confeitariaEstagio;

public class FuncionarioP2 {
	  private String nome;
	  private String cargo;
	  private String horario;
	  private String realizadas;
	  private String pendentes;

	  public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome){
	    this.nome = nome;
	  }

	  public String getCargo() {
	    return cargo;
	  }

	  public void setCargo(String cargo){
	    this.cargo = cargo;
	  }

	  public String getHorario(){
	    return horario;
	  }

	  public void setHorario(String horario) {
	    this.horario = horario;
	  }

	  public String getRealizadas(){
	    return realizadas;
	  }

	  public void setRealizadas(String realizadas) {
	    this.realizadas = realizadas;
	  }

	  public String getPendentes(){
	    return pendentes;
	  }

	  public void setPendentes(String pendentes) {
	    this.pendentes = pendentes;
	  }

	  public void registro()  {
	    System.out.println("Relatório diário" );
	    System.out.println("Nome do funcionário: "+ this.nome);
	    System.out.println("Cargo do funcionário: "+ this.cargo);
	    System.out.println("Horário de trabalho: "+ this.horario);
	    System.out.println("Tarefas realizadas: "+ this.realizadas);
	    System.out.println("Tarefas pendentes: "+ this.pendentes);
	  }
	  
	  
	    
	  }

