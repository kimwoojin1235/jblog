package com.javaex.vo;

public class UserVo {
	
	//필드
	private int userno; 		//회원식별번호
	private String id;			//아이디
	private String username;	//회원이름
	private String password;	//비밀번호
	private String joindate;	//가입일
	private String blogtitle;	//블로그 제목
	private String logofile;	//로고 이미지 경로
	public int getUserno() {
		return userno;
	}
	public void setUserno(int userno) {
		this.userno = userno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}
	public String getLogofile() {
		return logofile;
	}
	public void setLogofile(String logofile) {
		this.logofile = logofile;
	}
	@Override
	public String toString() {
		return "UserVo [userno=" + userno + ", id=" + id + ", username=" + username + ", password=" + password
				+ ", joindate=" + joindate + ", blogtitle=" + blogtitle + ", logofile=" + logofile + "]";
	}
	

	
	
	
}
