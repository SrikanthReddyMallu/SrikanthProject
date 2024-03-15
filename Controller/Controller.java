package com.example.PujithaProject.Controller;

import com.example.PujithaProject.Entity.UserData;
import com.example.PujithaProject.Service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller
{
    @Autowired
    UserDataService userDataService;

    @PostMapping("/saveUserData")
    public ModelAndView SaveEmployee(@ModelAttribute("userData") UserData userData)
    {
        ModelAndView model1=new ModelAndView("ViewEntryData");
        UserData user=userDataService.saveUserData(userData);
        System.out.println(user);
        return model1;
    }

    @GetMapping("/viewEntry")
    public ModelAndView viewEntry()
    {
        ModelAndView model2=new ModelAndView("DisplayEntries");
        List<UserData> entries=userDataService.findAll();
        model2.addObject("entrieslist",entries);
        return model2;
    }
}
