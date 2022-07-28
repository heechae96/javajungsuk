package ch15;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

// File
public class Ch15_30 {
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("USAGE : java Ch15_30 DIRECTORY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다");
			System.exit(0);
		}
		
		printFileList(dir);
		
		System.out.println();
		System.out.println("총 " + totalFiles + "개의 파일");
		System.out.println("총 " + totalDirs + "개의 디렉토리");
	}
	
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + " 디렉토리");
		File[] files = dir.listFiles();		// 디렉토리를 포함한다
		
		ArrayList subDir = new ArrayList();
		
		for(int i=0; i<files.length; i++) {
			String filename = files[i].getName();
			
			if(files[i].isDirectory()) {
				filename = "[" + filename + "]";
				subDir.add(i+"");
			}
			System.out.println(filename);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "개의 파일, " + dirNum + "개의 디렉토리");
		System.out.println();
		
		for(int i=0; i<subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
//			System.out.println(index + "test!!!!!!");
//			System.out.println(Arrays.toString(files) + "test!!!!!!");
			printFileList(files[index]);
		}
	}

}