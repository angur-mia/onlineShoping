/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.AddDAO;
import dao.ListDAO;
import model.Choose;
import model.DelivaryAddress;
import model.DelivaryCost;
import model.Product;
import model.ShopUser;
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
public class ShopController {

    @RequestMapping("/")
    public String findWelcomePage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProductData();

        model.addAttribute("demo", list);
        return "public/index1.jsp";
    }

    @RequestMapping("/findData")
    public String findWelcomePage1(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProductData();

        model.addAttribute("demo", list);
        return "productTest.jsp";
    }

    @RequestMapping("/indexPage")
    public String findIndexPage(@ModelAttribute("product") Product product, Choose choose, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProductData();

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        model.addAttribute("demo", list);
        return "public/index1.jsp";
    }

    @RequestMapping("/getSportsGroup")
    public String findSprotsGroup(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProductData();

        model.addAttribute("demo", list);
        return "public/sportsGroup.jsp";
    }

    @RequestMapping("/getMensGroup")
    public String findMensGroup(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProductData();

        model.addAttribute("demo", list);
        return "public/mensGroup.jsp";
    }

    @RequestMapping("/getWomensGroup")
    public String findWomensGroup(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProductData();

        model.addAttribute("demo", list);
        return "public/womensGroup.jsp";
    }

    @RequestMapping("/getNikePage")
    public String findNikePageList1(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllNike();

        model.addAttribute("demo", list);
        return "public/nikeProduct.jsp";
    }

    @RequestMapping("/getKidsPage")
    public String findKidsPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllKidsProduct();

        model.addAttribute("demo", list);
        return "public/kidsProducts.jsp";
    }
    @RequestMapping("/findNewProductPage")
    public String findNewProductPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProduct();

        model.addAttribute("demo", list);
        return "public/newProducts.jsp";
    }

    @RequestMapping("/getFashionPage")
    public String findFasPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllFashionProduct();

        model.addAttribute("demo", list);
        return "public/fashionProducts.jsp";
    }

    @RequestMapping("/getHouseholdsPage")
    public String findHouseholdPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllHouseholdProduct();

        model.addAttribute("demo", list);
        return "public/householdProducts.jsp";
    }

    @RequestMapping("/getInteriorsPage")
    public String findInteriorsPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllInteriorsProduct();

        model.addAttribute("demo", list);
        return "public/interiorsProducts.jsp";
    }

    @RequestMapping("/getBagsPage")
    public String findBagsPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllBagsProduct();

        model.addAttribute("demo", list);
        return "public/bagsProducts.jsp";
    }

    @RequestMapping("/getShowsPage")
    public String findShowsPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllShowsProduct();

        model.addAttribute("demo", list);
        return "public/showsProducts.jsp";
    }

    @RequestMapping("/getClothingPage")
    public String findClothingPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllClothingProduct();

        model.addAttribute("demo", list);
        return "public/clothingProducts.jsp";
    }

    @RequestMapping("/getMensFandi123")
    public String findMensPendi(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllMensFandi();

        model.addAttribute("demo", list);
        return "public/mensFendiProduct.jsp";
    }

    @RequestMapping("/getUnderArmor")
    public String findUnderArmorPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllUnderArmor();

        model.addAttribute("demo", list);
        return "public/underArmor.jsp";
    }

    @RequestMapping("/geAdidasPage")
    public String findAdidasPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllAddidas();

        model.addAttribute("demo", list);
        return "public/adidasProduct.jsp";
    }

    @RequestMapping("/getGuessPage")
    public String findGuessPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllManGuess();

        model.addAttribute("demo", list);
        return "public/mensGuessProduct.jsp";
    }

    @RequestMapping("/getDiorPage")
    public String findDiorPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllManDior();

        model.addAttribute("demo", list);
        return "public/mensDiorProduct.jsp";
    }

    @RequestMapping("/getVersacePage")
    public String findVersacePage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllManVersace();

        model.addAttribute("demo", list);
        return "public/mensVersaceProduct.jsp";
    }

    @RequestMapping("/getWomensFendiPage")
    public String findWomensFenidPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomensFendi();

        model.addAttribute("demo", list);
        return "public/womensFendiProduct.jsp";
    }

    @RequestMapping("/getWomensGuessPage")
    public String findWomensGuessPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomensGuess();

        model.addAttribute("demo", list);
        return "public/womensGuessProduct.jsp";
    }

    @RequestMapping("/getWomensValantinoPage")
    public String findWomensValantionPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomensValantion();

        model.addAttribute("demo", list);
        return "public/womensValentinoProduct.jsp";
    }

    @RequestMapping("/getWomensDiorPage")
    public String findWomensDiorPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomensDior();

        model.addAttribute("demo", list);
        return "public/womensDiorProduct.jsp";
    }

    @RequestMapping("/getValentinoPage")
    public String findValentinoPage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllManValentino();

        model.addAttribute("demo", list);
        return "public/mensValentinoiProduct.jsp";
    }

    @RequestMapping("/getWomensVersacePage")
    public String findWomenVersacePage(@ModelAttribute("product") Product product, Model model) {
        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomenVersace();

        model.addAttribute("demo", list);
        return "public/womensVersaceProduct.jsp";
    }

    @RequestMapping("/choosePage1")
    public String findCoicePage(@ModelAttribute("product") Product product, Choose choose, Model model) {

        return "chooseTest.jsp";

    }

    @RequestMapping("/saveNewUser")
    public String createUserAccount(@ModelAttribute("shopUser") ShopUser shopUser, Model model) {

        java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());

        AddDAO obAdd = new AddDAO();
        shopUser.setEmail(shopUser.getEmail());
        shopUser.setPassword(shopUser.getPassword());
        shopUser.setRegDate(ourJavaDateObject);
        shopUser.setContactNo(shopUser.getContactNo());
        shopUser.setRoleId(shopUser.getRoleId());
        shopUser.setAddress(shopUser.getAddress());
        shopUser.setCountry(shopUser.getCountry());
        shopUser.setDistrict(shopUser.getDistrict());
        shopUser.setZipCode(shopUser.getZipCode());
        shopUser.setShoperName(shopUser.getShoperName());
        boolean bool = obAdd.saveUser(shopUser);
        if (bool == true) {
            model.addAttribute("msg", "Successfully created");
            return "public/login.jsp";
        } else {
            model.addAttribute("msg", "Operation failed");
            return "public/login.jsp";
        }

    }

    @RequestMapping("/addNewDelivary")
    public String saveNewDelivaryAdress(@ModelAttribute("delivaryAddress") DelivaryAddress delivaryAddress, Model model) {

        java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());

        AddDAO obAdd = new AddDAO();

        delivaryAddress.setShoperName(delivaryAddress.getShoperName());
        delivaryAddress.setEmail(delivaryAddress.getEmail());
        delivaryAddress.setPhone(delivaryAddress.getPhone());
        delivaryAddress.setDistrict(delivaryAddress.getDistrict());
        delivaryAddress.setCountry(delivaryAddress.getCountry());
        delivaryAddress.setZipCode(delivaryAddress.getZipCode());
        delivaryAddress.setComments(delivaryAddress.getComments());
        delivaryAddress.setReciveTime(delivaryAddress.getReciveTime());
        delivaryAddress.setOrderTime(ourJavaDateObject);
        delivaryAddress.setAddress(delivaryAddress.getAddress());

        boolean bool = obAdd.saveDelivaryDetails(delivaryAddress);
        if ((bool == true) && (delivaryAddress.getEmail() != null)) {

            return "public/paypal_payment.jsp";
        } else {
            model.addAttribute("msg", "Operation failed");
            return "public/checkout.jsp";
        }

    }

    @RequestMapping("/findUserDataByIdPass")
    public String findUserInfoById(@ModelAttribute("shopUser") ShopUser shopUser, DelivaryAddress delivaryAddress, Model model) {

        java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());

        AddDAO obAdd = new AddDAO();

        boolean bool = obAdd.checkUserAccount(shopUser.getEmail(), shopUser.getPassword());
        if (bool == true) {

            List<ShopUser> list = new ArrayList<ShopUser>();
            list = new ListDAO().findUserDataById(shopUser.getEmail());
            shopUser.setShoperName(list.get(0).getShoperName());
            shopUser.setEmail(list.get(0).getEmail());
            shopUser.setAddress(list.get(0).getAddress());
            shopUser.setContactNo(list.get(0).getContactNo());
            shopUser.setZipCode(list.get(0).getZipCode());
            shopUser.setCountry(list.get(0).getCountry());
            shopUser.setDistrict(list.get(0).getDistrict());
            shopUser.setZipCode(list.get(0).getZipCode());
//             model.addAttribute("demo", list);

            return "public/checkout.jsp";
        } else {
            model.addAttribute("msg", "Operation failed");
            return "public/checkout.jsp";
        }

    }
    
    @RequestMapping("checkout")
    public String gocheckoutPage() {
        return "/public/checkout.jsp";
    }

}
