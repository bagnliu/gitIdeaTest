package com.yiran.game;

import com.sun.xml.internal.bind.v2.TODO;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.Key;

import static com.yiran.util.Constant.*;


/**
 * @author bagnliu
 * @create 2020-06-14 22:33
 */
public class GameFrame extends Frame{

    public static int gameState;
    private int menuIndex;

    /*
        启动初始化
     */
    public GameFrame() {
        initFrame();
        initEventListener();
        initGame();
    }

    private void initGame() {
        gameState = STATE_MENU;
    }

    /**
     * 窗体属性初始化
     */
    public void initFrame() {
        setTitle(GAME_TITLE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X, FRAME_Y);
        setResizable(false);
        setVisible(true);
        //setBackground(Color.BLACK);
        //repaint();
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.BLACK);
/*        Color color = graphics.getColor();
        graphics.setColor(color);*/
        graphics.setFont(GAME_FONT);
        switch (gameState) {
            case STATE_MENU:
                drawMenu(graphics);
                break;
            case STATE_HELP:
                drawHelp(graphics);
                break;
            case STATE_ABOUT:
                drawAbout(graphics);
                break;
            case STATE_RUN:
                drawRun(graphics);
                break;
            case STATE_OVER:
                drawOver(graphics);
                break;
            /*default:
                throw new IllegalStateException("Unexpected value: " + gameState);*/
        }
    }


    /**
     * 初始化窗口的监听事件
     */
    private void initEventListener() {
        //注册监听事件
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //添加按钮监听事件
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (gameState) {
                    case STATE_MENU:
                        KeyEventMenu(keyCode);
                        break;
                    case STATE_HELP:
                        KeyEventHelp(keyCode);
                        break;
                    case STATE_ABOUT:
                        KeyEventAbout(keyCode);
                        break;
                    case STATE_RUN:
                        KeyEventRun(keyCode);
                        break;
                    case STATE_OVER:
                        KeyEventOver(keyCode);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + gameState);
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });

    }

    private void KeyEventOver(int keyCode) {

    }

    private void KeyEventRun(int keyCode) {

    }

    private void KeyEventAbout(int keyCode) {

    }

    private void KeyEventHelp(int keyCode) {

    }

    private void KeyEventMenu(int keyCode) {
        switch (keyCode) {
            //上键
            case KeyEvent.VK_UP:
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_W:
            case KeyEvent.VK_A:
                if (--menuIndex < 0) {
                    menuIndex = MENUS.length - 1;
                }
                repaint();
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
            case KeyEvent.VK_S:
                if (++menuIndex > MENUS.length - 1) {
                    menuIndex = 0;
                }
                repaint();
                break;
            case KeyEvent.VK_ENTER:
                //TODO
                newGame();
                repaint();
                break;

        }

    }

    private void newGame() {
        gameState = STATE_RUN;
    }

    /**
     * Frame 类的方法，继承下来的方法。该方法负责所有绘图的内容，所有、在此屏幕中显示的内容都需要调用此方法。
     * 用repaint();去调用此方法。
     *
     * @param graphics
     */
/*
    public void update(Graphics graphics) {
        graphics.setFont(GAME_FONT);
        switch (gameState) {
            case STATE_MENU:
                drawMenu(graphics);
                break;
            case STATE_HELP:
                drawHelp(graphics);
                break;
            case STATE_ABOUT:
                drawAbout(graphics);
                break;
            case STATE_RUN:
                drawRun(graphics);
                break;
            case STATE_OVER:
                drawOver(graphics);
                break;



        }
    }
*/
    private void drawMenu(Graphics graphics) {
        graphics.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        final int STR_WIDTH = 100;
        int x = FRAME_WIDTH - STR_WIDTH >> 1;
        int y = FRAME_HEIGHT / 3;
        final int DIS = 55;
        for (int i = 0; i < MENUS.length; i++) {
            if (i == menuIndex) {
                graphics.setColor(Color.RED);

            } else {
                graphics.setColor(Color.WHITE);

            }
            graphics.drawString(MENUS[i], x, y + DIS * i);
        }
    }

    private void drawHelp(Graphics graphics) {
    }

    private void drawAbout(Graphics graphics) {
    }

    private void drawRun(Graphics graphics) {
        graphics.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void drawOver(Graphics graphics) {
    }


}
