package com.company;

public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        if (root(p) == root(q)) System.out.printf("%s and %s connected", p, q);
        else System.out.printf("%s and %s not connected", p, q);
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public void array_print() {
        String s = "";
        for (int i = 0; i < id.length; i++) {
            String z = String.valueOf(id[i]);
            s = String.format("%s %s", s, z);

        }
        System.out.println(s);
    }
}
