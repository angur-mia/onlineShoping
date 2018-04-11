package display;

import dao.ListDAO;
import model.Product;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DisplayProductMB {

    Product product = new Product();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getAllProduct() {
        List<Product> pList = new ListDAO().allProductList();
        return pList;
    }

}
