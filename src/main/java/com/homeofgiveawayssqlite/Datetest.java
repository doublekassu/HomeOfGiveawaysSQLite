package com.homeofgiveawayssqlite;

import java.util.Date;

public class Datetest {
    public static void main(String[] args) {
        long milliseconds = 1711749600000L;
        Date date = new Date(milliseconds);
        System.out.println(date);
    }
}

