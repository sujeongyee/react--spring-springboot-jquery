package com.simple.command;

public class BoardVO {
	
	private int num;
	private String name;
	private String title;
	private String content;
	private String note;
	
	public BoardVO() {
		super();
	}

	public BoardVO(int num, String name, String title, String content, String note) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.content = content;
		this.note = note;
	}

	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", name=" + name + ", title=" + title + ", content=" + content + ", note=" + note
				+ "]";
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	
	
	

}
