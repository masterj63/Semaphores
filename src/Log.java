import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Log {
    private static PrintWriter pw;

    static {
        try {
            pw = new PrintWriter(new FileWriter("log.txt"), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void d(String string){
        pw.println(string);
    }

    static void d(String format, Object...objects){
        pw.printf(format, objects);
    }
}
