package model;
// Generated Oct 30, 2016 9:18:27 AM by Hibernate Tools 4.3.1



/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private Integer catId;
     private String catName;
     private String catDesc;

    public Category() {
    }

    public Category(String catName, String catDesc) {
       this.catName = catName;
       this.catDesc = catDesc;
    }
   
    public Integer getCatId() {
        return this.catId;
    }
    
    public void setCatId(Integer catId) {
        this.catId = catId;
    }
    public String getCatName() {
        return this.catName;
    }
    
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public String getCatDesc() {
        return this.catDesc;
    }
    
    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }




}

