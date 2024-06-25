package org.example;

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char before = ' ';
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                sum += 1;
            } else if (c == 'V') {
                if (before == ' ' || before != 'I') {
                    sum += 5;
                } else {
                    sum += 3;
                }
            } else if (c == 'X') {
                if (before == ' ' || before != 'I') {
                    sum += 10;
                } else {
                    sum += 8;
                }
            } else if (c == 'L') {
                if (before == ' ' || before != 'X') {
                    sum += 50;
                } else {
                    sum += 30;
                }
            } else if (c == 'C') {
                if (before == ' ' || before != 'X') {
                    sum += 100;
                } else {
                    sum += 80;
                }
            } else if (c == 'D') {
                if (before == ' ' || before != 'C') {
                    sum += 500;
                } else {
                    sum += 300;
                }
            } else {
                if (before == ' ' || before != 'C') {
                    sum += 1000;
                } else {
                    sum += 800;
                }
            }
            before = c;
        }
        return sum;
    }
}
