package model;
// Generated Oct 30, 2016 9:18:27 AM by Hibernate Tools 4.3.1



/**
 * ProOrderDetails generated by hbm2java
 */
public class ProOrderDetails  implements java.io.Serializable {


     private Integer orderDetailsId;
     private Integer orderId;
     private Integer proId;
     private Integer proQty;

    public ProOrderDetails() {
    }

    public ProOrderDetails(Integer orderId, Integer proId, Integer proQty) {
       this.orderId = orderId;
       this.proId = proId;
       this.proQty = proQty;
    }
   
    public Integer getOrderDetailsId() {
        return this.orderDetailsId;
    }
    
    public void setOrderDetailsId(Integer orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }
    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Integer getProId() {
        return this.proId;
    }
    
    public void setProId(Integer proId) {
        this.proId = proId;
    }
    public Integer getProQty() {
        return this.proQty;
    }
    
    public void setProQty(Integer proQty) {
        this.proQty = proQty;
    }




}


