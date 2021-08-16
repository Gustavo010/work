package ctr;

import java.util.ArrayList;

import vo.Name;
import dao.NameDAO;

public class NameProcess {
	
	//atributos
	public static ArrayList<Name> names = new ArrayList<>();
	public static NameDAO cd = new NameDAO ();
	
	//metodo para gerar dados de teste
	public static void testes() {
		names = new ArrayList<>();	
		
		names.add(new Name("Atacante","Gugu Rocha","14 25253636"));
		names.add(new Name("Zagueiro","Biel Grau","18 78789595"));
		names.add(new Name("Volante","Brabo Alves","19 61612727"));
		names.add(new Name("Lateral","Yuri Castro","21 38571221"));
		names.add(new Name("Meio Campista","Silva Souza","19 14412002"));
	}
	
	//metodo que abre o arquivo de texto
	public static void abrir() {
		names = cd.abrir();
	}
	public static String salvar() {
		if(cd.salvar(names)) {
			return "<p> Salvou cria</p>";
		}else {
			return "<p>Deu erro ao salvar irmão</p>";
		}
	}
}


