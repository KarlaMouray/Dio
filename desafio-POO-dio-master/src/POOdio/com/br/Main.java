package POOdio.com.br;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição java");
    curso1.setCargahoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descrição js");
    curso2.setCargahoraria(10);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("java");
    mentoria.setDescricao("descricao da mentoria");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
    }
}
