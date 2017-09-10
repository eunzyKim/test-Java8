package com.company;

import java.security.cert.TrustAnchor;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /* old version */
        new  Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Old version");
            }
        });

        /* lamda */
        Runnable runnable = () -> System.out.println("Runnable Functional Interface Variable");
        new Thread(runnable).run();
        new Thread(runnable).run();
        new Thread(() -> System.out.println("Runnable Lamda Test")).run();
    }
}
