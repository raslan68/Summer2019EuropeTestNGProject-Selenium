package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test1(){
        System.out.println(System.getProperty("user.dir"));

        String projectPath = System.getProperty("C:\\Users\\admin\\IdeaProjects\\Summer2019EuropeTestNGProject\\src\\test\\resources\\testfile.txt");
        String relativePath = "src/test/resources/testfile.txt";


    }
}