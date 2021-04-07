package com.robin.it.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTool {
	
	 public static boolean createFile(File file) throws IOException {
		  if (!file.exists()) {
		   makeDir(file.getParentFile());
		  }
		  return file.createNewFile();
		 }

		 /**
		  * Enhancement of java.io.File#mkdir() Create the given directory . If the
		  * parent folders don't exists, we will create them all.
		  *
		  * @see java.io.File#mkdir()
		  * @param dir
		  *            the directory to be created
		  */
		 public static void makeDir(File dir) {
		  if (!dir.getParentFile().exists()) {
		   makeDir(dir.getParentFile());
		  }
		  dir.mkdir();
		 }

		 public static File createFile(String filePath, String fileName) {
		  try {
		   String fileFullPath = filePath + fileName;
		   System.out.println("The file full path name is : " + fileFullPath);
		   File file = new File(fileFullPath);

		   System.out.println("file.exists()? " + file.exists());
		   boolean created = createFile(file);
		   System.out.println(created ? "File created"
		     : "File exists, not created.");
		   System.out.println("file.exists()? " + file.exists());
		   return file;
		  } catch (IOException e) {
		   e.printStackTrace();
		   return null;
		  }
		 }

		 
		   public static String readFileByLines(File file ) {
		       
		         BufferedReader reader = null;
		         try {
		             System.out.println("以行为单位读取文件内容，一次读一整行：");
		             reader = new BufferedReader(new FileReader(file));
		             String tempString = null;
		             int line = 1;
		             
		             StringBuffer  context = new StringBuffer();
		             // 一次读入一行，直到读入null为文件结束
		             while ((tempString = reader.readLine()) != null) {
		                 // 显示行号
		              context.append(tempString);
		                 System.out.println("line " + line + ": " + tempString);
		                 line++;
		             }
		            // System.out.println(context.toString());
		              String formatStr = context.toString().replaceAll(">\\s+<", "><");
		             //System.out.println( formatStr.replaceAll("\"", "\\\\\""));
		              reader.close();
		             
		             return formatStr;  //replaceAll("\"", "\\\\\"");
		         } catch (IOException e) {
		             e.printStackTrace();
		         } finally {
		             if (reader != null) {
		                 try {
		                     reader.close();
		                 } catch (IOException e1) {
		                	 
		                 }
		             }
		         }
		         return "Fail to read file.";
		     }
		   
		 public static void test2() {
		  File file = new File("F:/temp", "addfile.txt");
		  try {
		   file.createNewFile(); // 创建文件
		  } catch (IOException e) {
		   e.printStackTrace();
		  }

		  // 向文件写入内容(输出流)
		  String str = "亲爱的小南瓜！";
		  byte bt[] = new byte[1024];
		  bt = str.getBytes();
		  try {
		   FileOutputStream in = new FileOutputStream(file);
		   try {
		    in.write(bt, 0, bt.length);
		    in.close();
		    // boolean success=true;
		    // System.out.println("写入文件成功");
		   } catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		  } catch (FileNotFoundException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  try {
		   // 读取文件内容 (输入流)
		   FileInputStream out = new FileInputStream(file);
		   InputStreamReader isr = new InputStreamReader(out);
		   int ch = 0;
		   while ((ch = isr.read()) != -1) {
		    System.out.print((char) ch);
		   }
		  } catch (Exception e) {
		   // TODO: handle exception
		  }

		 }

		 public static void writeFile(File file, String content) {
		  try {
		   FileOutputStream in = new FileOutputStream(file);
		   in.write(content.getBytes(), 0, (content.getBytes()).length);
		   in.close();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		 }

		 public static void readFile(File file) {
		  try {
		   // 读取文件内容 (输入流)
		   FileInputStream out = new FileInputStream(file);
		   InputStreamReader isr = new InputStreamReader(out);
		   int ch = 0;
		   while ((ch = isr.read()) != -1) {
		    System.out.print((char) ch);
		   }
		   isr.close();
		  } catch (Exception e) {
		   e.printStackTrace();
		  }

		 }

		 public static void main(String[] args) {

		  // File file = FileTool.createFile("G:/MyFile/test/", "Dragonfly.txt");

		  // FileTool.writeFile(file, "不要赌命啊！！！");

		   File fileObject = new File("G:/EDI/SONIM_EDI_856_20150511.txt");
		  //FileTool.readFile(fileObject);
		 
		   String fileContent = FileTool.readFileByLines(fileObject);
		 
		   File newFile = FileTool.createFile("G:/MyFile/test/", "Dragonfly.txt");
		         FileTool.writeFile(newFile, fileContent);
		 
		 

		 }

}
