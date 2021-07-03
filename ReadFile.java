import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
public class ReadFile {
    public static void main(String args[])	{
        new NetWin();
    }
}
class NetWin extends JFrame implements ActionListener,Runnable {
    JButton button;
    URL url;
    JTextField inputURLText;	//输入URL
    JTextArea area;
    byte b[]=new byte[118];
    Thread thread;
    NetWin() {
        inputURLText=new JTextField(30);
        area=new JTextArea(12,12);
        button=new JButton("确定");
        button.addActionListener(this);
        thread=new Thread(this);
        JPanel p=new JPanel();
        p.add(new JLabel("输入网址:"));
        p.add(inputURLText);
        p.add(button);
        add(area,BorderLayout.CENTER);
        add(p,BorderLayout.NORTH);
        setBounds(60,60,560,300);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if(!(thread.isAlive()))
            thread=new Thread(this);
        try{ thread.start();
        }
        catch(Exception ee) {
            inputURLText.setText("我正在读取"+url);
        }
    }
    public void run() {
        try { int n=-1;
            area.setText(null);
            String name=inputURLText.getText().trim();
            url=new URL(name);		//使用字符串name创建URL对象
            String hostName=url.getHost();		//URL调用getHost()
            int urlPortNumber=url.getPort();
            String fileName=url.getFile();
            InputStream in=url.openStream();		//URL调用方法返回一个输入流
            area.append("\n主机:"+hostName+"端口:"+urlPortNumber+"包含的文件名字:"+fileName);
            while((n=in.read(b))!=-1) {
                String s=new String(b,0,n);
                area.append(s);
            }
        }
        catch(MalformedURLException e1)	{
            inputURLText.setText(""+e1);
            return;
        }
        catch(IOException e1) {
            inputURLText.setText(""+e1);
            return;
        }
    }
}