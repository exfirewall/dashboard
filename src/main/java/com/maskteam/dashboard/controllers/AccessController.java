package com.maskteam.dashboard.controllers;

import javax.websocket.server.ServerEndpoint;

import com.maskteam.dashboard.DTO.AccessTimeDTO;
import com.maskteam.dashboard.models.AccessTime;
import com.maskteam.dashboard.models.Employee;
import com.maskteam.dashboard.services.AccessTimeService;
import com.maskteam.dashboard.services.EmployeeService;

import java.util.List;
import java.util.Optional;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.websocket.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ServerEndpoint(value="/accesstime")
public class AccessController extends Thread{
    
    @Autowired
    private AccessTimeService accessTimeService;

    public String inmessage;

    public void saveAccess(String message){
         Calendar cal = Calendar.getInstance();
         AccessTime accessTime = new AccessTime();
         System.out.println("here");
         //System.out.println("id = " + id);
         //accessTime.setId(id);
         accessTime.setUsername(message);
         accessTime.setCreateDate(new Timestamp(cal.getTimeInMillis()));
         accessTimeService.save(accessTime);
    }

    public AccessController(){
        System.out.println("웹소켓(서버) 객체 생성");
    }

    @OnOpen
    public void handleOpen(Session session){
        System.out.println("client is now connected...");   
    }

    @OnMessage
    public String handleMessage(String message, Session session){
        System.out.println("receive from client : "+message);
        String replymessage = "echo "+message;
        this.inmessage = message;
        System.out.println("send to client : "+replymessage);
        return replymessage;
    }
    
    @OnClose
    public void handleClose(){
        System.out.println("client is now disconnected...");
        //saveAccess(inmessage);
    }

    @OnError
    public void handleError(Throwable t){
        t.printStackTrace();
    }

    public String getmessage(){
        return inmessage;
    }
    @GetMapping("/accesstime")
    public String getAccessTime(Model model) {
        List<AccessTimeDTO> accessList = accessTimeService.getAccesslist();
        model.addAttribute("access", accessList);
        return "accesstime";
    }

}
