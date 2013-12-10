package model;

public class Document {

	/**
	 * ����Model
	 */
	private int ID; // ����ID
	private String title;// ���±���
	private Paragraph[] paragraphs;// ����

	public Document() {
		super();
	}

	public Document(String title, Paragraph[] paragraphs) {
		super();
		this.title = title;
		this.paragraphs = paragraphs;
	}

	public Document(int iD, String title, Paragraph[] paragraphs) {
		super();
		ID = iD;
		this.title = title;
		this.paragraphs = paragraphs;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Paragraph[] getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(Paragraph[] paragraphs) {
		this.paragraphs = paragraphs;
	}

}
