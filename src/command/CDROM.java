package command;

public class CDROM extends ROM {
	
	private static final String CD = "CD";

	public CDROM() {
		super(CD);
	}

	@Override
	public void abrir() {
		if(!isStatusRomAberto()){
			System.out.println("ABRINDO CD ROM");
		}
	}

	@Override
	public void fechar() {
		if(!isStatusRomfechado()){
			System.out.println("FECHANDO CD ROM");
		}
	}
	
}
