package com.chat.Controller;


import java.util.ArrayList;
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

import com.chat.model.Blog;
import com.chat.model.BlogCmd;
import com.chat.model.Forum;
import com.chat.model.Replay;
import com.chat.model.Forum;
import com.chat.model.Forum;
import com.chat.services.ForumServices;
import com.chat.services.ReplayServices;
import com.google.gson.Gson;


@Controller
public class ForumController {
	
@Autowired
ForumServices forumServices;
@Autowired
ReplayServices replayServices;

	public ForumController() {
		// TODO Auto-generated constructor stub
	super();
	System.out.println("ForumController");
	}

	/*@RequestMapping(value="saveforum",method=RequestMethod.POST)
	public ModelAndView forumg(@ModelAttribute("fg") Forum fg,Model m) {
		fg.setCreation(new Date());
		forumServices.insertRow(fg);
		List<Forum> forumLt=forumServices.getList();
		m.addAttribute("forumList", forumLt);
		return new ModelAndView("forum");
	}*/
	@RequestMapping("/forumpage")
	public String forumpage(@ModelAttribute("fg") Forum fg,@RequestParam int id,Model m)
	{
		List<Forum> forumLt=forumServices.getList();
		Gson gson=new Gson();
		String st=gson.toJson(forumLt);
		m.addAttribute("priya",st);
		/*m.addAttribute("forumList",forumLt);*/
		return "forumpage";
	}
	/*@RequestMapping("/viewforum")
	public String gotoview(@ModelAttribute("fg") Forum fg, @RequestParam int id,Model m) 
	{
		List<Forum> forumLt=forumServices.getList();
		fg = forumServices.getRowById(id);
		
		m.addAttribute("f",fg);
		m.addAttribute("blogList",blogLt);
		return "viewforum";
	}
	*/
	@RequestMapping("deleteForum")
	
	public ModelAndView deleteUser(@ModelAttribute("fg")Forum fg,@RequestParam int id,Model m) {
		forumServices.deleteRow(id);
		List<Forum> forumLt=forumServices.getList();
		Gson gson=new Gson();
		String st=gson.toJson(forumLt);
		m.addAttribute("priya", st);
		return new ModelAndView("forumpage");
	
}
	@RequestMapping("/viewforum")
	public String viewpage(@ModelAttribute("rg")Replay rg,@RequestParam int id,Model m)
	{ int count=0;
		Forum fg=forumServices.getRowById(id);
		m.addAttribute("f", fg);
		List<Replay> cmtLt=replayServices.getList();
		List<Replay> cmtNeed=new ArrayList<Replay>();
		for(Replay ccmt:cmtLt)
		{
			if(ccmt.getForumid()==id)
			{
				cmtNeed.add(ccmt);
			count++;
			}
		}
		/*String str=gson.toJson(cmtNeed);*/
		m.addAttribute("rmts", cmtNeed);
		m.addAttribute("rmt", count);
		
		return "viewforum";
	}
	
	/*@RequestMapping("addBlogCmd")
	public String toAddComment(@ModelAttribute("cmt")BlogCmd cmt,@RequestParam int id,Model m)
	{
	Blog b=blogService.getRowById(id);
	m.addAttribute("blog", b);
	return "addBlogCmd";
	}*/
	
	@RequestMapping(value="addReplay",method=RequestMethod.POST)
	public String toAddItDb(@ModelAttribute("rg")Replay rg,@RequestParam int id,Model m)
	{
		replayServices.insertRow(rg);
		/*List<BlogCmd> bloLt=blogCommentService.getList();
		m.addAttribute("blog", bloLt);*/
		Forum fg=forumServices.getRowById(id);
		m.addAttribute("f", fg);
		List<Replay> cmtLt=replayServices.getList();
		List<Replay> cmtNeed=new ArrayList<Replay>();
		for(Replay ccmt:cmtLt)
		{
			if(ccmt.getForumid()==id)
			{
				cmtNeed.add(ccmt);
			}
		}
		/*String str=gson.toJson(cmtNeed);*/
		m.addAttribute("rmts", cmtNeed);
		return "viewforum";
	}
	
	@RequestMapping(value="confirmforum",method=RequestMethod.POST)
	public ModelAndView toCreateForum(@ModelAttribute("fg")Forum fg,Model m)
	{
		fg.setCreation(new Date());
		forumServices.insertRow(fg);
		fg=forumServices.getRowById(fg.getFid());
		m.addAttribute("f",fg);
		return new ModelAndView("confirmforum");
	}
	@RequestMapping("/editforum")
	public ModelAndView editforum(@ModelAttribute("fg")Forum fg,@RequestParam int id,Model m)
	{
		fg=forumServices.getRowById(id);
		return new ModelAndView("editforum","f",fg);
	}
	@RequestMapping("updateforum")
	public ModelAndView updateUse(@ModelAttribute("fg") Forum fg,Model m) {
		fg.setCreation(new Date());
		forumServices.updateRow(fg);
		fg=forumServices.getRowById(fg.getFid());
		m.addAttribute("f", fg);
		return new ModelAndView("confirmforum");
	}

}
