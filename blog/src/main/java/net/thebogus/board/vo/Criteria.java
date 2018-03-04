package net.thebogus.board.vo;

public class Criteria {
	private int page;
	private int perPageNum;
	private int boardno = 0;
	
	public int getBoardno() {
		return boardno;
	}
	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page <= 0) {
			this.page = 1;
			return;
		}
		this.page = page;
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	public void setPerPageNum(int perPageNum) {
		if(perPageNum <= 0 || perPageNum > 100) {
			this.perPageNum = 10;
			return;
		}
		
		this.perPageNum = perPageNum;
	}
	
	public int getPageStart() {
		return (this.page - 1) * perPageNum;
	}
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
	public String getBoardName() {
		String result = null;
		if(boardno ==  1)
			result = "projects";
		else if(boardno == 2)
			result = "algorithm";
		else if(boardno == 3)
			result = "finance";
		else if(boardno == 4)
			result = "law";
		else if(boardno == 5)
			result = "photo";
		else if(boardno == 6)
			result = "food";
		else if(boardno == 7)
			result = "game";
		else if(boardno == 8)
			result = "machine";
		return result;
	}
}
