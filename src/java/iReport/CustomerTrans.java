/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iReport;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author User
 */
@ManagedBean
@SessionScoped
public class CustomerTrans {
    String email;

    public CustomerTrans() {
    }

    public CustomerTrans(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    
    public void viewBuyReport() {
        try {
            ReportDao dao = new ReportDao();

            JRDataSource  jrdataSource = new JRBeanCollectionDataSource(dao.findAllCustomerReport(email));
            String s = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/report/customerReport.jrxml");
            InputStream inputStream = new FileInputStream(new File(s));
            JasperReport jr = JasperCompileManager.compileReport(inputStream);

            JasperPrint jp = JasperFillManager.fillReport(jr, null, jrdataSource);
            HttpServletResponse servletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            servletResponse.addHeader("contentType", "application/pdf");
            ServletOutputStream outputStream = servletResponse.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jp, outputStream);
            FacesContext.getCurrentInstance().responseComplete();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
