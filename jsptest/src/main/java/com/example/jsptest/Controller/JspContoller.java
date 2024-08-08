package com.example.jsptest.Controller;

import com.example.jsptest.Entity.Server;
import com.example.jsptest.Entity.ServerList;
import com.example.jsptest.Service.JspService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class JspContoller {

    @Autowired
    JspService jspService;

    @GetMapping("/ServerSpace")
    public ModelAndView jspTestFunc() throws IOException {
        log.info("-----------------------NEW REQUEST----------------------");
        ArrayList<Server> serverList = ServerList.getServers();
        log.info("Init serverList");
        ArrayList<Server> serverConsumptionOutputList = jspService.findConsumptionForAllServer(serverList);
        log.info("Space consumption computed");
        ModelAndView mav = new ModelAndView("home");
        log.info("ModelAndView created");

        for(Server finalServer : serverConsumptionOutputList){
            if(finalServer == null){
                serverConsumptionOutputList.remove(finalServer);
            }
        }

        log.info("Going to add computedList to Model");

        mav.addObject("finalServerList", serverConsumptionOutputList);

        log.info("Returning from controller");
        return mav;
    }
    @GetMapping("/mysecondhome")
    public String secondHome(){
        return "secondhome";
    }
}
