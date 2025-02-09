package com.pipe.spring6.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;

public class ClasspathResourceDemo {

    public static void main(String[] args) {
        loadClasspathResource("pipe.txt");
    }

    public static  void loadClasspathResource(String path)
    {
        try {
            ClassPathResource resource = new ClassPathResource(path);
            System.out.println(resource.getFilename());
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
