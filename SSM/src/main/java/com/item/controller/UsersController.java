package com.item.controller;

import com.item.model.Users;
import com.item.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@CrossOrigin
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/GetInfoApi")
    @ResponseBody
    public Object GetInfoApi(){
        List<Users> list=usersService.GetInfo();
        System.out.println(list);
        return list;
    }
    @RequestMapping("/GetInfo")
    public String GetInfo(HttpServletRequest request,Model model){
        List<Users> list=usersService.GetInfo();
        model.addAttribute("lists",list);
        return "GetInfo";
    }

    @RequestMapping("/GetName")
    public String GetName(HttpServletRequest request,Model model){
        String nickName = request.getParameter("nickName");
        List<Users> list=usersService.SelectName(nickName);
        model.addAttribute("lists",list);
        return "GetInfo";
    }

    /**
     * 添加页面
     * @param request
     * @param model
     * @return
     */
    @GetMapping("/UserAddInfo")
    public String UserAddInfo(HttpServletRequest request,Model model){
        return "UserAddInfo";
    }

    /**
     * 添加接口，访问方式post
     * @param request
     * @param model
     * @return
     */
    @PostMapping(value = "/UserAddInfoApi")
    public String UserAddInfoApi(HttpServletRequest request,Model model){
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        String nickName = request.getParameter("nickName");
        usersService.UsersAddInfo(userName, pwd, nickName);
        return "redirect:/GetInfo";
    }

    /**
     * 修改页面
     * @param request
     * @param model
     * @return
     */
    @GetMapping("/UserUpdateInfo")
    public String UserUpdateInfo(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        Users users = usersService.UsersSelectById(Integer.parseInt(id));
        model.addAttribute("users",users);
        return "UserUpdateInfo";
    }

    /**
     * 修改api
     * @param request
     * @param model
     * @return
     */
    @PostMapping(value = "/UserUpdateInfoApi")
    public String UserUpdateInfoApi(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        usersService.UsersUpdateInfo(pwd,Integer.parseInt(id));
        return "redirect:/GetInfo";
    }

    /**
     * 删除api
     * @param request
     * @param model
     * @return
     */
    @GetMapping(value = "/UsersDeleteById")
    public String UsersDeleteById(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        usersService.UsersDeleteById(Integer.parseInt(id));
        return "redirect:/GetInfo";
    }
}