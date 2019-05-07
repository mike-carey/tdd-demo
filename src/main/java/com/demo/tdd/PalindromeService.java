package com.demo.tdd;

public class PalindromeService {

    public boolean isPalindrome(String subject) {
        if (subject.length() <= 1) {
            return true;
        }

        return subject.charAt(0) == subject.charAt(subject.length() - 1);
    }

}
