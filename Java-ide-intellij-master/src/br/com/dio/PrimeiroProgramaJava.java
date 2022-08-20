package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O pequeno príncipe", 250);
        System.out.println(livro);

        /*int a = 5;
        int b = 6;
        System.out.println("Hello Java! " + (a+b));*/
    }
}
class Livro{
    private String nome;
    private String numpag;

    public Livro(String nome, int numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumpag() {
        return numpag;
    }

    public void setNumpag(String numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpag='" + numpag + '\'' +
                '}';
    }
}