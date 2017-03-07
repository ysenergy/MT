package com.aiwen.controller.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aiwen.entitys.Page;
import com.aiwen.service.test.TestService;
import com.aiwen.utils.PageData;

@Controller
@RequestMapping(value = "Test")
public class TestController {
	@Resource(name = "testService")
	private TestService testService;

	@RequestMapping(value = "test")
	@ResponseBody
	public Object test() throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		System.out.println("enter contorller");
		//testService.test();
		result.put("msg", testService.test());
		return result;
	}
	@RequestMapping(value = "testWeb")
	public ModelAndView testWeb(Page page) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("customerInfo_list");
		List<PageData> list=testService.selectKplsList(page);
		System.out.println("enter contorller");
		result.put("list", list);
		mv.addObject("result", result);
		return mv;
	}
}
