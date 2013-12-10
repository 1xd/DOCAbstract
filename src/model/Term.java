package model;

public class Term {

	/**
	 * ����
	 */
	private int id;// ����ID
	private String content;// ��������
	private int type;// ���ʵ�����

	public Term() {
		super();
	}

	public Term(String content, int type) {
		super();
		this.content = content;
		this.type = type;
	}

	public Term(int id, String content, int type) {
		super();
		this.id = id;
		this.content = content;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
