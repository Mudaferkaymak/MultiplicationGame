/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.Serializable;

/**
 *
 * @author MÜDAFERKAYMAK
 */
public class Child implements Serializable{
    private String userName;
    private String password;
    private static final long serialVersionUID = -1373809562886939447L;
    public Child(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    Child() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
