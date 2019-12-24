package command;

import command.ROM.STATUS;

public class ComandoFecharROM implements IControleRemoto {

	private ROM iRom;
	
	public ComandoFecharROM(ROM iRom) {
		super();
		this.iRom = iRom;
	}

	@Override
	public void executarAcao() {
		verificaStatusFechado();
		iRom.fechar();
		iRom.setStatus(STATUS.FECHADO.getId());
	}

	@Override
	public void desfazerAcao() {
		System.out.println("Desfazendo acao");
	}
	
	private void verificaStatusFechado() {
		if(iRom.isStatusRomfechado()){
			throw new IllegalArgumentException(iRom.getNome() +" ja esta fechado");
		}
	}

}
