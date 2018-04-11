/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.AddDAO;
import dao.ListDAO;
import dao.WishListDao;
import model.Product;
import model.ShopUser;
import dao.UserDao;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    UserDao da=new UserDao();
    
    
    @RequestMapping("userloggin")
    public String gouserLogginPage() {
        return "/public/login.jsp";
    }
    
    
    
 @RequestMapping("/checkUserLogin")
    public String checkUser(@ModelAttribute("shopUser") ShopUser shopUser, HttpSession s, Model model) {

        AddDAO obAdd = new AddDAO();
        boolean bo = obAdd.checkUserAccount(shopUser.getEmail(), shopUser.getPassword());
        if (bo == true) {

            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllProductData();

            model.addAttribute("demo", list);
            s.setAttribute("parUser", shopUser.getEmail());

            int itemWished = ob.getHowManyItemWishedUnderEmail(shopUser.getEmail());
            model.addAttribute("wishedItems", itemWished);

            model.addAttribute("ourUser", shopUser.getEmail());
            return "public/index1.jsp";

        } else {
         model.addAttribute("sms", "Loggin fail");
            return "public/login.jsp";

        }
    }
    
    @RequestMapping("/userLogout")
    public String userLogoutMethod(@ModelAttribute("shopUser") ShopUser shopUser, HttpSession s, Model model) {

            AddDAO obAdd = new AddDAO();
        

            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllProductData();

            model.addAttribute("demo", list);
            s.setAttribute("parUser", null);

//            model.addAttribute("ourUser", shopUser.getEmail());
            return "public/index1.jsp";

    }
    
     @RequestMapping("/edit")
    public String goEdit(@ModelAttribute("shopUser") ShopUser shopUser,Model m){
       
        return "regesterCustomer/changepass.jsp";
    }
    
    @RequestMapping("/changepass")
    public String goUpdate(@ModelAttribute("shopUser") ShopUser shopUser,Model m){
        
  boolean bol=   da.doUpdatepasss(shopUser.getEmail(),shopUser.getContactNo(),shopUser.getPassword());
     if(bol){
      m.addAttribute("sms","Your Password Change Success");
     }else{
      m.addAttribute("sms","Your Password Change Fail, Old password incorect");
     }

    return "regesterCustomer/changepass.jsp";
    }
    
     @RequestMapping("/editCustomerinfo")
    public String goeditCustomerinfo(@ModelAttribute("shopUser") ShopUser shopUser,Model m){
       List<ShopUser> li=new ArrayList<ShopUser>();
       li=da.doQueryshopUserinfo(shopUser.getEmail());
       m.addAttribute("li",li);
        return "regesterCustomer/ChangeCustomerinfo.jsp";
    }
    
@RequestMapping("/updateCustomerinfo")
    public String goUpdateCustomerinfo(@ModelAttribute("shopUser") ShopUser shopUser,Model m){
   
  boolean bol=   da.updateShopUserInfoDao(shopUser);
       List<ShopUser> li=new ArrayList<ShopUser>();
       li=da.doQueryshopUserinfo(shopUser.getEmail());
       
       m.addAttribute("li",li);
     if(bol){
      m.addAttribute("sms","Your Information Change Success");
      m.addAttribute("color","blue");
     }else{
      m.addAttribute("sms","Your Information Change Fail");
      m.addAttribute("color","red");
     }

    return "regesterCustomer/ChangeCustomerinfo.jsp";
    }
    
    
    
    
    @RequestMapping("userStatement")
    public String goUserStatementPage() {
        return "/regesterCustomer/customerStatMent.jsp";
    }
     
    
}
