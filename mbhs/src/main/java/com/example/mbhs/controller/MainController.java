package com.example.mbhs.controller;

import com.example.mbhs.databaseresp.Userdataresp;
import com.example.mbhs.userdata.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @Autowired
    private Userdataresp userdataresp;


    @RequestMapping(value = "/addUserDataToDBMS", method = RequestMethod.POST)
    public String addUserDataToDBMS(@ModelAttribute User user, Model model){
        //System.out.println("yobxbb");
        userdataresp.save(user);
        return "redirect:/signin";
    }
    @RequestMapping("/homepage")
    public String homepage(){
        return "Homepage";
    }
    @RequestMapping("/signup")
    public String signup(){
        return "SignUp";
    }
    @RequestMapping("/signin")
    public String signin(){
        return "SignIn";
    }
    @RequestMapping("/browse")
    public String browse(){
        return "browse";
    }
    @RequestMapping("/valorant")
    public String valorant(){
        return "valorant";
    }
    @RequestMapping("/video")
    public String video(){
        return "video";
    }
}
