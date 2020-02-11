package io.sam.learning.hackerrank;

public class BitRotator {

    public static void main(String[] args) {
        BitRotator rotate = new BitRotator ( );
    }

    public int bitRotate(int n, int m, boolean d) {
        String s = Integer.toBinaryString (n);
        m = m % s.length ( );
        if (d) {
            return Integer.parseInt (s.substring (s.length ( ) - m) + s.substring (0, s.length ( ) - m), 2);
        } else {
            return Integer.parseInt (s.substring (m) + s.substring (0, m), 2);
        }
    }
}
