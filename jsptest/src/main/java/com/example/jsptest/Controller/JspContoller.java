package com.example.jsptest.Controller;

import com.example.jsptest.Entity.Server;
import com.example.jsptest.Entity.ServerList;
import com.example.jsptest.Service.JspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class JspContoller {

    @Autowired
    JspService jspService;

    @GetMapping("/ServerSpace")
    public ModelAndView jspTestFunc() throws IOException {

        ArrayList<Server> serverList = ServerList.getServers();

        ArrayList<Server> serverConsumptionOutputList = jspService.findConsumptionForAllServer(serverList);

        ModelAndView mav = new ModelAndView("home");

        for(Server finalServer : serverConsumptionOutputList){
            if(finalServer == null){
                serverConsumptionOutputList.remove(finalServer);
            }
        }

        mav.addObject("finalServerList", serverConsumptionOutputList);

        return mav;
    }
    @GetMapping("/mysecondhome")
    public String secondHome(){
        return "secondhome";
    }
}
