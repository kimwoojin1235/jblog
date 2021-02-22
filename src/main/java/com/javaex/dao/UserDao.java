package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//id중복체크 : id로 데이터 1개 찾기
	public UserVo selectById(String id) {
		System.out.println("userdao.selectById()");
	
		return sqlSession.selectOne("user.selectId", id);
		
	}
	
	//회원가입
	public int insertUser(UserVo userVo) {
		System.out.println("userdao.insertUser()");
		
		return sqlSession.insert("user.insertuser", userVo);
	}
	
	//회원가입시 블로그 초기값 입력
	public int insertBlog(UserVo userVo) {
		System.out.println("userdao.insertBlog()");
		
		return sqlSession.insert("user.insertblog", userVo);
	}
	
	//로그인
	public UserVo selectByIdNPw(UserVo userVo) {
		System.out.println("userdao.selectidpass()");
		
		return sqlSession.selectOne("user.selectByIdNPw", userVo);
	}
	
	//블로그 메인 제목, 이미지 수정
	public int updateBlog(UserVo userVo) {
		System.out.println("userdao.updateblog()");
		
		return sqlSession.update("user.updateBlog", userVo);
	}
}
