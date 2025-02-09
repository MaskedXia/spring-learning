package com.pipe.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

public class UrlResourceDemo {

    public static void main(String[] args) {
        loadUrlResource("http://www.baidu.com");
        System.out.println();
        loadUrlResource("file:test.txt");
    }

    //访问前缀http、file
    public static  void loadUrlResource(String path)
    {
        try {
            UrlResource url = new UrlResource(path);
            System.out.println(url.getFilename());
            System.out.println(url.getURL());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
