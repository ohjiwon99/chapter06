package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket();
		System.out.println("<클라이언트 시작>");
		System.out.println("======================================");

		// 컨넥
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("192.168.0.74", 10001));

		System.out.println("[서버에 연결 되었습니다.]");

		// 메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		// OutputStream out = new FileOutputStream("파일경로"); 파일일때는 이렇게 했다

		// 메세지 받기용 스트림
		InputStream ir = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(ir, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//키보드입력
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// 메세지 보내기
		bw.write("안녕하세요");
		bw.newLine();
		bw.flush();

		// 메세지 받기
		String remsg = br.readLine();
		System.out.println("server:[" + remsg + "]");

		// 닫기
		br.close();
		bw.close();
		socket.close();
		sc.close();
	}

}
