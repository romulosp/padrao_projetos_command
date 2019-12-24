package command;

public abstract class ROM {

	public abstract void abrir();
	public abstract void fechar();
	
	public String nome;
	
	
	public ROM(String nome) {
		super();
		this.nome = nome;
	}

	private Integer status = STATUS.FECHADO.getId();
	
	public enum STATUS{
		FECHADO(1,"FECHADO"),
		ABERTO(2,"ABERTO")
		;
		private Integer id;
		private String descricao;

		private STATUS(Integer id, String descricao){
			this.id = id;
			this.descricao = descricao;
			
		}

		public Integer getId() {
			return id;
		}

		public String getDescricao() {
			return descricao;
		}
		
		@Override
		public String toString() {
			return getDescricao();
		}
		
		public static STATUS getStatus(Integer id) {
			for(STATUS status : STATUS.values()){
				if(status.getId() == id)
					return status;
			}
			return null;
			
		}
		 
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	protected boolean isStatusRomAberto() {
		return getStatus() == STATUS.ABERTO.getId();
	}
	protected boolean isStatusRomfechado() {
		return getStatus() == STATUS.FECHADO.getId();
	}

}
