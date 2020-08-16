import javax.swing.*;
import java.awt.*;

    public class JavaGame2 extends JFrame {

        Image ball = Toolkit.getDefaultToolkit().getImage("img/ball.png");
        Image desk = Toolkit.getDefaultToolkit().getImage("img/table.jpg");

        double  x=100;    //小球的横坐标
        double  y=100; //小球的纵坐标

        double degree = 3.14/3; //弧度 60；
        //画窗口的方法
              public void paint(Graphics  g){
                System.out.println("窗口被画了一次！");
                g.drawImage(desk, 0, 0, null);
                g.drawImage(ball, (int)x, (int)y, null);

            x = x + 10*Math.cos(degree);
            y = y + 10*Math.sin(degree);

            if(y>500-40-30||y< 40+40){ //除去桌子边框和窗口边框
                degree= -degree;
            }
            if(x<40||x>856-40-30){
                degree =3.14-degree;

            }
        }

        //窗口加载
        void launchFrame(){
            setSize(856,500);
            setLocation(50,50);
            setVisible(true);

            // 重画窗口  1s/25
            while (true){
                repaint();
                try{
                    Thread.sleep(40);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        //程序执行入口
        public static void main(String[] args){
            System.out.println(" 开始！");
            JavaGame2 game = new JavaGame2();
            game.launchFrame();
        }

    }
