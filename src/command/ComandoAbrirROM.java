package command;

import command.ROM.STATUS;

public class ComandoAbrirROM implements IControleRemoto {

	private ROM iRom;
	
	public ComandoAbrirROM(ROM iRom) {
		super();
		this.iRom = iRom;
	}

	@Override
	public void executarAcao() {
		verificaStatusAberto();
		iRom.abrir();
		iRom.setStatus(STATUS.ABERTO.getId());
	}

	@Override
	public void desfazerAcao() {
		System.out.println("Desfazendo acao");
	}
	
	private void verificaStatusAberto() {
		if(iRom.isStatusRomAberto()){
			throw new IllegalArgumentException(iRom.getNome() +" ja esta aberto");
		}
	}
	
}
