package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.bean.Student;
import com.bw.service.StuService;

/**
 * @author: Gxt
 * @date: 2019年8月5日
 */
@Controller
public class StuController {
	@Autowired
	private StuService service;
	
	@RequestMapping("list.do")
	public String ls(Model model) {
		List<Student> list = service.selectStu();
		model.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("add.do")
	public String add() {
		return "add";
	}
}
