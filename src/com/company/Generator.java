package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Generator {
    protected ArrayList<String> numberAR = new ArrayList<String>();
    protected HashSet<String> numberHS = new HashSet<String>();
    protected TreeSet<String> numberTR = new TreeSet<String>();
    private String[] mas = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

    public Generator() {
        for (int i = 1;i <=199; i++){
            for (int j=1;j<=9;j++){
                for (int n1=0;n1<12;n1++){
                    for (int n2=0;n2<12;n2++){
                        for (int n3=0;n3<12;n3++){
                            if (i<10){
                                numberAR.add(mas[n1]+j+j+j+mas[n2]+mas[n3]+0+i);
                                numberHS.add(mas[n1]+j+j+j+mas[n2]+mas[n3]+0+i);
                                numberTR.add(mas[n1]+j+j+j+mas[n2]+mas[n3]+0+i);
                            }
                            else {
                                numberAR.add(mas[n1]+j+j+j+mas[n2]+mas[n3]+i);
                                numberHS.add(mas[n1]+j+j+j+mas[n2]+mas[n3]+i);
                                numberTR.add(mas[n1]+j+j+j+mas[n2]+mas[n3]+i);
                            }
                        }
                    }
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Generator{" +
                "number=" + numberAR +
                '}';
    }
}


