package basics;

public class PrimitiveDatatypes {

    public static void main(String[] args) {

        // Java Virtual Machine (JVM): Java wird nicht direkt vom PC ausgeführt, sondern erst in Bytecode kompiliert/
        // übersetzt, der dann von der JVM ausgeführt wird. Somit wird Java plattformunabhängig.

        // 32-bit signed (2^31 - 1)
        int i = 4711;

        // 8-bit signed [-128, 127]
        byte b = 127;

        // 16-bit
        short s = 128;

        // 64=bit (2^63 - 1)
        long l = 28282;

        // single-precision 32-bit
        float f = 2.5f;

        // double-precision 64-bit
        double d = 2.5;

        // 1-bit, ~1-byte in storage in memory
        boolean bool = true;

        // 16-bit unicode
        char c = 's';
    }

}
