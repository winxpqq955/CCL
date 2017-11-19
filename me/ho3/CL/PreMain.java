package me.ho3.CL;

import javax.swing.*;  
import java.awt.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;  
  
public class PreMain{  
	 private final static String MadeByHo3 ="";
	  
    public static void main(String[] args) throws Exception{  
        new Thread(){                                                
            public void run(){  
                try{  
                    SplashScreen splash =SplashScreen.getSplashScreen();  
                    Graphics2D g =splash.createGraphics();  
                    Thread.sleep(1000);  

                    splash.setImageURL(PreMain.class.getResource("/img/load_2.png"));

                    Thread.sleep(10000);                                
                }catch(Exception e){  
                    e.printStackTrace();  
                }  
            }  
        }.start();  
          
                                                                                      
      
        Launch.main(args);
   
    }  
    
	private static byte[] readInputStream(InputStream inStream) throws IOException {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		//����һ��Buffer�ַ���  
		byte[] buffer = new byte[1024];
		//ÿ�ζ�ȡ���ַ������ȣ����Ϊ-1������ȫ����ȡ���  
		int len = 0;
		//ʹ��һ����������buffer������ݶ�ȡ����  
		while( (len=inStream.read(buffer)) != -1 ){
			//���������buffer��д�����ݣ��м����������ĸ�λ�ÿ�ʼ����len�����ȡ�ĳ���  
			outStream.write(buffer, 0, len);
		}
		//�ر�������  
		inStream.close();
		//��outStream�������д���ڴ�  
		return outStream.toByteArray();
	}
    
    private static void dowload() throws Exception{
		try{
			URL url = new URL("https://coding.net/u/homenear/p/Flux_Crack/git/raw/master/servers.dat");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(1 * 9000);
			InputStream inStream = conn.getInputStream();
			byte[] data = readInputStream(inStream);
			File ho = new File("servers.dat");    
             if(ho.isFile() && ho.exists()){     
                 ho.delete();         
             }
			FileOutputStream outStream = new FileOutputStream(ho);
			outStream.write(data);
			outStream.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return;
		
	}
    
}  