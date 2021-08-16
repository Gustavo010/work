package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import vo.Name;

public class NameDAO {

	private Name name;
	private ArrayList<Name> names;
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo = "C:\\works\\clientes.csv";

	public ArrayList<Name> abrir() {
		names = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = "";
			while ((linha = br.readLine()) != null) {
				String[] campos = linha.split(";");
				name = new Name(campos[0], campos[1], campos[2]);
				names.add(name);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("DEU UM ERRINHO NO ARQUIVINHO " + e);
		}
		return names;
	}

	public boolean salvar(ArrayList<Name> vs) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo, false));
			for (Name p : vs) {
				bw.write(p.toCSV());
			}
			bw.close();
			return true;
		} catch (IOException e) {
			System.out.println("DEU ERROOOOO " + e);
			return false;
		}
	}
}
