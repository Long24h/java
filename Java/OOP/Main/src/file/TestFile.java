package file;

import java.io.*;

public class TestFile {
    public static void writeFile() {
        try {
            FileWriter fr = new FileWriter("data//test");
            fr.append("irh");
            fr.write("grge");
            fr.append("vn");
            fr.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void writeFileBuffer() {
        try {
//            File file = new File("data//test1");
            FileWriter fw = new FileWriter("data//test1");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("bnsui");
            bw.write("brbr\n");
            bw.write("bdkl");
            bw.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void readFile() {
        try {
//        File file = new File("data//test1");
            FileReader fr = new FileReader("data//test1");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException f) {
            f.getMessage();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void dataOutputStream(int[] numbers) {
        try {
            FileOutputStream fos = new FileOutputStream("data//test2.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            for (int item : numbers) {
                dos.writeInt(item);
            }
            dos.close();
        } catch (FileNotFoundException f) {
            f.getMessage();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void dataInputStream() {
        try {
            FileInputStream fis = new FileInputStream("data//test2.txt");
            DataInputStream dis = new DataInputStream(fis);
            while (true) {
                System.out.println(dis.readInt());
            }
        } catch (FileNotFoundException f) {
            f.getMessage();
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

    public static void main(String[] args) {
        int[] numbers = {23,96,63,14,764,15,-1};
//        writeFile();
//        writeFileBuffer();
//        readFile();
//        dataOutputStream(numbers);
        dataInputStream();
    }

}
