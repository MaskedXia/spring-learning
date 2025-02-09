package com.pipe.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

public class FileSystemResourceDemo {
    public static void main(String[] args) {
        loadFileSystemResource("C:\\Users\\pipe\\Desktop\\spring\\test.txt");
        System.out.println();
        loadFileSystemResource("test.txt");
    }

    //访问前缀http、file
    public static  void loadFileSystemResource(String path)
    {
        try {
            FileSystemResource resource = new FileSystemResource(path);
            System.out.println(resource.getFilename());
            System.out.println(resource.getURL());
            System.out.println(resource.getDescription());
            InputStream inputStream = resource.getInputStream();
            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes) != -1){
                System.out.println(new String(bytes));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
