package atividade3;

import java.util.ArrayList;

public class Lista {

	public static class maiormenor {
        public int maior, menor;

        public maiormenor(int v) {
            maior = menor = v;
        }
    }

    public static void maiorMenorEmLista(ArrayList<Integer> lista, maiormenor mm, int pos) {
        if (pos == lista.size()) {
            return;
        }
        int num = lista.get(pos);
        if (num > mm.maior) {
            mm.maior = num;
        }
        if (num < mm.menor) {
            mm.menor = num;
        }
        maiorMenorEmLista(lista, mm, pos+1);
    }

    public static boolean palindromoEmLista(char[] palavra, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (palavra[i] != palavra[j]) {
            return false;
        }
        return palindromoEmLista(palavra, i+1, j-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(3);
        lista.add(4);

        maiormenor mm = new maiormenor(lista.get(0));
        maiorMenorEmLista(lista, mm, 0);
        System.out.println("Maior = " + mm.maior + ", menor = " + mm.menor);

        String palindromoTest = "ana";
        String palindromoTest2 = "abacate";
        String palindromoTest3 = "socorrammesubinoonibusemmarrocos";
        char[] palindromoTestArray = palindromoTest.toCharArray();
        char[] palindromoTestArray2 = palindromoTest2.toCharArray();
        char[] palindromoTestArray3 = palindromoTest3.toCharArray();
        boolean ehPalindromo = palindromoEmLista(palindromoTestArray, 0, palindromoTestArray.length-1);
        boolean ehPalindromo2 = palindromoEmLista(palindromoTestArray2, 0, palindromoTestArray2.length-1);
        boolean ehPalindromo3 = palindromoEmLista(palindromoTestArray3, 0, palindromoTestArray3.length-1);
        System.out.println(palindromoTest + " eh palindromo? " + ehPalindromo);
        System.out.println(palindromoTest2 + " eh palindromo? " + ehPalindromo2);
        System.out.println(palindromoTest3 + " eh palindromo? " + ehPalindromo3);
    }
}
