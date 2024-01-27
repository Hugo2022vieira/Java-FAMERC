import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Node {
    int chave;
    int altura;
    Node esq;
    Node dir;

    Node(int chave) {
        this.chave = chave;
        this.altura = 1;
        esq = null;
        dir = null;
    }
}

class ArvoreBinariaBusca {

    int buscaBinaria(int x, Node pt) {
        if (pt == null) {
            return 0;
        } else if (x == pt.chave) {
            return 1;
        } else if (x < pt.chave) {
            return buscaBinaria(x, pt.esq);
        } else {
            return buscaBinaria(x, pt.dir);
        }
    }

    int insereNodo(int x, Node ptRaiz) {
        Node pt = ptRaiz;
        int res = buscaBinaria(x, pt);
        if (res == 1) {
            System.out.println("\nInsercao invalida: " + x);
            return 0;
        } else {
            Node ptNovo = new Node(x);
            if (res == 0) {
                ptRaiz = ptNovo;
            } else if (res == 2) {
                pt.esq = ptNovo;
            } else {
                pt.dir = ptNovo;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        File file = new File("lista.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            return;
        }

        int[] a = new int[100000];
        int i = 0;
        while (scanner.hasNextInt()) {
            a[i++] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Começando a coroa...");
        long t_i = System.currentTimeMillis();

        Node arvore = null;
        for (i = 0; i < a.length; i++) {
            if (new ArvoreBinariaBusca().insereNodo(a[i], arvore) == 1) {
                n++;
            }
        }

        long t_f = System.currentTimeMillis();
        System.out.println("Levou " + (t_f - t_i) + " milissegundos para inserir " + n + " elementos");
    }
}
