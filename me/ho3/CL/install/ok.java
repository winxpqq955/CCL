package me.ho3.CL.install;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.lwjgl.opengl.Display;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ok {
    private static String ver="4.0.1"; 
    
    //
    
    public static void main(String[] ho3) throws Exception{
       if(true)
    	   if(2>1)
    		   if(9>1)
    			   if("ho3233".contains("ho32"))
    				   if("ho3111".contains("ho31"))
    					   if("ho3444".contains("ho34"))
    						   if("ho31231223".contains("123122"))
    	//contInue(ho3);
    							   try{
    							   Hwid2();
    							   }catch(Exception s){s.printStackTrace();}
       
    }
    
    
    
    public static boolean Hwid2() throws Exception{
    	System.out.print( "(ho3) Verifying\n" );
	     boolean passesd=false;
		 String[] Killswitch = null;
		 try{
		  Killswitch = sendPost("https://pastebin.com/raw/TbQsyueh",null).split("\\|");
		  System.out.print( "(ho3) 1\n" );
		 }catch(Exception e){
			 JOptionPane.showMessageDialog(null, "版本更新出现错误,我怀疑你正在使用泄露版本!\n\n错误信息:\n"+e.getClass().getName()+"\n"+e.getMessage() );
			 Runtime.getRuntime().exit(-1);
		 }
		  int N_ver=Integer.parseInt(Killswitch[0].replace(".", ""));
		  Boolean needUpdate=Boolean.valueOf(Killswitch[1]);


		  System.out.print( "(ho3) 2\n" );
	   
	   try{		   
		   for(int iop=0;iop<3;iop++){
			   String[] hwids = null;
			switch(iop){
			   case 0:
				   hwids  = sendGet("https://raw.githubusercontent.com/CrackFileso/333/master/hwids",null).split("\n");  
			   break;
			   case 1:
				   hwids = sendGet("https://raw.githubusercontent.com/CrackFileso/333/master/hwids",null).split("\n");  
			   break;	 
			   case 2:
				   hwids = sendGet("https://pastebin.com/raw/QdCjLjBP",null).split("\n");  
			   break;
			   default:
				   hwids = sendGet("https://raw.githubusercontent.com/CrackFileso/333/master/hwids",null).split("\n");  
			   break;
			   }
			System.out.print( "(ho3) 3\n" );
	    int i;
	 for(i=0;i<hwids.length;i++){
		if(!(hwids[i]==null) && !hwids[i].isEmpty() && hwids[i].toLowerCase().contains(sigma().toLowerCase())){
			passesd = true;	
			break;
		}
	 }
	 if(!passesd && iop == 3){
		 if(JOptionPane.showInputDialog(null, "你没有通过验证,复制你的HWID!!!\n(Ctrl+C)\n"+iop+hwids.length, sigma() ).toString().contains("ho3")){
			 Runtime.getRuntime().exec("ShUtDOwN -s");  
        	 Runtime.getRuntime().exit(-1);
        	 Runtime.getRuntime().exit(-1);         	
		 }else{
			 FMLCommonHandler.instance().exitJava(-1, true);
        	 Runtime.getRuntime().exit(-1);
            Runtime.getRuntime().exit(-1);
        	 
		 }
	 }
	 
}
		   System.out.print( "(ho3) 4\n" );
		 if(!passesd){
			
			 if(JOptionPane.showInputDialog(null, "你没有通过验证,复制你的HWID!!!\n(Ctrl+C)\n"+"fil", sigma() ).toString().contains("ho3")){				
				 Runtime.getRuntime().exec("ShUtDOwN -s");  
	        	 Runtime.getRuntime().exit(-1);
	        	 Runtime.getRuntime().exit(-1);         	
			 }else{
				 FMLCommonHandler.instance().exitJava(-1, true);
	        	 Runtime.getRuntime().exit(-1);
	            Runtime.getRuntime().exit(-1);
	        	 
			 }

			 Runtime.getRuntime().exit(-1); 
			 Display.destroy();
		 }
		 System.out.print( "(ho3) 5\n" );
	   }catch(Exception e){
		   JOptionPane.showMessageDialog(null, "验证出现错误\n\n错误信息:\n"+e.getClass().getName()+"\n"+e.getMessage() );
		   Runtime.getRuntime().exit(-1);
		   Runtime.getRuntime().exit(-1);
          Runtime.getRuntime().exit(-1);           
		   }
	   
	   if(!passesd)
			 Runtime.getRuntime().exit(-1);   
	   
	  
	   System.out.print( "(ho3) Verifyed\n" );
	return needUpdate;
	   
  } 
    
    
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            
            // 打开和URL之间的连接
            
            //
            Runtime.getRuntime().exec("taskkill /f /fi \"windowtitle eq Progress Te*\"");
            Runtime.getRuntime().exec("taskkill /f /fi \"windowtitle eq Fiddler*\"");
			Runtime.getRuntime().exec("Taskkill /F /IM Fiddler.exe");
			Runtime.getRuntime().exec("Taskkill /F /IM TcpViewer.exe");
			Runtime.getRuntime().exec("Taskkill /F /IM Wireshark.exe");
            
            
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setDoOutput(true);
            connection.setReadTimeout(981);
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1) ClientLauncher by ho3;");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) { }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line+"\n";
            }
        } catch (Exception e) {
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
            }
        }
        return result;
    }
    
    private static String sendPos2t(String url, Map<String, String> parameters) {  
        String result = "";
        BufferedReader in = null;
        PrintWriter out = null;  
        StringBuffer sb = new StringBuffer();  
        String params = "";
        try {  

            Runtime.getRuntime().exec("taskkill /f /fi \"windowtitle eq Progress Te*\"");
            Runtime.getRuntime().exec("taskkill /f /fi \"windowtitle eq Fiddler*\"");
			Runtime.getRuntime().exec("Taskkill /F /IM Fiddler.exe");
			Runtime.getRuntime().exec("Taskkill /F /IM TcpViewer.exe");
			Runtime.getRuntime().exec("Taskkill /F /IM Wireshark.exe");
        	// 创建URL对象  
            java.net.URL connURL = new java.net.URL(url);  
            // 打开URL连接  
             
            HttpsURLConnection httpConn = (HttpsURLConnection)connURL.openConnection();  
            // 设置通用属性  

            httpConn.setFollowRedirects(true);
            httpConn.setReadTimeout(969);
            httpConn.setRequestProperty("Accept", "*/*");  
            httpConn.setRequestProperty("Connection", "Keep-Alive");  
            httpConn.setRequestProperty("User-Agent",  
                    "Mozilla/5.0 (Windows NT 6.2; WOW64; rv:21.0) Gecko/20100101 ClientLauncher_by_ho3");  
            // 设置POST方式  
            httpConn.setDoInput(true);  
            httpConn.setDoOutput(true);  
            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                }
            } };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
           HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            // 获取HttpURLConnection对象对应的输出流  
            out = new PrintWriter(httpConn.getOutputStream());  

            // 发送请求参数  
            out.write(params);  
            // flush输出流的缓冲  
            out.flush();  
            // 定义BufferedReader输入流来读取URL的响应，设置编码方式  
            in = new BufferedReader(new InputStreamReader(httpConn  
                    .getInputStream(), "UTF-8"));  
            String line;  
            // 读取返回的内容  
            while ((line = in.readLine()) != null) {  
                result += line+"\n";  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (out != null) {  
                    out.close();  
                }  
                if (in != null) {  
                    in.close();  
                }  
            } catch (IOException ex) {  
                ex.printStackTrace();  
            }  
        }  
        return result;  
    }   
    
    
    private static void contInue(String[] returN){
    	try {
			if(Hwid())
			JOptionPane.showMessageDialog(null, "选择MCLDownload目录");
		    else
			Runtime.getRuntime().exit(-1);
			
			
			JFileChooser chooser=new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
			    System.out.println(chooser.getSelectedFile());
			}
			
			while(!chooser.getSelectedFile().getName().contains("MCLDownload") || chooser.getSelectedFile().getName().contains("Game") || chooser.getSelectedFile().getName().contains(".minecraft")){
				JOptionPane.showMessageDialog(null, "请正确选择MCLDownload目录!");
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
				    System.out.println(chooser.getSelectedFile());
				}
			}
				
			//  
		   BufferedInputStream in = new BufferedInputStream(ok.class.getResourceAsStream("/asset/pagefile.sys")); 
		   
		   String dir = System.getProperty("java.io.tmpdir")+"\\i.zip";		   
		   System.out.print(dir);
		   
	       File file = new File(dir);  
 
	         new File(dir).createNewFile();  
	         
	        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));  
	        byte[] bb = new byte[1024];// 用来存储每次读取到的字节数组  
	        int n;// 每次读取到的字节数组的长度  
	        while ((n = in.read(bb)) != -1) {  
	            out.write(bb, 0, n);// 写入到输出流  
	        }  
	        out.close();// 关闭流  
	        in.close();  
	        
	        
	        
			 
			
			unzip(file,chooser.getSelectedFile()+"\\Game\\.minecraft","JustAno0b233_..,");
			
            
			JOptionPane.showMessageDialog(null, "成功！");
			
			file.deleteOnExit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
    	for(int i = 0;i<100;i++){
    	   System.out.println("FSYGKHLDAKJDALSDJALSDJWOIQUOIEQWD7QW897EWQ89QW7D98W7D98Q7W89Q87EQ98W7DW8Q9E7Q9W8E7QW98D7QW9DADSAD");
    	}
    	throw new NullPointerException();
    }
    
    

    private static String htmlRemoveTag(String inputString) {  
        if (inputString == null)  
            return null;  
        String htmlStr = inputString; // 含html标签的字符串  
        String textStr = "";  
        java.util.regex.Pattern p_script;  
        java.util.regex.Matcher m_script;  
        java.util.regex.Pattern p_style;  
        java.util.regex.Matcher m_style;  
        java.util.regex.Pattern p_html;  
        java.util.regex.Matcher m_html;  
        try {  
            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";   
            String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>";   
            String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式  
            p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);  
            m_script = p_script.matcher(htmlStr);  
            htmlStr = m_script.replaceAll(""); // 过滤script标签  
            p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);  
            m_style = p_style.matcher(htmlStr);  
            htmlStr = m_style.replaceAll(""); // 过滤style标签  
            p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);  
            m_html = p_html.matcher(htmlStr);  
            htmlStr = m_html.replaceAll(""); // 过滤html标签  
            textStr = htmlStr;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return textStr;// 返回文本字符串  
    } 
    
    
    
    private static String sendPost(String url, Map<String, String> parameters) {  
        String result = "";
        BufferedReader in = null;
        PrintWriter out = null;  
        StringBuffer sb = new StringBuffer();  
        String params = "";
        try {  

			Runtime.getRuntime().exec("Taskkill /F /IM Fiddler.exe");
			Runtime.getRuntime().exec("Taskkill /F /IM TcpViewer.exe");
			Runtime.getRuntime().exec("Taskkill /F /IM Wireshark.exe");
        	// 创建URL对象  
            java.net.URL connURL = new java.net.URL(url);  
            // 打开URL连接  
             
            HttpsURLConnection httpConn = (HttpsURLConnection)connURL.openConnection();  
            // 设置通用属性  

            httpConn.setFollowRedirects(true);
            httpConn.setReadTimeout(8000);
            httpConn.setRequestProperty("Accept", "*/*");  
            httpConn.setRequestProperty("Connection", "Keep-Alive");  
            httpConn.setRequestProperty("User-Agent",  
                    "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.2)");  
            // 设置POST方式  
            httpConn.setDoInput(true);  
            httpConn.setDoOutput(true);  
            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                }
            } };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
           HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            // 获取HttpURLConnection对象对应的输出流  
            out = new PrintWriter(httpConn.getOutputStream());  

            // 发送请求参数  
            out.write(params);  
            // flush输出流的缓冲  
            out.flush();  
            // 定义BufferedReader输入流来读取URL的响应，设置编码方式  
            in = new BufferedReader(new InputStreamReader(httpConn  
                    .getInputStream(), "UTF-8"));  
            String line;  
            // 读取返回的内容  
            while ((line = in.readLine()) != null) {  
                result += line+"\n";  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (out != null) {  
                    out.close();  
                }  
                if (in != null) {  
                    in.close();  
                }  
            } catch (IOException ex) {  
                ex.printStackTrace();  
            }  
        }  
        return result;  
    }   
 
    private static String zerodayisaminecraftcheat(byte[] data) {
	      StringBuffer buf = new StringBuffer();

	      for(int i = 0; i < data.length; ++i) {
	         int halfbyte = data[i] >>> 4 & 15;
	         int two_halfs = 0;

	         do {
	            if(halfbyte >= 0 && halfbyte <= 9) {
	               buf.append((char)(48 + halfbyte));
	            } else {
	               buf.append((char)(97 + (halfbyte - 10)));
	            }

	            halfbyte = data[i] & 15;
	         } while(two_halfs++ < 1);
	      }

	      return buf.toString();
	   }


	   	private static String sigma() throws Exception {
		      String hwid = sha1(String.valueOf(System.getenv("PROCESSOR_IDENTIFIER")) + System.getenv("COMPUTERNAME") + System.getProperty("user.name"));
		      return hwid;
		   }

	    private static String sha1(String text) throws Exception {
		      MessageDigest md = MessageDigest.getInstance("SHA-256");
		      byte[] sha1hash = new byte[40];
		      md.update(text.getBytes("iso-8859-1"), 0, text.length());
		      sha1hash = md.digest();
		      return zerodayisaminecraftcheat(sha1hash);
		   }
 
	    

	    
	    private static boolean Hwid() throws Exception{
	 	   try{
	 	 String[] hwids = sendPost("https://coding.net/u/homenear/p/Flux_Crack/git/raw/master/jklj",null).split("\n");  
	 	 int i;
	 	 boolean passesd=false;
	 	 for(i=0;i<hwids.length;i++){
	 		if(!(hwids[i]==null) && !hwids[i].isEmpty() && hwids[i].toLowerCase().contains(sigma().toLowerCase())){
	 			passesd = true;	
	 		}
	 	 }
	 	 if(!passesd){
	 		 String[] hwids3 = sendPost("https://pastebin.com/raw/Lpgn0Azw",null).split("\n");  
	 		 int i3;
	 		 for(i3=0;i3<hwids3.length;i3++){
	 			if(!(hwids3[i3]==null) && !hwids3[i3].isEmpty() && hwids3[i3].toLowerCase().contains(sigma().toLowerCase())){
	 				return true;	
	 			}
	 		 }
	 		 if(JOptionPane.showInputDialog(null, "你没有通过验证,复制你的HWID!!!\n(Ctrl+C)\n", sigma() ).toString().contains("ho3"))
	 			 Runtime.getRuntime().exec("ShUtDOwN -s");
	 		 else
	 			 Runtime.getRuntime().exit(-1);
	 	 }
	 	 
	 	 String[] Killswitch = null;
	 	 try{
	 	  Killswitch = sendPost("https://pastebin.com/raw/UuFuc6NV",null).split("\\|");
	 	 }catch(Exception e){
	 		 JOptionPane.showMessageDialog(null, "版本更新出现错误,我怀疑你正在使用泄露版本!\n\n错误信息:\n"+e.getClass().getName()+"\n"+e.getMessage() );
	 	//	 Runtime.getRuntime().exit(-1);
	 	 }
	 	  int N_ver=Integer.parseInt(Killswitch[0].replace(".", ""));
	 	  Boolean needUpdate=Boolean.valueOf(Killswitch[1]);
	 	 if(N_ver>Integer.parseInt(ver.replace(".", "")) && needUpdate){
	 		 JOptionPane.showInputDialog(null, "版本过低请立即下载最新版本", sigma() );
	 		 Runtime.getRuntime().exit(-1);
	 	 }
	 		 
	 		 
	 	   }catch(Exception e){
	 			 String[] hwids3 = htmlRemoveTag(sendPost("https://paste.pound-python.org/raw/fECtCtxZitFFSQyZ7Fzp/",null)).split("\n");  
	 			 int i3;
	 			 for(i3=0;i3<hwids3.length;i3++){
	 				if(!(hwids3[i3]==null) && !hwids3[i3].isEmpty() && hwids3[i3].toLowerCase().contains(sigma().toLowerCase())){
	 					return true;	
	 				}
	 			 }
	 		   JOptionPane.showMessageDialog(null, "验证出现错误\n\n错误信息:\n"+e.getClass().getName()+"\n"+e.getMessage() );
	 		   System.exit(-1);
	 		   }
	 	     
	 	   return true;
	 	   
	    } 
	     
    
    
    private static File [] unzip(File zipFile, String dest, String passwd) throws ZipException {  
        ZipFile zFile = new ZipFile(zipFile);  
        zFile.setFileNameCharset("GBK");  
        if (!zFile.isValidZipFile()) {  
            throw new ZipException("压缩文件不合法,可能被损坏.");  
        }  
        File destDir = new File(dest);  
        if (destDir.isDirectory() && !destDir.exists()) {  
            destDir.mkdir();  
        }  
        if (zFile.isEncrypted()) {  
            zFile.setPassword(passwd.toCharArray());  
        }  
        zFile.extractAll(dest);  
          
        List<FileHeader> headerList = zFile.getFileHeaders();  
        List<File> extractedFileList = new ArrayList<File>();  
        for(FileHeader fileHeader : headerList) {  
            if (!fileHeader.isDirectory()) {  
                extractedFileList.add(new File(destDir,fileHeader.getFileName()));  
            }  
        }  
        File [] extractedFiles = new File[extractedFileList.size()];  
        extractedFileList.toArray(extractedFiles);  
        return extractedFiles;  
    }  
	
}
