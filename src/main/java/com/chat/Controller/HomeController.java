package com.chat.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chat.model.Blog;
import com.chat.model.BlogCmd;
import com.chat.model.Forum;
import com.chat.services.BlogServices;
import com.chat.services.CommentServices;
import com.chat.services.ForumServices;
import com.google.gson.Gson;

@Controller
public class HomeController {
	
	@Autowired
	BlogServices blogServices;
	@Autowired
	ForumServices forumServices;
	
	public void HomeController()
	{
		System.out.println("welcome");
	}
	
	@RequestMapping("/")
	public String toRoot()
	{
		return "home";
	}
	
	@RequestMapping("/home")
	public String gotohome()
	{
		return "home";
	}
	
	
	@RequestMapping("/home2")
	public String gotoin()
	{
		return "home";
	}
	
	@RequestMapping("/signup")
	public String gotosign()
	{
		return "signup";
	}
	/*@RequestMapping("/viewpage")
	public String gotoview(@ModelAttribute("bg") Blog bg, @RequestParam int id,Model m) 
	{
		bg = blogServices.getRowById(id);
		//List blogList = blogServices.getList();
		m.addAttribute("b", bg);
		return "viewpage";
		//return new ModelAndView("viewpage", "blogList", bg);
	
	}
	*/
	
	@RequestMapping("/forum")
	public String gotoforum(@ModelAttribute("fg")Forum fg,Model m)
	{
		List<Forum> forumLt=forumServices.getList();
		m.addAttribute( forumLt);
		return "forum";
	}
	/*@RequestMapping("/Comment")
	public String gotocomment(@ModelAttribute("cg")BlogCmd cg,Model m)
	{
		List<BlogCmd> commentLt=commentServices.getList();
		m.addAttribute("commentList", commentLt);
		return "Comment";
	}*/
	@RequestMapping("/login")
	public String gotologin(@RequestParam(value="error",required = false) String error, @RequestParam(value="logout",required = false) String logout, Model model) 
	{
		
		if(error!=null)
		{
			model.addAttribute("error","Invalid credentials to enter");
		}
		if(logout!=null)
		{
			model.addAttribute("msg", "You logged out successfully...");
		}
		return  "login";
  	}


}
