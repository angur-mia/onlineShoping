/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AddDAO;
import dao.ListDAO;
import model.Choose;
import model.DelivaryCost;
import model.Product;
import model.ShopUser;
import model.Wishlist;
import java.util.Calendar;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author PARVES
 */
@Controller
public class ChoiceController {

    @RequestMapping("/saveChoice")
    public String saveChoosenProduct(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllAddidas();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/adidasProduct.jsp";

    }

    @RequestMapping("/saveChoiceFromUnderArmor")
    public String saveChoosenProductFromUnderArmor(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());
        choose.setChTime(ourJavaDateObject);
        choose.setProSize("XL");

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllUnderArmor();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/underArmor.jsp";

    }

    @RequestMapping("/saveChoiceFromWomenVersace")
    public String saveChoosenProductFromWomenVersace(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomenVersace();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/underArmor.jsp";

    }

    @RequestMapping("/saveChoiceFromNike")
    public String saveChoosenProductFromNike(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllNike();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/nikeProduct.jsp";

    }

    @RequestMapping("/saveChoiceForMensFendi")
    public String saveChoosenProductCommon(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllMensFandi();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/mensFendiProduct.jsp";

    }

    @RequestMapping("/saveChoiceForMensGuess")
    public String saveChoosenFromGuess(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllManGuess();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/mensGuessProduct.jsp";

    }

    @RequestMapping("/saveChoiceForWomensFendi")
    public String saveChoosenFromWomensFendi(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomensFendi();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/womensFendiProduct.jsp";

    }

    @RequestMapping("/saveChoiceForWomensValentino")
    public String saveChoosenFromWomensValentino(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomensValantion();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/womensValentinoProduct.jsp";

    }


    @RequestMapping("/saveChoiceFormWomensGuess")
    public String saveChoosenFromWomensGuess(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomensGuess();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/womensGuessProduct.jsp";

    }

    @RequestMapping("/saveChoiceFormWomensDior")
    public String saveChoosenFromWomensDior(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllWomensDior();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/womensDiorProduct.jsp";

    }

    @RequestMapping("/saveChoiceFormKids")
    public String saveChoosenFromKidsPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllKidsProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/kidsProducts.jsp";

    }

    @RequestMapping("/saveChoiceKidsFromHome")
    public String saveChoosenKidsHomePage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/index1.jsp";

    }

    @RequestMapping("/saveChoiceTshirtFromHome")
    public String saveChoosenTshirtHomePage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/index1.jsp";

    }

    @RequestMapping("/saveChoiceBlazerFromHome")
    public String saveChoosenBlazerHomePage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/index1.jsp";

    }

    @RequestMapping("/saveChoiceFormFashion")
    public String saveChoosenFromFashionPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllFashionProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/fashionProducts.jsp";

    }

    @RequestMapping("/saveChoiceFormHousehold")
    public String saveChoosenFromHouseholdPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllHouseholdProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/householdProducts.jsp";

    }

    @RequestMapping("/saveChoiceFormInteriors")
    public String saveChoosenFromInteriorsPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllInteriorsProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/interiorsProducts.jsp";

    }

    @RequestMapping("/saveChoiceFormHouseholds")
    public String saveChoosenFromHouseholdsPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllHouseholdProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/householdProducts.jsp";

    }

    @RequestMapping("/saveChoiceFormBags")
    public String saveChoosenFromBagsPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllBagsProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/bagsProducts.jsp";

    }

    @RequestMapping("/saveChoiceFormShows")
    public String saveChoosenFromShowsPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllShowsProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/showsProducts.jsp";

    }
    
    @RequestMapping("/saveChoiceFormNew")
    public String saveChoosenFromNewProductPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/newProducts.jsp";

    }

    @RequestMapping("/saveChoiceFormClothing")
    public String saveChoosenFromClothingPage(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllClothingProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/clothingProducts.jsp";

    }

    @RequestMapping("/saveChoiceForMens")
    public String saveChoosenProductFromMens(@ModelAttribute("choose") Choose choose, Product product, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(product.getProPrice());
        choose.setQuantity(1);
        choose.setTotal(product.getProPrice());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();
        List<Product> list = ob.findAllProduct();

        model.addAttribute("demo", list);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/mensGroup.jsp";

    }

    @RequestMapping("/showChoiceList")
    public String findValueInCart(@ModelAttribute("choose") Choose choose, DelivaryCost delivaryCost, Model model) {

        ListDAO ob = new ListDAO();
        List<Choose> list = ob.findAllChooseBySession(choose.getSesId());
        model.addAttribute("demo", list);

        double totalRes = ob.findTotalAmountBySession(choose.getSesId());
        model.addAttribute("tAmount", totalRes);

        double tranCost = ob.findZoneDelivaryCost(delivaryCost.getZoneName());
        model.addAttribute("tCost", tranCost);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/cart1.jsp";

    }

    @RequestMapping("/deleteChoice")
    public String deleteChoiceFromCart(@ModelAttribute("choose") Choose choose, DelivaryCost delivaryCost, Model model) {

        AddDAO obAd = new AddDAO();
        obAd.deleteChooice(choose);

        ListDAO ob = new ListDAO();
        List<Choose> list = ob.findAllChooseBySession(choose.getSesId());
        model.addAttribute("demo", list);

        double totalRes = ob.findTotalAmountBySession(choose.getSesId());
        model.addAttribute("tAmount", totalRes);

        double tranCost = ob.findZoneDelivaryCost(delivaryCost.getZoneName());
        model.addAttribute("tCost", tranCost);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/cart1.jsp";

    }

    @RequestMapping("/updateChoice")
    public String updateChoiceFromCart(@ModelAttribute("choose") Choose choose, DelivaryCost delivaryCost, Model model) {

        int quantity = choose.getQuantity();
        double total = choose.getTotal();
        double demoTotal = quantity * total;

        AddDAO obAd = new AddDAO();
        obAd.updateChooice(choose.getId(), quantity, demoTotal);

        ListDAO ob = new ListDAO();
        List<Choose> list = ob.findAllChooseBySession(choose.getSesId());
        model.addAttribute("demo", list);

        double totalRes = ob.findTotalAmountBySession(choose.getSesId());
        model.addAttribute("tAmount", totalRes);

        double tranCost = ob.findZoneDelivaryCost(delivaryCost.getZoneName());
        model.addAttribute("tCost", tranCost);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/cart1.jsp";

    }

    @RequestMapping("/findUpdatePage")
    public String findUpdatePage1(@ModelAttribute("choose") Choose choose, Model model) {

        return "public/updateChooseProduct.jsp";

    }

    @RequestMapping("/updateChoose12")
    public String updateTheChoice(@ModelAttribute("choose") Choose choose, DelivaryCost delivaryCost, Model model) {

        AddDAO obAd = new AddDAO();

        double totalAmout = Math.round(choose.getQuantity() * choose.getPrice() * 100) / 100.0d;
        choose.setTotal(totalAmout);

        obAd.updateChooice12(choose);

        ListDAO ob = new ListDAO();
        List<Choose> list = ob.findAllChooseBySession(choose.getSesId());
        model.addAttribute("demo", list);

        double totalRes = ob.findTotalAmountBySession(choose.getSesId());
        model.addAttribute("tAmount", totalRes);

        double tranCost = ob.findZoneDelivaryCost(delivaryCost.getZoneName());
        model.addAttribute("tCost", tranCost);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/cart1.jsp";

    }

    @RequestMapping("/findZoneCost")
    public String findDelivaryCost(@ModelAttribute("choose") Choose choose, DelivaryCost delivaryCost, Model model) {

        ListDAO ob = new ListDAO();
        List<Choose> list = ob.findAllChooseBySession(choose.getSesId());
        model.addAttribute("demo", list);

        double totalRes = ob.findTotalAmountBySession(choose.getSesId());
        model.addAttribute("tAmount", totalRes);

        double tranCost = ob.findZoneDelivaryCost(delivaryCost.getZoneName());
        model.addAttribute("tCost", tranCost);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/cart1.jsp";

    }

    @RequestMapping("/goDetailPage")
    public String findProductDetailsPage(@ModelAttribute("product") Product product, Choose choose, Model model) {

        ListDAO ob = new ListDAO();
        product.setSubCatId(product.getSubCatId());
        String result = ob.findSubCatNameById(product.getSubCatId());
        model.addAttribute("subCName", result);

        return "public/product-details.jsp";

    }

    @RequestMapping("/saveChoice12")
    public String saveChoosenProductFromDetails(@ModelAttribute("choose") Choose choose, Product product, DelivaryCost delivaryCost, Model model) {

        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(product.getProId());
        choose.setProName(product.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(choose.getPrice());
        choose.setQuantity(choose.getQuantity());
        choose.setTotal(choose.getTotal());

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();

        List<Choose> list = ob.findAllChooseBySession(choose.getSesId());
        model.addAttribute("demo", list);

        double totalRes = ob.findTotalAmountBySession(choose.getSesId());
        model.addAttribute("tAmount", totalRes);

        double tranCost = ob.findZoneDelivaryCost(delivaryCost.getZoneName());
        model.addAttribute("tCost", tranCost);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/cart1.jsp";

    }

    @RequestMapping("/saveChoiceFormWishlist")
    public String saveChoosenFromWishlistPage(@ModelAttribute("choose") Choose choose, Product product, Wishlist wishlist, Model model) {

        java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        
        AddDAO obAdd = new AddDAO();
        choose.setSesId(choose.getSesId());
        choose.setProId(wishlist.getProId());
        choose.setProName(wishlist.getProName());
        choose.setProUrl(product.getProUrl());
        choose.setPrice(wishlist.getPrice());
        choose.setQuantity(1);
        choose.setTotal(wishlist.getPrice());
        choose.setChTime(ourJavaDateObject);

        obAdd.addChooice(choose);

        ListDAO ob = new ListDAO();

        List<Wishlist> list = ob.getAllWhshItemUnderEMail(wishlist.getUserEmail());
        model.addAttribute("demo", list);
        
        int itemWished = ob.getHowManyItemWishedUnderEmail(wishlist.getUserEmail());
        model.addAttribute("wishedItems", itemWished);

        int result = ob.getHowManyItemSelected(choose.getSesId());
        model.addAttribute("selectedAmount", result);

        return "public/wishlistItems.jsp";

    }

}
