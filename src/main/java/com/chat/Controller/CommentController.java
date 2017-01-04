/*package com.chat.Controller;


import java.util.Date;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chat.model.BlogCmd;
import com.chat.services.CommentServices;
import com.google.gson.Gson;



@Controller
public class CommentController {
@Autowired
CommentServices commentServices;
	public CommentController() {
		// TODO Auto-generated constructor stub
	super();
	System.out.println("CommentController");
	}

	@RequestMapping(value="savecomment",method=RequestMethod.POST)
	public ModelAndView commentg(@ModelAttribute("cg") BlogCmd cg,Model m) {
		
		commentServices.insertRow(cg);
		List<BlogCmd> commentLt=commentServices.getList();
		m.addAttribute("commentList", commentLt);
		m.addAttribute("c" ,cg);
		
		return new ModelAndView("Comment");
	}
	@RequestMapping("/commentpage")
	public String commentpage(@ModelAttribute("bg") BlogCmd bg,Model m)
	{
	
		List<BlogCmd> commentLt=commentServices.getList();
		Gson gson=new Gson();
		String st=gson.toJson(commentLt);
		m.addAttribute("priya",st);
		m.addAttribute("commentList",commentLt);
		return "commentpage";
		bg=commentServices.getRowById(id);
		m.addAttribute("b" ,bg);
		re
		
		turn "commentpage";	
	}
}*/