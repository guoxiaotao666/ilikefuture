package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.Student;
import com.bw.mapper.StudentMapper;

/**
 * @author: Gxt
 * @date: 2019年8月5日
 */
@Service
@Transactional
public class StuServiceImp implements StuService{
	@Autowired
	private StudentMapper mapper;

	public List<Student> selectStu() {
		return mapper.selectStu();
	}
	
}
