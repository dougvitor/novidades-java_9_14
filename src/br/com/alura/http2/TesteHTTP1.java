package br.com.alura.http2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TesteHTTP1 {
	
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.casadocodigo.com.br");
		URLConnection connection = url.openConnection();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		StringBuilder line = new StringBuilder();
		
		while(reader.readLine() != null) {
			line = line
					.append(reader.readLine())
					.append(System.lineSeparator());
		}
		
		System.out.println(line.toString());
	}

}
