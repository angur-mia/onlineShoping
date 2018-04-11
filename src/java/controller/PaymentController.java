/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ListDAO;
import dao.PaymentDao;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Choose;
import model.Sell;
import model.ShopUser;
import model.UserTrans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Lenovo
 */
@Controller
public class PaymentController {

    @RequestMapping("paymentsuccess")
    public String paymentSucess(HttpServletRequest request, @ModelAttribute("shopUser") ShopUser shopUser, Model m) {
        PaymentDao pay = new PaymentDao();
        String ip = request.getRemoteAddr();
        String user = shopUser.getEmail();
        String tx=request.getParameter("tx");
       
        m.addAttribute("ip",ip);
        m.addAttribute("user",user);
        m.addAttribute("tx",tx);
       
 boolean b=pay.sellTransDelCart(ip, user, tx);
       
       if(b){
       pay.deleCartIp(ip);
      
       }
       
       
       
        return "info.jsp";
    }

}
