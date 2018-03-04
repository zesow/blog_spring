package net.thebogus.board.vo;

import java.util.Date;

public class ReplyVO {
	private Integer rNo;
	private Integer bNo;
	private String replyer;
	private Date regDate;
	private String replyText;
	public Integer getrNo() {
		return rNo;
	}
	public void setrNo(Integer rNo) {
		this.rNo = rNo;
	}
	public Integer getbNo() {
		return bNo;
	}
	public void setbNo(Integer bNo) {
		this.bNo = bNo;
	}
	public String getReplyer() {
		return replyer;
	}
	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getReplyText() {
		return replyText;
	}
	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}
	@Override
	public String toString() {
		return "ReplyVO [rNo=" + rNo + ", bNo=" + bNo + ", replyer=" + replyer + ", regDate=" + regDate + ", replyText="
				+ replyText + "]";
	}
	
	}
