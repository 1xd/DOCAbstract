package model;

public class IndexTable {

	/**
	 * ����������
	 * 
	 * @param ��ʽ��ͬ�� ����1 TF{1,0,6,4...} NI:6
	 */
	private int termID;// �ʵ�ID
	private int[] TF;// �ô�����ȫ�����ӳ��ֵĴ���
	private int NI;// �ô�����ֵľ�����Ŀ

	public IndexTable() {
		super();
	}

	public IndexTable(int termID, int[] tF, int nI) {
		super();
		this.termID = termID;
		TF = tF;
		NI = nI;
	}

	public int getTermID() {
		return termID;
	}

	public void setTermID(int termID) {
		this.termID = termID;
	}

	public int[] getTF() {
		return TF;
	}

	public void setTF(int[] tF) {
		TF = tF;
	}

	public int getNI() {
		return NI;
	}

	public void setNI(int nI) {
		NI = nI;
	}

}
