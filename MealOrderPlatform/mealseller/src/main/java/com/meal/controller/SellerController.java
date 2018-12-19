package com.meal.controller;

import com.meal.commons.CheckResult;
import com.meal.pojo.Seller;
import com.meal.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
@author 汪培林

@create 2018-12-04-15:46
*/
@Controller
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CheckResult loginCheck(HttpServletRequest request,
                                  HttpServletResponse response,
                                  @RequestParam("loginId") String loginId,
                                  @RequestParam("password") String password){
        Seller seller=new Seller();
        seller.setLoginid(loginId);
        seller.setPassword(password);
        return sellerService.loginCheck(request, response, seller);
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginForm(){
        return "login";
    }

    @RequestMapping(value = "/logOff/{sellerId}")
    @ResponseBody
    public int logOff(@PathVariable int sellerId){
        return sellerService.logout(sellerId);
    }

    @RequestMapping(value = "/applicationAgain/{sellerId}")
    @ResponseBody
    public int applicationAgain(@PathVariable int sellerId,
                                @RequestBody Seller seller){
        return sellerService.ApplicationAgain(sellerId, seller);
    }

    @RequestMapping(value = "/logout")
    public String logOut(HttpSession session,HttpServletRequest request){
        session.removeAttribute("seller");

        session.invalidate();

        return "login";
    }

}
