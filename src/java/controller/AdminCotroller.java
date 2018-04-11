/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.AddDAO;
import dao.ListDAO;
import model.Admin;
import model.Category;
import model.Product;
import model.ShopUser;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author User
 */
@Controller
public class AdminCotroller {
    
     @RequestMapping("adminlog")
    public String goadminlogginPage() {
        return "public/adminloggin.jsp";
    }


    @RequestMapping("/adminLogin")
    public String checkAdmin(@ModelAttribute("admin") Admin admin, Model model) {
        AddDAO ob = new AddDAO();
        boolean bo = ob.checkAdmin(admin.getId(), admin.getPass());
        if (bo) {
            return "public/red.jsp";
        } else {
            return "public/adminloggin.jsp";
        }
    }

   

    @RequestMapping("admin_resource/finAllCategory")
    public String findALlData(@ModelAttribute("category") Category category, Model model) {
        ListDAO ob = new ListDAO();
        List<Category> list = new ArrayList<Category>();
        list = ob.findAllCategory();

        model.addAttribute("demo", list);

        return "/admin_resource/resultCategory.xhtml";
    }

    @RequestMapping("admin_resource/indexPage")
    public String findIndexPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProductData();

        model.addAttribute("demo", list);
        return "/public/index1.jsp";

    }

}
