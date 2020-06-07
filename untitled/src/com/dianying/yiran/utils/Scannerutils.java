package com.dianying.yiran.utils;

import java.util.Scanner;

/**
 * @author bagnliu
 * @create 2020-06-07 23:40
 */
public class Scannerutils {

    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelect() {
        char c;
        while (true) {
            String s = readKeyBoard(1, false);
            c = s.charAt(0);
            if (c != '1' && c != '2' && c != '3') {
                System.out.println("输入错误序号，请重新选择...");
            } else {
                break;
            }
        }
        return c;
    }

    public static String readKeyBoard(int limit, boolean blankReturn) {
        String next = "";
        while (scanner.hasNextLine()) {
            next = scanner.nextLine().trim();
            if (next.length() == 0) {
                if (blankReturn) {
                    return next;
                } else {
                    continue;
                }
            }
            if (next.length() > limit) {
                System.out.println("输入长度不大于（" + limit + "）有误，请重新输入...");
                continue;
            }
            break;
        }

        return next;
    }
}
