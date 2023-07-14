package org.example.zaur;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferReading {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("testText.txt", "rw");//создаем файл
            FileChannel channel = file.getChannel();//создаем канал общения с файлом
        ){
            ByteBuffer buffer = ByteBuffer.allocate(25);//создаем баффер размера 25
            StringBuilder text = new StringBuilder();

            int byteRead = channel.read(buffer);//читаем файл, записывая в баффер по 25 байтов
            while (byteRead>0){
                buffer.flip();//меняем позицию/поинтер с 24 на 0, можем читать инфу из буфера

                while (buffer.hasRemaining()){//пока у буффера есть что читать (позиция не равна 24)
                    text.append((char) buffer.get());//из баффера достаем по байту
                }
                buffer.clear();//позиция опять на нулевой ячейке, буффер готов к записи
                byteRead = channel.read(buffer);//читаем следующие символы, пока есть место в буфере/не закончились символы
            }
            System.out.println(text);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
