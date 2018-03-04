package net.thebogus.board.vo;

public class BoardVO {
	private int idx;
	private String title;
	private String writer;
	private String regdate;
	private int count;
	private String content;
	private int boardno = 0;
	private String boardRealName;
	private String boardName;
	public String getBoardName() {
		setNames();
		return boardName;
	}
	public String getBoardRealName() {
		setNames();
		return boardRealName;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBoardno() {
		return boardno;
	}
	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", title=" + title + ", writer=" + writer + ", regdate=" + regdate + ", count="
				+ count + ", content=" + content + ", boardno=" + boardno + "]";
	}
	
	public void setNames() {
		if(boardno ==  1) {
			boardName = "projects";
			boardRealName = "프로젝트";
		}
		else if(boardno == 2) {
			boardName = "algorithm";
			boardRealName = "알고리즘";
		}
		else if(boardno == 3) {
			boardName = "finance";
			boardRealName = "경제";
		}
		else if(boardno == 4) {
			boardName = "law";
			boardRealName = "법";
		}
		else if(boardno == 5) {
			boardName = "photo";
			boardRealName = "사진";
		}
		else if(boardno == 6) {
			boardName = "food";
			boardRealName = "음식";
		}
		else if(boardno == 7) {
			boardName = "game";
			boardRealName = "게임";
		}
		else if(boardno == 8) {
			boardName = "machine";
			boardRealName = "기계";
		}
	}
}
