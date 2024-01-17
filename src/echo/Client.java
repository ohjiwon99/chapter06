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

		// 키보드입력(스캐너 준비)
		 Scanner sc = new Scanner(System.in);

		/*InputStream sc = System.in;
		InputStreamReader scIsr = new InputStreamReader(sc, "UTF-8");
		BufferedReader scBr = new BufferedReader(scIsr);*/

		while (true) {
			// 메세지 받기
			 String str = sc.nextLine();
			//String str = scBr.readLine();

			if ("/q".equals(str)) {
				break;
			}
		}

		// 메세지 보내기
		bw.write("str");
		bw.newLine();
		bw.flush();

		// 메세지 받기
		String remsg = br.readLine();
		System.out.println("server:[" + remsg + "]");

		// 닫기
		System.out.println("============================");
		System.out.println("클라이언트 종료");
		
		
		
		
		
		////////////////////////////////////////////
		// 메세지 보내기용 스트림
		
		//println만들기
				OutputStream pos = System.out;
				OutputStreamWriter posw = new OutputStreamWriter(pos,"UTF-8");
				BufferedWriter pbw = new BufferedWriter(posw);
		pbw.write("println 테스트");
		pbw.newLine();
		pbw.flush();
		
		
		
		br.close();
		bw.close();
		socket.close();
		sc.close();
	}

}
