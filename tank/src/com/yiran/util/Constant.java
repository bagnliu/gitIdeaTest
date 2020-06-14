package com.yiran.util;

import java.awt.*;

/**
 * @author bagnliu
 * @create 2020-06-14 22:38
 */
public class Constant {

    /********************游戏窗口*******************************/
    public static final String GAME_TITLE = "坦克大战";

    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;

    static final int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    static final int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
    public static final int FRAME_X = screenWidth - FRAME_WIDTH >> 1;
    public static final int FRAME_Y = screenHeight - FRAME_HEIGHT >> 1;


    /********************游戏菜单*******************************/
    public static final int STATE_MENU = 0;
    public static final int STATE_HELP = 1;
    public static final int STATE_ABOUT = 2;
    public static final int STATE_RUN = 3;
    public static final int STATE_OVER = 4;

    public static final String[] MENUS = {
            "开始游戏",
            "继续游戏",
            "游戏帮助",
            "游戏关于",
            "退出游戏"
    };
    public static final Font GAME_FONT = new Font("宋体",Font.BOLD,24);

}
