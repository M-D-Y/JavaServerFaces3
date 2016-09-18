package com.corejsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean; 
   // or import javax.inject.Named;
import javax.faces.bean.SessionScoped; 
   // or import javax.enterprise.context.SessionScoped;

@ManagedBean(name="user") // or @Named("user")
@SessionScoped
public class UserBean implements Serializable {
   private String name = "";
   private String password;
   private String city = "";

   public String getName() { return name; }
   public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }

   public String getCity() { return city; }
   public void setCity(String newValue) { city = newValue; }
}
