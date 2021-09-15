package com.company;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }
    public boolean connected ( int p, int q){
        if (id[p] == id[q]) System.out.printf("%s and %s connected",p,q);
        else System.out.printf("%s and %s not connected",p,q);
        return id[p] == id[q];
    }
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i< id.length; i++){
            if (id[i]==pid) id[i] = qid;
        }
    }
    public void array_print(){
        String s = "";
        for (int i = 0; i<id.length; i++) {
            String z = String.valueOf(id[i]);
            s = String.format("%s %s",s,z);

        }
        System.out.println(s);
    }
}
