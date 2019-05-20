package com.genpus.java.thread;

public class PrintUtil2 {

    private boolean flag = false;

    public synchronized void printChacter() {

        Character[] characters = new Character[26];
        for (Character c = 'A', i = 0; c <= 'Z'; i++, c++) {
            characters[i] = c;
        }

        for (int i = 0; i <= characters.length; ) {
            try {
                if (flag) {
                    System.out.print(characters[i]);
                    flag = false;
                    i++;
                    notifyAll();
                } else {
                    wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printNum() {
        for (int i = 1; i <= 52; ) {
            try {
                if (!flag) {
                    System.out.print(i + "" + (i + 1));
                    i = i + 2;
                    flag = true;
                    notifyAll();
                } else {
                    wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
