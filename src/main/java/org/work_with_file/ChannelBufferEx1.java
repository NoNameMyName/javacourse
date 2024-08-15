package org.work_with_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("test5.txt", "rw");
             FileChannel channel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("read " + byteRead);

                buffer.flip();
                while (buffer.hasRemaining()){
                    stih.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(stih);

            String text = "\n fsdgfsdgsdgfsdffsdfsdfsdfsdgfsd" +
                    "fdgdfgdfgdfgdfsaghjrepijeaivma,;bbte" +
                    "erag4ae56r1g25fd189er" +
                    "ar84eab6v541rfb89ae148frd1b";
            ByteBuffer buffer1 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer1);
//            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length);
//            buffer1.put(text.getBytes());
//            buffer1.flip();
//            channel.write(buffer1);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
