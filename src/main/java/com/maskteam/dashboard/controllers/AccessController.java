package com.maskteam.dashboard.controllers;

import javax.websocket.server.ServerEndpoint;
import javax.websocket.*;
import org.springframework.stereotype.Controller;

@Controller
@ServerEndpoint("/websocket")
public class AccessController {
    @OnOpen
    public void handleOpen(){
        System.out.println("client is now connected...");
    }

    @OnMessage
    public String handleMessage(String message){
        System.out.println("receive from client : "+message);
        String replymessage = "echo "+message;
        System.out.println("send to client : "+replymessage);
        return replymessage;
    }
    
    @OnClose
    public void handleClose(){
        System.out.println("client is now disconnected...");
    }
    @OnError
    public void handleError(Throwable t){
        t.printStackTrace();
    }
}
