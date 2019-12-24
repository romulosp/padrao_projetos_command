package command;

import java.util.Arrays;
import java.util.List;

public class TestarCommand {

	
	private static final String CD_ROM = "CD_ROM";
	private static final String DVD_ROM = "DVD_ROM";

	public static void main(String[] args) {
		
		ROM cd = gerarROM(CD_ROM);
		ROM dvd = gerarROM(DVD_ROM);
		
		ComandoAbrirROM comandoAbrirCD = new ComandoAbrirROM(cd);
		ComandoAbrirROM comandoAbrirDVD = new ComandoAbrirROM(dvd);
		
		ComandoFecharROM comandoFecharCD = new ComandoFecharROM(cd);
		
		ComandoFecharROM comandoFecharDVD = new ComandoFecharROM(dvd);
		
		List<IControleRemoto> listaComando = Arrays.asList(
													comandoAbrirCD,
													comandoFecharCD,
													comandoAbrirDVD,
													comandoFecharDVD,
													comandoFecharDVD
													
		);
		InvocadorComando invocadorComando = new InvocadorComando(listaComando);
		
		invocadorComando.invoque();
	}

	private static ROM gerarROM(String recurso) {
		switch (recurso) {
		case CD_ROM:
				return criarRecursoCD();
		case DVD_ROM:
			return criarRecursoDVD();
		default:
			return null;
		}
		
	}

	private static ROM criarRecursoDVD() {
		return new DVDROM();
	}

	private static ROM criarRecursoCD() {
		return new CDROM();
	}
}
