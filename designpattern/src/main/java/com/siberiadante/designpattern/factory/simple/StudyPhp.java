package com.siberiadante.designpattern.factory.simple;

/**
 * create date: 2018/11/6
 */
public class StudyPhp implements StudySchool {
    @Override
    public void study() {
        System.out.print("我是来学习Php的！！！");
    }
}