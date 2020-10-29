package com.maskteam.dashboard.client;

import java.io.*;
import java.net.Socket;

public class RaspClient {
    Socket socket = null;
	String serverIp = "192.168.43.187";
	int serverPort = 8080;
	Integer flag;
    String result;
    
    public RaspClient(Integer flag) {
		this.flag = flag;
        System.out.println("서버에 연결 시도....");
		try {
			// 서버 연결
			socket = new Socket(serverIp, serverPort); // socket(),connect();
			System.out.println("서버에 연결되었습니다.");
            System.out.println(serverIp + " : " + serverPort);
            
			Send(socket, 1);
			System.out.println("result from server : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}// catch
    }
    
    public void Send(Socket socket, Integer flag) throws IOException {

        byte data = Byte.parseByte(Integer.toString(flag));
        //서버로 내보내기 위한 출력 스트림 뚫음
        OutputStream os = socket.getOutputStream();
        //출력 스트림에 데이터 씀
        os.write(data);
        //보냄
        os.flush();
    }
	
	public String getResult() {
		return result;
	}
}
