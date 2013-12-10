package main;

import java.io.UnsupportedEncodingException;

import kevin.zhang.NLPIR;

public class TestUserdir {
	public static String sinputString = "�ÿ�ɭ������¼ұ�������뿪�������سǡ����Ͼ��ǽ�����������¶�̬";

	public static void main(String[] args) throws UnsupportedEncodingException {
		/**
		 * ��ʼ��
		 */
		NLPIR myNLPIR = new NLPIR();
		String argu = "./";
		System.out.println("NLPIR_Init");
		if (myNLPIR.NLPIR_Init(argu.getBytes("UTF-8"), 1) == false) {
			System.out.println("Init Fail!");
			return;
		}
		/****
		 * û�����û��ֵ�֮ǰ
		 */
		// �����û��ʵ�ǰ
		byte nativeBytes[] = myNLPIR.NLPIR_ParagraphProcess(
				sinputString.getBytes("UTF-8"), 1);
		String nativeStr = new String(nativeBytes, 0, nativeBytes.length,
				"UTF-8");

		System.out.println("�ִʽ��Ϊ�� " + nativeStr);

		// �����û��ֵ�
		int count = myNLPIR
				.NLPIR_ImportUserDict("E:\\android\\android_workplace2\\ICT\\dictionary\\user_dirct.txt"
						.getBytes("UTF-8"));
		System.out.println(count);
		// �´���ʶ��

		myNLPIR.NLPIR_NWI_Start();
		myNLPIR.NLPIR_NWI_AddFile(sinputString.getBytes("UTF-8"));
		myNLPIR.NLPIR_NWI_Complete();
		nativeBytes = myNLPIR.NLPIR_NWI_GetResult(true);
		nativeStr = new String(nativeBytes, 0, nativeBytes.length, "UTF-8");
		System.out.println("�´�ʶ���� " + nativeStr);

		// �����û��ʵ��
		byte nativeBytes2[] = myNLPIR.NLPIR_ParagraphProcess(
				sinputString.getBytes("UTF-8"), 1);
		String nativeStr2 = new String(nativeBytes2, 0, nativeBytes2.length,
				"UTF-8");

		System.out.println("�ִʽ��Ϊ�� " + nativeStr2);
	}
}