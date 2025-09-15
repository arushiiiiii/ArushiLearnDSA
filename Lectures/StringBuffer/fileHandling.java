import java.io.*;

public class fileHandling {
    public static void main(String[] args) throws Exception{
//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.println("Enter some letters: ");
//            int letters = isr.read();
//            while (isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            isr.close();  // waise toh it will close automatically
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (FileReader fr = new FileReader("note.txt")) {
//            int letters = fr.read();
//            while (fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
////            fr.close();
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // InputStreamReader is converting byte string into character string and then BufferedReader is reading that
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {   // use this line for fast input output in java for example in competitions
//            System.out.println("You typed: " + br.readLine());
//        } catch  (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
//            while (br.ready()) {
//                br.readLine();
//            }
//            System.out.println("You typed: " + br.readLine());
//        } catch  (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // output
//        OutputStream os = System.out;
//        os.write(🔮); won't print as range is exceeded
//        System.out.println();

//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("Hello");
//            osw.write(97);
//            osw.write('\n');
//            osw.write('A');
//            osw.write('\n');
//            char[] arr = "hello world".toCharArray();
//            osw.write(arr);
////            os.write(🔮);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try (FileWriter fw = new FileWriter("note.txt", true)) {
            fw.write("this should append");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
            bw.write("Hey");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
