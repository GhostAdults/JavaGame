	import  java.awt.*;
	import javax.swing.*;
	  
	public class JavaGame extends JFrame {
	      
	    Image ball = Toolkit.getDefaultToolkit().getImage("img/ball.png");
	    Image desk = Toolkit.getDefaultToolkit().getImage("img/table.jpg");
	     
	    double  x=100;    //С��ĺ�����
	    double  y=100; //С���������
		boolean right = true; //����
	    //�����ڵķ���
	    public void paint(Graphics  g){
	        System.out.println("���ڱ�����һ�Σ�");
	        g.drawImage(desk, 0, 0, null);
	        g.drawImage(ball, (int)x, (int)y, null);

	        if(right){
				x = x + 10;
			}else{
	        	x=x-10;
			}
	        if (x>856-40-30){
	        	right=false;
			}
	        if(x<40){  //���ӱ߿�Ŀ��
	        	right=true;
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
	        JavaGame game = new JavaGame();
	        game.launchFrame();
	    }
	     
	}
