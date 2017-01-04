package com.chat.Controller;


import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.chat.model.Blog;
import com.chat.model.BlogCmd;
import com.chat.services.BlogServices;
import com.chat.services.CommentServices;
import com.google.gson.Gson;


@Controller
public class BlogController {
@Autowired
BlogServices blogServices;

@Autowired
CommentServices commentServices;

	public BlogController() {
		// TODO Auto-generated constructor stub
	super();
	System.out.println("BlogController");
	}
	/*@RequestMapping(value="saveblog",method=RequestMethod.POST)
	public ModelAndView blogg(@ModelAttribute("bg") Blog bg,Model m) {
		bg.setCretion(new Date());
		blogServices.insertRow(bg);
		List<Blog> blogLt=blogServices.getList();
		m.addAttribute("blogList", blogLt);
		return new ModelAndView("blog");
	}*/

	@RequestMapping("blog")
	public String gotoblog(@ModelAttribute("bg") Blog bg,Model m)
	{
		List<Blog> blogLt=blogServices.getList();
		Gson gson=new Gson();
		String st=gson.toJson(blogLt);
		m.addAttribute("priya",st);
		m.addAttribute("blogList",blogLt);
		return "blog";
	}

	/*@RequestMapping("Confirmpage")
	public String gotocon(@ModelAttribute("bg") Blog bg,Model m)
	{
		List<Blog> blogLt=blogServices.getList();
		Gson gson=new Gson();
		String st=gson.toJson(blogLt);
		m.addAttribute("priya",st);
		m.addAttribute("blogList",blogLt);
		return "blogpage";
	}*/
	
	@RequestMapping("/viewpage")
	public String viewpage(@ModelAttribute("cg")BlogCmd cg,@RequestParam int id,Model m)
	{
		int count=0;
		Blog bg=blogServices.getRowById(id);
		m.addAttribute("b", bg);
		List<BlogCmd> cmtLt=commentServices.getList();
		List<BlogCmd> cmtNeed=new ArrayList<BlogCmd>();
		for(BlogCmd ccmt:cmtLt)
		{
			if(ccmt.getBlogid()==id)
			{
				cmtNeed.add(ccmt);
			count++;
			}
		}
		/*String str=gson.toJson(cmtNeed);*/
		m.addAttribute("cmts", cmtNeed);
		m.addAttribute("cmt", count);
		
		return "viewpage";
	}
	
	/*@RequestMapping("addBlogCmd")
	public String toAddComment(@ModelAttribute("cmt")BlogCmd cmt,@RequestParam int id,Model m)
	{
	Blog b=blogService.getRowById(id);
	m.addAttribute("blog", b);
	return "addBlogCmd";
	}*/
	
	@RequestMapping(value="addComment",method=RequestMethod.POST)
	public String toAddItDb(@ModelAttribute("cg")BlogCmd cg,@RequestParam int id,Model m)
	{
		int cmdCount=0;
		commentServices.insertRow(cg);
		/*List<BlogCmd> bloLt=blogCommentService.getList();
		m.addAttribute("blog", bloLt);*/
		Blog bg=blogServices.getRowById(id);
		m.addAttribute("b", bg);
		List<BlogCmd> cmtLt=commentServices.getList();
		List<BlogCmd> cmtNeed=new ArrayList<BlogCmd>();
		for(BlogCmd ccmt:cmtLt)
		{
			if(ccmt.getBlogid()==id)
			{
				cmtNeed.add(ccmt);
			cmdCount++;
			}
		}
		/*String str=gson.toJson(cmtNeed);*/
		m.addAttribute("cmts", cmtNeed);
		m.addAttribute("cmt", cmdCount);
		
		return "viewpage";
	}
	
	@RequestMapping("/blogpage")
	public String blogpage(@ModelAttribute("bg") Blog bg,Model m)
	{
		/*blogServices.insertRow(bg);
		*/
		List<Blog> blogLt=blogServices.getList();
		Gson gson=new Gson();
		String st=gson.toJson(blogLt);
		m.addAttribute("priya",st);
		/*m.addAttribute("blogList",blogLt);*/
		return "blogpage";
	}
		@RequestMapping("deleteBlog")
		public ModelAndView deleteUser(@ModelAttribute("bg")Blog bg,@RequestParam int id,Model m) {
			blogServices.deleteRow(id);
			List<Blog> blogLt=blogServices.getList();
			Gson gson=new Gson();
			String st=gson.toJson(blogLt);
			m.addAttribute("priya", st);
			return new ModelAndView("blogpage");
		}
			@RequestMapping(value="Confirmpage",method=RequestMethod.POST)
			public ModelAndView toCreateBlog(@ModelAttribute("bg")Blog bg,Model m)
			{
				bg.setCretion(new Date());
				blogServices.insertRow(bg);
				bg=blogServices.getRowById(bg.getBid());
				m.addAttribute("b",bg);
				return new ModelAndView("Confirmpage");
			}
			@RequestMapping("/editpage")
			public ModelAndView editblog(@ModelAttribute("bg")Blog bg,@RequestParam int id,Model m)
			{
				bg=blogServices.getRowById(id);
				return new ModelAndView("editpage","b",bg);
			}
			@RequestMapping("updateblog")
			public ModelAndView updateUser(@ModelAttribute("bg") Blog bg,Model m) {
				blogServices.updateRow(bg);
				bg=blogServices.getRowById(bg.getBid());
				m.addAttribute("b", bg);
				return new ModelAndView("Confirmpage");
			}
}

