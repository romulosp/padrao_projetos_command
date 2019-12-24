package command;

import java.util.List;

public class InvocadorComando {

	private List<IControleRemoto> listaComando;
	
	
	public InvocadorComando(List<IControleRemoto> listaComando) {
		this.listaComando = listaComando;
	}
	
	public void invoque(){
		verificaListaComando();
		for(IControleRemoto controleRemoto : listaComando)
			execuarComandos(controleRemoto);
	}

	private void execuarComandos(IControleRemoto controleRemoto) {
		try {
			controleRemoto.executarAcao();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			controleRemoto.desfazerAcao();
		}
	}
	private void verificaListaComando() {
		if(listaComando == null || (listaComando != null && listaComando.isEmpty())){
			throw new IllegalArgumentException(" Lista comando vazia");
		}
	}
	
	public List<IControleRemoto> getListaComando() {
		return listaComando;
	}
}
