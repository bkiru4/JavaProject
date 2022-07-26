package Finished;

import java.io.*;

public class TextFileMakerReader {
    public static void main(String[] args) throws IOException {

        //MAKES NEW TXT FILE (*** it will replace the old file ***)
        FileWriter fWriter = new FileWriter("C:\\Users\\bkiru\\Desktop\\FW JAVA TEST.txt");
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        bWriter.write("Hey, Hows it going Kiru?");
        bWriter.newLine();
        bWriter.write("Nothing much. Hows it going with you?");
        bWriter.newLine();
        bWriter.newLine();
        bWriter.write("Output file from BufferedWriter and FileWriter");
        bWriter.close(); // CLOSE WRITER

        //READ NEW TXT FILE
        FileReader fReader = new FileReader("C:\\Users\\bkiru\\Desktop\\FW JAVA TEST.txt");
        BufferedReader bReader = new BufferedReader(fReader);
        boolean read = true;
        while(read){
            String reading = bReader.readLine();
            if(reading != null) {
                System.out.println(reading);
            }else{
                read = false;
            }
        }
        bReader.close(); // CLOSE READER

        // GIVES CHAR VALUE OF NEXT CHARACTER
//        System.out.println(bReader.read());


        // MAKES LIST WITH EACH LINE AS AN ELEMENT
//        List<String> list = new ArrayList<>();
//        list = bReader.lines()
//                .collect(Collectors.toList());
//        System.out.println(list.get(0));

    }
}
