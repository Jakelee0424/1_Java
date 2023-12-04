package edu.kh.io.model.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoService {
	Scanner sc = new Scanner(System.in);

	// IO (Input&Output)
	
	// input(입력) : 외부에서 내부로 데이터를 들여보내는 것
	// Output(출력) : 내부에서 외부로 데이터를 내보내는 것
	
	// Stream : 입/출력의 통로 역할(데이터가 흘러가는 통로)
	// 			기본적으로 단방향
	
	
	/**
	 * 파일 출력 메서드(바이트 기반)
	 */
	public void output1() {
		// (내부 == 프로그램, 외부 == 파일)
		// 바이트 기반 스트림
		
		FileOutputStream fos = null;
		
		// FileOutputStream 객체 생성 시
		// FileNotFoundException / IOException(FileNotFoundException의 부모임) 예외 발생 가능성 존재 -> 예외 처리 필요
		
		try {
			
			fos = new FileOutputStream("test1.txt");
			// 현재 프로그램에서 test1.txt 파일로 출력하는 통로객체 생성
			
			String str = "hello"; // 파일에 "Hello" 내보내기
			
			for(int i = 0 ; i < str.length() ; i++) {
				
				 fos.write(str.charAt(i)); //"Hello"를 한글자씩 끊어서 파일로 출력
				// write 는 IOException을 발생시킬 가능성 존재
			}
			
		}catch(IOException e) {
			
			System.out.println("예외 발생");
			e.printStackTrace(); // 예외 추적
			
		}finally{  					
											// 예외가 발생하던 말던 수행
			try {	   						// 사용한 Stream 자원 반환(통로 없앰) -> 필수 작성 
			fos.close();					// 프로그램 메모리 관리 차원, but 항상 해주어야함
			}catch(IOException e){			// 에러는 없지만 문제점
				e.printStackTrace(); 	
			}
			
		}
		
	}
	
	/**
	 * 파일 출력 메서드(문자기반)
	 */
	public void output2() {
		
		FileWriter fw = null; // 프로그램 -> 파일로 쓰는 문자기반 스트림
		
		try {
			
			fw = new FileWriter("test1.txt"); // 외부 파일과 연결하는 스트림 객체 생성
			
			String str = "Hey 모두들 안녕 내가 누군지 아니 ?";
			
			fw.write(str);
			// close 안해주면 출력 안됨
			// --> 한 줄을 통째로 보내기 위해서 "버퍼" 사용 
			// 	   버퍼에 담긴 상태를 강제로 밀어, 버퍼를 지워내야함 (close 구문으로)
			
			// close()구문은 통로에 남아있는 내용을 내보내고 통로를 없앤다. 
			
		}catch(IOException e) {
			e.printStackTrace();			
		}finally {
			
			try {
			fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
	/**
	 * 파일 입력 메서드(바이트 기반) 
	 */
	public void input1() {
		// 파일 입력 : 외부(파일) -> 내부(프로그램)으로 읽어오기
		
		FileInputStream fis = null;
		// 파일에서 프로그램으로 읽어오는 바이트 기반 스트림
		
		try {
			
			fis = new FileInputStream("test1.txt");
			
			//FileInputStream 은 1 byte씩만 읽어올 수 있다.
			
			while(true) {
				int data = fis.read(); // 다음 1byte를 읽어오는데 정수형임
									   // 다음 내용이 없으면 -1을 반환
				if(data == -1) { // 다음 내용이 없으면 종료
					break;
				}
				//반복종료가 안되면 char로 강제 형변환
				System.out.print((char)data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	/**
	 * 파일 입력 메서드(문자기반)
	 */
	public void input2() {
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("test1.txt");
			
			while(true) {
				
				int data = fr.read(); // 다음 한 문자를 읽어옴, 없으면 -1
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
