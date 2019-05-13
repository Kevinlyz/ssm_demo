package com.qcby.web;


import com.qcby.entity.Area;
import com.qcby.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    AreaService areaService;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest request){
        List<Area> list = areaService.queryList();
        System.out.println(list);
        model.addAttribute("name",list);
        return "login";
    }
}
