import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("     /~\\");
        bw.newLine();
        bw.write("    ( oo|");
        bw.newLine();
        bw.write("    _\\=/_");
        bw.newLine();
        bw.write("   /  _  \\");
        bw.newLine();
        bw.write("  //|/.\\|\\\\");
        bw.newLine();
        bw.write(" ||  \\ /  ||");
        bw.newLine();
        bw.write("============");
        bw.newLine();
        bw.write("|          |");
        bw.newLine();
        bw.write("|          |");
        bw.newLine();
        bw.write("|          |");

        bw.close();
    }
}