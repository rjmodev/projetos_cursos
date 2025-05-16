package me.dio.javadeveloper.edu.java_fundamentals.learnig_sintax.anatomy_of_class;

public class Identacao {
    public static void main(String[] args) {

    //Exemplo de um metodo sem identacao sobre um sistema de boletim estudantil

    int mediaFinalIngles = 3;
    if(mediaFinalIngles < 6)
    System.out.println("REPROVADO EM INGLÊS");
    else if (mediaFinalIngles==6)
    System.out.println("PROVA MINERVA PARA A MATÉRIA DE INGLÊS");
    else
    System.out.println("APROVADO EM INGLÊS");

    //Exemplo de um metodo com identacao sobre um sistema de boletim estudantil

    int mediaFinalFisica = 6;
        if (mediaFinalFisica < 6)
            System.out.println("REPROVADO EM FÍSICA");
        else if (mediaFinalFisica == 6)
            System.out.println("PROVA MINERVA PARA A MATÉRIA DE FÍSICA");
        else
            System.out.println("APROVADO EM FÍSICA");
    }
}
