package com.dianying.yiran.view;

import com.dianying.yiran.utils.Scannerutils;
import sun.applet.Main;

import java.util.Scanner;

/**
 * @author bagnliu
 * @create 2020-06-07 23:26
 */
public class MovieView {
    public static void main(String[] args) {
        System.out.println("--------欢迎进入一苒电影网站--------");
        System.out.println("1:影片管理\t2:影片查询\t3:退出系统");
        System.out.println("请选择序号");
        Scanner scanner = new Scanner(System.in);
        while (true){
            char select = Scannerutils.readMenuSelect();
            choose_first(select);
        }
    }

    private static void choose_first(int serialNumber) {
        switch (serialNumber) {
            case '1':
                System.out.println("---影片管理---");
                break;
            case '2':
                System.out.println("---影片查询---");
                break;
            default:
                System.exit(0);
        }
    }


}
