package com.chat.Controller;

import java.sql.Date;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chat.model.UserAccount;
import com.chat.services.UserBeanService;
@Controller
public class UserController {
@Autowired
UserBeanService userBeanService;

	@RequestMapping(value="/sign")
	public ModelAndView registerIt(HttpServletRequest req)
	{
		String name=req.getParameter("userName");
		String mail=req.getParameter("email");
		String pwd=req.getParameter("password");
		String cpwd=req.getParameter("conform_password");
		
		//to find if username contains numbers
		for(char c : name.toCharArray()){
		        if(Character.isDigit(c)){  
		        	return new ModelAndView("signup","err","userName can't contain integer..");  
		        } 
		 }
		
		//check if the password matches
		
		if(!(pwd.equals(cpwd)))
			{
				return new ModelAndView("signup","err","Password doesnt match..");
			}

		else{
			 UserAccount usr=new UserAccount();
			 usr.setUserName(name);
			 usr.setEmail(mail);
			 usr.setPassword(pwd);
			/* Date date=new Date();
			 usr.setCreationDate(date);
			*/ userBeanService.insertRow(usr);
			return new ModelAndView("home2");
		 }
		/* List<User> users=userService.getList();
		 if(User user:users)*/
		 /*if((name.isEmpty())&&(mail.isEmpty())&&(pwd.isEmpty()))
		 {
			 return new ModelAndView("signup","err","All the fields must be filled..");
		 }*/
		/*List<UserAccount> users=userBeanService.getList();
		 for(UserAccount user:users)
		 {
			 if(user.getUserName().equals(name))
			 {
				 return new ModelAndView("signUp","erruser","User Name already exists..");
			 }
			 if(user.getEmail().equals(mail))
			 {
				 return new ModelAndView("signUp","errmail","EmailID already exists..");
			 }
		 } */
	}

}
