package br.edu.uniaeso;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostraArquivoTexto {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\Walter\\Documentos\\Arquivo_Java\\arquivotexto\\questao02\\meuarquivo.txt"));
            String str;
            while ((str = in.readLine()) != null)
                System.out.println(str);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
