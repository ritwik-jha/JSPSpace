package com.example.jsptest.Controller;

import com.example.jsptest.Service.JspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;

@RestController
public class JspContoller {

    @Autowired
    JspService jspService;

    @GetMapping("/myhome")
    public ModelAndView jspTestFunc() throws IOException {

        String messg = "welcome to our website";
        String cnt = "1234";

        HashMap<String, Integer> map = new HashMap<>();

        map.put("space_consumed_5366", -1);
        map.put("total_space_5366", -1);
        map.put("space_consumed_259", -1);
        map.put("total_space_259", -1);
        map.put("space_consumed_363", -1);
        map.put("total_space_363", -1);
        map.put("space_consumed_364", -1);
        map.put("total_space_364", -1);
        map.put("space_consumed_365", -1);
        map.put("total_space_365", -1);
        map.put("space_consumed_814", -1);
        map.put("total_space_814", -1);
        map.put("space_consumed_813", -1);
        map.put("total_space_813", -1);
        map.put("space_consumed_5037", -1);
        map.put("total_space_5037", -1);
        map.put("space_consumed_5056", -1);
        map.put("total_space_5056", -1);
        map.put("space_consumed_5119", -1);
        map.put("total_space_5119", -1);


        map = jspService.computeSpaceConsumption(map);


        ModelAndView mav = new ModelAndView("home");

//        model.addAttribute("message", messg);
//        model.addAttribute("cnt", cnt);
        mav.addObject("messg", messg);
        mav.addObject("cnt", cnt);

        mav.addObject("space_consumed_5366", map.get("space_consumed_5366"));
        mav.addObject("total_space_5366", map.get("total_space_5366"));

        mav.addObject("space_consumed_259", map.get("space_consumed_259"));
        mav.addObject("total_space_259", map.get("total_space_259"));

        mav.addObject("space_consumed_363", map.get("space_consumed_363"));
        mav.addObject("total_space_363", map.get("total_space_363"));

        mav.addObject("space_consumed_364", map.get("space_consumed_364"));
        mav.addObject("total_space_364", map.get("total_space_364"));

        mav.addObject("space_consumed_365", map.get("space_consumed_365"));
        mav.addObject("total_space_365", map.get("total_space_365"));

        mav.addObject("space_consumed_814", map.get("space_consumed_814"));
        mav.addObject("total_space_814", map.get("total_space_814"));

        mav.addObject("space_consumed_813", map.get("space_consumed_813"));
        mav.addObject("total_space_813", map.get("total_space_813"));

        mav.addObject("space_consumed_5056", map.get("space_consumed_5056"));
        mav.addObject("total_space_5056", map.get("total_space_5056"));

        mav.addObject("space_consumed_5037", map.get("space_consumed_5037"));
        mav.addObject("total_space_5037", map.get("total_space_5037"));

        mav.addObject("space_consumed_5119", map.get("space_consumed_5119"));
        mav.addObject("total_space_5119", map.get("total_space_5119"));

        return mav;
    }
    @GetMapping("/mysecondhome")
    public String secondHome(){
        return "secondhome";
    }
}
