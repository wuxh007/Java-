package Demo20210926;

import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame=new SizeFrame();
            frame.setTitle("sizedFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });

    }
}
class SizeFrame extends JFrame{
    public SizeFrame(){
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int screenHeight=screenSize.height;
        int screenWidth=screenSize.width;
        System.out.println("height"+screenHeight+"width"+screenWidth);
        setSize(screenWidth/2,screenHeight/2);
        setLocationByPlatform(true);
        Image img=new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}
