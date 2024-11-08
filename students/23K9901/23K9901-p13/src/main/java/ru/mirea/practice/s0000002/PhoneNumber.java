package ru.mirea.practice.s0000002;

abstract class PhoneNumber {
    protected String rawNumber;

    public PhoneNumber(String rawNumber) {
        this.rawNumber = rawNumber;
    }

    public abstract String formatNumber();
}
