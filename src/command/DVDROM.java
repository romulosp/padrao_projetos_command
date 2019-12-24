package command;

public class DVDROM extends ROM {
	
	private static final String DVD = "DVD";

	public DVDROM() {
		super(DVD);
	}

	@Override
	public void abrir() {
		if(!isStatusRomAberto()){
			System.out.println("ABRINDO DVD ROM");
		}
	}

	@Override
	public void fechar() {
		if(!isStatusRomfechado()){
			System.out.println("FECHANDO DVD ROM");
		}
	}
}
