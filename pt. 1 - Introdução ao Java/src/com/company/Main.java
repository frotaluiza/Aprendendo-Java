package com.company;

public class Main {
    public enum DaysOfWeek {
        FRIDAY, MONDAY, SATURDAY, SUNDAY, THURSDAY, TUESDAY, WEDNESDAY

    }
    public enum Turno {

        MANHA("manhã"),
        TARDE("tarde"),
        NOITE("noite");

        private String descricao;

        Turno(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }

    public static void main(String[] args) {
	// write your code here
        boolean done;
        int age;
        long earthPopulation;
        double pi;
        // Strings são imutáveis. Portanto, toda e qualquer manipulação de strings resulta numa nova string.
        //Assim como String é uma classe, também existem outras classes no pacote java.lang que representam os
        // tipos primitivos: Byte, Integer, Double, Short, Float, Long para os
        // tipos numéricos; Char e Boolean para os demais.
        String s = "this is a string";
        final int QUANTIDADE_TENTATIVAS = 3;
        final double pii = Math.PI;
        System.out.println(pii);
        DaysOfWeek dia = DaysOfWeek.FRIDAY;
        Turno turno = Turno.MANHA;
        System.out.println(turno.getDescricao());
        System.out.println(dia.toString());
        System.out.println(dia.ordinal());
        /* for (Turno t : Turno.values()){
            System.out.println(t.getDescricao());
        }*/
    }
}
