package com.boot.projectEx.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.boot.projectEx.model.ProductVO;

public interface IProductDAO {
	//카테고리별 상품조회 추가
	ArrayList<ProductVO> listCtgProuct(String ctgId);
	
	//저번에 한거ㅣㅇㅁ
	ArrayList<ProductVO> listAllProduct();   		// 전체 상품 조회
	void insertProduct(ProductVO prdVo);			// 상품 정보 등록
	void updateProduct(ProductVO prdVo);			// 상품 정보 수정
	void deleteProduct(String prdNo);					// 상품 정보 삭제
	ProductVO detailViewProduct(String prdNo);// 상세 상품 조회
	String prdNoCheck(String prdNo); 				//상품 검색
	ArrayList<ProductVO> productSearch(HashMap<String, Object> map); // 상품 검색

}
