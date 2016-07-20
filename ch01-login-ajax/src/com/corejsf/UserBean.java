package com.corejsf;

import java.io.Serializable;

//import javax.faces.bean.ManagedBean; 
    import javax.inject.Named;
//import javax.faces.bean.SessionScoped; 
    import javax.enterprise.context.SessionScoped;

//@ManagedBean(name="user") // 
 @Named("user")
@SessionScoped
public class UserBean implements Serializable {
   private String name = "";
   private String password;
   private Integer age;

   public String getName() { return name; }
   public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }
   
   public String getGreeting() { 
      if (name.length() == 0) return "";
      else return "Welcome to JSF2 + Ajax, " + name + "!" + "  age=" + age; 
   }
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
}
