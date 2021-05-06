##rsschool-cv

#Nurdaulet

+ Contacts
    * E-mail:180107175@stu.sdu.edu.kz
    * Telegram:@kkadrvn
    * Phone:+77767927546
    ___
##About me 

I am a Junior java developer who wants to switch to Android development. 
At the moment I have no work experience, but I have done a lot of projects related to java and kotlin.Now I am studying in the specialty of a programmer,I also actively use my free time to learn new things or develop my software skills.Now I want to develop as an Android developer and become a professional in it
____
##Tech Skills
* OOP(Java,C#,C++,Kotlin)
* Unity
* HTML,CSS
* SQL(Oracle,Pl/SQL,MySQl)
---
##Code examples
~~~
package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Scanner;
class GameWindow extends JFrame {
    private static GameWindow game_window;
    private static long last_frame_time;
    private static Image background;
    private static Image drop;
    private static Image game_over;
    private static float drop_left=200;
    private static float drop_top=-100;
    private static float drop_v=200;
    private static int score;
    public static void main(String[] args) throws IOException {
        background= ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        drop= ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));
        game_over= ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));
        game_window=new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(200,100);
        game_window.setSize(906,478);
        game_window.setResizable(false);
        last_frame_time=System.nanoTime();
        GameField game_field=new GameField();
        game_field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x=e.getX();
                int y=e.getY();
                float drop_right=drop_left+drop.getWidth(null);
                float drop_bottom=drop_top+drop.getHeight(null);
                boolean is_drop=x>=drop_left && x<=drop_right && y>=drop_top && y<=drop_bottom;
                if (is_drop){
                    drop_top=-100;
                    drop_left=(int)(Math.random() * (game_field.getWidth()-drop.getWidth(null)));
                    drop_v=drop_v+20;
                    score++;
                    game_window.setTitle("Score: "+score);
                }
            }
        });
        game_window.add(game_field);
        game_window.setVisible(true);
    }
    private static void onRepaint(Graphics g){
        long current_time=System.nanoTime();
        float delta_time=(current_time-last_frame_time)*0.000000001f;
        last_frame_time=current_time;
        drop_top=drop_top+drop_v*delta_time;
        g.drawImage(background,0,0,null);
        g.drawImage(drop,(int)drop_left,(int)drop_top,null);
        if (drop_top>game_window.getHeight())g.drawImage(game_over,280,120,null);
}
    private static class GameField extends JPanel{

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            onRepaint(g);
            repaint();
        }
    }
}
~~~
##Experience
I did a couple of projects from the Jetbrains academy course, I also took special courses on web development .My projects on java you can see [here](https://github.com/naik33/Java/tree/master/project)

---
##Education
* SDU(3 course,Almaty,Kazakhstan)
* Jetbrains academy
* Geekbrains-java разработка с нуля
* [Udemy] [Timur Mashnin] Java + Android 
* Youtube
---
##English
Level:B1
I took a course at the university, it lasted 2-3 months. I also continue to study through Youtube