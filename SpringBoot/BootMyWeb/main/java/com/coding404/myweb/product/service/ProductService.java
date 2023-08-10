package com.coding404.myweb.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.coding404.myweb.command.CategoryVO;
import com.coding404.myweb.command.ProductUploadVO;
import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.util.Criteria;

public interface ProductService {
	
	public int productRegist(ProductVO vo,List<MultipartFile> list);
	public ArrayList<ProductVO> getList(String writer,Criteria cri);
	public int getTotal(String writer,Criteria cri);
	public ProductVO getDetail(int prod_id);
	public int productUpdate(ProductVO vo);
	public int productDelete(int prod_id);
	
	//카테고리처리
	public ArrayList<CategoryVO> getCategory();
	public ArrayList<CategoryVO> getCategoryChild(CategoryVO vo); // 2단 3단 가져올때
	public List<ProductUploadVO> getAjaxImg(int prod_id);
}
