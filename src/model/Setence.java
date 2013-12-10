package model;

public class Setence {
	/**
	 * ����Model
	 */
	private int id;// ����ID
	private Term[] terms;// ������
	private int type;// ���ӵ�����

	public Setence() {
		super();
	}

	public Setence(Term[] terms, int type) {
		super();
		this.terms = terms;
		this.type = type;
	}

	public Setence(int id, Term[] terms, int type) {
		super();
		this.id = id;
		this.terms = terms;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Term[] getTerms() {
		return terms;
	}

	public void setTerms(Term[] terms) {
		this.terms = terms;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
