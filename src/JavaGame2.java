import javax.swing.*;
import java.awt.*;

    public class JavaGame2 extends JFrame {

        Image ball = Toolkit.getDefaultToolkit().getImage("img/ball.png");
        Image desk = Toolkit.getDefaultToolkit().getImage("img/table.jpg");

        double  x=100;    //С��ĺ�����
        double  y=100; //С���������

        double degree = 3.14/3; //���� 60��
        //�����ڵķ���
              public void paint(Graphics  g){
                System.out.println("���ڱ�����һ�Σ�");
                g.drawImage(desk, 0, 0, null);
                g.drawImage(ball, (int)x, (int)y, null);

            x = x + 10*Math.cos(degree);
            y = y + 10*Math.sin(degree);

            if(y>500-40-30||y< 40+40){ //��ȥ���ӱ߿�ʹ��ڱ߿�
                degree= -degree;
            }
            if(x<40||x>856-40-30){
                degree =3.14-degree;

            }
        }

        //���ڼ���
        void launchFrame(){
            setSize(856,500);
            setLocation(50,50);
            setVisible(true);

            // �ػ�����  1s/25
            while (true){
                repaint();
                try{
                    Thread.sleep(40);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        //����ִ�����
        public static void main(String[] args){
            System.out.println(" ��ʼ��");
            JavaGame2 game = new JavaGame2();
            game.launchFrame();
        }

    }
