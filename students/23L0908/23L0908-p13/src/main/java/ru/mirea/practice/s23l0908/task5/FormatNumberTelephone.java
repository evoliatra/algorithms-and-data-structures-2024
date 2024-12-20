package ru.mirea.practice.s23l0908.task5;

public final class FormatNumberTelephone {

    private FormatNumberTelephone() {
    }

    public static String format(String numberTelephone) {
        StringBuilder last = new StringBuilder(numberTelephone.substring(numberTelephone.length() - 10));
        String code;
        last.insert(3, '-');
        last.insert(7, '-');
        if (numberTelephone.charAt(0) == '+') {
            code = String.valueOf(numberTelephone.charAt(1));
        } else {
            code = "7";
        }
        return "+" + code + last;
    }

    public static void main(String[] args) {
        String phone = "89998657010";
        System.out.println(format(phone));
    }
}
