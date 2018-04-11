/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.AddDAO;
import dao.ListDAO;
import dao.WishListDao;
import java.sql.Date;
import model.Choose;
import model.Product;
import model.ShopUser;
import model.Wishlist;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author PARVES
 */
@Controller
public class WishlistController {

    @RequestMapping("/saveWishlistFromUnderArmor")
    public String saveWishlistProductFromUnderArmor(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllUnderArmor();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/underArmor.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";

        }

    }

    @RequestMapping("/saveWishlistFromAdidas")
    public String saveWishlistProductFromAdidas(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllAddidas();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/adidasProduct.jsp";
        } else {
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromNike")
    public String saveWishlistProductFromNike(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllNike();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/nikeProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromMensFendi")
    public String saveWishlistProductFromMensFendi(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllMensFandi();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/mensFendiProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromMensGuess")
    public String saveWishlistProductFromMensGuess(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllManGuess();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/mensFendiProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromMensValentino")
    public String saveWishlistProductFromMensValentino(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllManValentino();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "mensValentinoiProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromMensDior")
    public String saveWishlistProductFromMensDior(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllManDior();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "mensDiorProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromMensVersace")
    public String saveWishlistProductFromMensVersace(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllManVersace();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/mensVersaceProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromWomensFendi")
    public String saveWishlistProductFromWomensFendi(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllWomensFendi();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/womensFendiProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromWomensGuess")
    public String saveWishlistProductFromWomensGuess(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllWomensGuess();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/womensFendiProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromWomensValentino")
    public String saveWishlistProductFromWomensValentino(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllWomensValantion();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/womensValentinoProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromWomensDior")
    public String saveWishlistProductFromWomensDior(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllWomensDior();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "womensDiorProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromWomensVarseace")
    public String saveWishlistProductFromWomensVerseace(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllWomenVersace();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "womensVersaceProduct.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromKids")
    public String saveWishlistProductFromKids(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllKidsProduct();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/kidsProducts.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromFashion")
    public String saveWishlistProductFromFashion(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllFashionProduct();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/fashionProducts.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromHousehold")
    public String saveWishlistProductFromHousehold(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllHouseholdProduct();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/householdProducts.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromInteriors")
    public String saveWishlistProductFromInteriors(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllInteriorsProduct();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/interiorsProducts.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromClothing")
    public String saveWishlistProductFromClothing(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllClothingProduct();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/clothingProducts.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromNew")
    public String saveWishlistProductFromNewProduct(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllProduct();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/newProducts.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromBags")
    public String saveWishlistProductFromBags(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllBagsProduct();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/bagsProducts.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/saveWishlistFromShows")
    public String saveWishlistProductFromShows(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {

        String demoUserEmail = wishlist.getUserEmail();
        if ((demoUserEmail != null) && (demoUserEmail != "")) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            AddDAO obAdd = new AddDAO();
            wishlist.setUserEmail(wishlist.getUserEmail());
            wishlist.setProId(product.getProId());
            wishlist.setProName(product.getProName());
            wishlist.setProUrl(product.getProUrl());
            wishlist.setPrice(product.getProPrice());
            wishlist.setQuantity(1);
            wishlist.setTotal(product.getProPrice());
            wishlist.setTime(ourJavaDateObject);
            obAdd.saveNewWishlist(wishlist);
            ListDAO ob = new ListDAO();
            List<Product> list = ob.findAllShowsProduct();
            model.addAttribute("demo", list);

            int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
            model.addAttribute("wishedItems", itemWished);

            return "public/showsProducts.jsp";
        } else {
            model.addAttribute("msg", "You have to registration and then login. If you have existing account you have to login first");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/findWishlistPage")
    public String findWishlistPage(@ModelAttribute("choose") Wishlist wishlist, Product product, Model model) {
       WishListDao ob = new WishListDao();
        String demoUserEmail = wishlist.getUserEmail();
        
        List<Wishlist> list = ob.getAllWhshItemUnderEMail(wishlist.getUserEmail());
        model.addAttribute("demo", list);

        int itemWished = ob.getHowManyItemWishedUnderEmail(demoUserEmail);
        model.addAttribute("wishedItems", itemWished);
        return "public/wishlistItems.jsp";

    }

    @RequestMapping("/deleteFromWishlist")
    public String deleteWishedItem(@ModelAttribute("wishlist") Wishlist wishlist, Model model) {
         Date date=new Date(wishlist.getTime().getYear(), wishlist.getTime().getMonth(), wishlist.getTime().getDate());
        WishListDao ob1 = new WishListDao();
        ob1.deleteWishlist(wishlist.getId(), date);

        String demoUserEmail = wishlist.getUserEmail();
        
        ListDAO ob = new ListDAO();
        List<Wishlist> list = ob1.getAllWhshItemUnderEMail(wishlist.getUserEmail());
        model.addAttribute("demo", list);

        int itemWished = list.size();
        model.addAttribute("wishedItems", itemWished);
        return "public/wishlistItems.jsp";

    }
    
    
    
}
