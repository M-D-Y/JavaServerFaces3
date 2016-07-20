package com.corejsf;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
/*
  https://musingsinjava.wordpress.com/2014/11/02/enabling-jsf-2-2-and-cdi-1-2-on-tomcat-8/
  
  
  Identifying and solving javax.el.PropertyNotFoundException: Target Unreachable
  http://stackoverflow.com/questions/30128395/identifying-and-solving-javax-el-propertynotfoundexception-target-unreachable
 */

@Named("user")
@SessionScoped
public class UserBean implements Serializable {
   private String name;
   private String password;

   public String getName() { return name; }   
   public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }   
}
