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
		//创建一个Buffer字符串  
		byte[] buffer = new byte[1024];
		//每次读取的字符串长度，如果为-1，代表全部读取完毕  
		int len = 0;
		//使用一个输入流从buffer里把数据读取出来  
		while( (len=inStream.read(buffer)) != -1 ){
			//用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度  
			outStream.write(buffer, 0, len);
		}
		//关闭输入流  
		inStream.close();
		//把outStream里的数据写入内存  
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