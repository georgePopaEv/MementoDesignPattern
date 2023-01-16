package Example;

public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First Set of Data:\nMyra\nLucy\n");

        System.out.println(fileWriterUtil + "\n\n");

        //lets save the file
        caretaker.save(fileWriterUtil);

        //now write something else
        fileWriterUtil.write("Second set of data:\nJason\n");

        //checking file contents
        System.out.println(fileWriterUtil + "\n\n");

        //lets undo to last save
        caretaker.undo(fileWriterUtil);

        System.out.println(fileWriterUtil + "\n\n");
    }
}
