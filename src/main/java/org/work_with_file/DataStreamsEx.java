package org.work_with_file;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))
        ){
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeChar(57);
            outputStream.writeInt(57);
            outputStream.writeLong(3_000_000L);
            outputStream.writeFloat(3.14f);
            outputStream.writeDouble(12.34);
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readChar());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

            System.out.println("Done!");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
