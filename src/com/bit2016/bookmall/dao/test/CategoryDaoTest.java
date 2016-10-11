package com.bit2016.bookmall.dao.test;

import java.util.List;

import com.bit2016.bookmall.dao.CategoryDao;
import com.bit2016.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		// insert test
		insertTest();
		// delete test
//		deleteTest();
		// update test
//		updateTest();
		// getList test
		getListTest();
				
	}

	public static void insertTest() {
		CategoryDao dao = new CategoryDao();
		
		CategoryVo vo1 = new CategoryVo();
		vo1.setName("컴퓨터/IT");
		dao.insert(vo1);
		
		CategoryVo vo2 = new CategoryVo();
		vo2.setName("경제");
		dao.insert(vo2);
		
		CategoryVo vo3 = new CategoryVo();
		vo3.setName("소설");
		dao.insert(vo3);
		
		CategoryVo vo4 = new CategoryVo();
		vo4.setName("예술");
		dao.insert(vo4);
	}
	
	public static void deleteTest() {
		CategoryDao dao = new CategoryDao();
		
		dao.delete(dao);
	}
	
	public static void updateTest() {
		CategoryDao dao = new CategoryDao();
		CategoryVo vo = new CategoryVo();
		vo.setNo(2L);
		vo.setName("'기타'");
		
		dao.update(vo);
	}
	
	public static void getListTest() {
		CategoryDao dao = new CategoryDao();
		List<CategoryVo> list = dao.getList();
		
		for (CategoryVo vo : list) {
			System.out.println(vo);
		}
	}
}
