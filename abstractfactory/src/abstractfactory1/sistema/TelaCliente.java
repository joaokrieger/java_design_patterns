package abstractfactory1.sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import abstractfactory1.dao.abstractfactory.ClienteDados;
import abstractfactory1.dao.abstractfactory.DadosFactory;
import abstractfactory1.dao.abstractfactory.PedidoDados;
import abstractfactory1.dao.randomaccessfactory.DadosRandomAccess;
import abstractfactory1.dao.xmlfactory.DadosXML;

public class TelaCliente {

	public static void main(String[] args) throws Exception {

		DadosFactory dadosFac = createFactory();
		ClienteDados cliDados = dadosFac.createCliente();
		PedidoDados pediDados = dadosFac.createPedido();
		// daqui por diante a aplicacao usado cliDados e pediDados sem realmente saber se eh XML ou RandomAccess
		
		cliDados.ler();
		cliDados.imprimir();
		
		pediDados.ler();
		pediDados.lerItens();
		
	}

	private static DadosFactory createFactory() throws Exception {
		// com base na leitura de algum arquivo de configuracao
	   	Properties props = new Properties();
    	props.load(new InputStreamReader(new FileInputStream(new File("conf.properties"))));
    	String factory = props.getProperty("factory");
    	if (factory.equals("xml"))
    		return new DadosXML();
    	else
    		return new DadosRandomAccess();
	}

}
