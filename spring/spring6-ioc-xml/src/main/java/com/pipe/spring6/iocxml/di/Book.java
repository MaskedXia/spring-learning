package com.pipe.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    public Book() {
        System.out.println("无参构造...");
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
        System.out.println("带参构造...");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // set注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("pipeline");

        // 构造器注入
        Book book2 = new Book("c++", "pipeline");
    }
}
