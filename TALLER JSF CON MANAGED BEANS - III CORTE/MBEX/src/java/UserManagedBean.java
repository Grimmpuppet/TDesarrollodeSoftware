/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
@Named(value = "userManagedBean")
@SessionScoped
public class UserManagedBean implements Serializable {

    private String user;
    private String nickName;
    private String email;
    private String validationCode;

    private String code;

    /**
     *
     */
    public UserManagedBean() {
        code = "codigo-secreto";
        System.out.println("Validation code (Código de validación): " + code);
    }
    
    /**
     *
     * @return
     */
    public String getValidation() {
        if ((validationCode != null) && (validationCode.compareTo(code) == 0)) {
            // The validationCode is OK then we show the user data in validation.xhtml
            // El código validationCode es correcto entonces mostramos los datos en validation.xhtm
            FacesContext context = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            session.invalidate();
            return "<p>Usuario aceptado:</p>"
                    + "<ul>"
                    + " <li>Usuario: " + getUser() + " </li>"
                    + " <li>Apodo: " + getNickName() + " </li>"
                    + " <li>Correo: " + getEmail() + " </li>"
                    + "</ul>";
        } else {
            return "<p>Lo sentimos, " + validationCode + " no es valido.</p>"
                    + "<p>Intente de nuevo...</p>";
        }
    }

    /**
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     *
     * @return
     */
    public String getNickName() {
        return nickName;
    }

    /**
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getValidationCode() {
        return validationCode;
    }

    /**
     *
     * @param validationCode
     */
    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }

    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * Creates a new instance of UserManagedBean
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

}
