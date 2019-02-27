package com.company;
import java.util.Date;

public class MyExp extends Exception {

        public String toString() {
            Date date = new Date();
            String str = String.format("Текущая дата и время: %tc", date);
            return str;
    }
}
