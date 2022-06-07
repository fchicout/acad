package br.edu.uniaeso.cl.utils;

import java.time.LocalDate;

public class RegisterNumber {

    public int generateReg(int semester, long id_student) {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        String primaryReg =  Integer.toString(year) + Integer.toString(semester) + Long.toString(id_student);
        return verifyDigit(primaryReg);
    }
    public int verifyDigit(String primaryReg) {
        int sum = 0, rest = 0, digit = 0;
        String[] numbers = new String[primaryReg.length() + 1];
        int multiplier = 2;
        String aux, aux_2, aux_3;

        for (int i = primaryReg.length(); i > 0; i--) {
            if (multiplier % 2 == 0) {
                numbers[i] = String.valueOf(Integer.valueOf(primaryReg.substring(i - 1, i)) * 2);
                multiplier = 1;
            } else {
                numbers[i] = String.valueOf(Integer.valueOf(primaryReg.substring(i - 1, i)) * 1);
                multiplier = 2;
            }
        }

        for (int i = numbers.length - 1; i > 0; i--) {
            aux = String.valueOf(Integer.valueOf(numbers[i]));
            if (aux.length() > 1) {
                aux_2 = aux.substring(0, aux.length() - 1);
                aux_3 = aux.substring(aux.length() - 1, aux.length());
                numbers[i] = String.valueOf(Integer.valueOf(aux_2) + Integer.valueOf(aux_3));
            } else {
                numbers[i] = aux;
            }
        }

        for (int i = numbers.length; i > 0; i--) {
            if (numbers[i - 1] != null) {
                sum += Integer.valueOf(numbers[i - 1]);
            }
        }

        rest = sum % 10;
        digit = 10 - rest;
        return digit;
    }
}
