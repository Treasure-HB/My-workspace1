package PPT5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class �̸�Ʈ�̰������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("###,###,###,###");
		
		Calendar kopo18_calt = Calendar.getInstance(); //Ķ�����Լ�ȣ��
		SimpleDateFormat kopo18_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");//��¥��������(�б���)
		SimpleDateFormat kopo18_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");//��¥��������(�ʱ���)
		SimpleDateFormat kopo18_sdt3 = new SimpleDateFormat("YYYYMMdd");//��¥��������(�ϱ���)
		
		String[] kopo18_itemname = {"��Ͼ�","�������","���༭�ʹ�����","ģ�������̶��","�ձ����������","��","���ó�������","���ϱ���̱⵵�ϰ�","�� �װ�����������ذ�","���ذ� �����̾�","������̷��Ź��",
				"�ű�����������","�����������̱��ѵ�0","�� �������غ���","���� �ʺ��� �����ϸ�","�ϴ� �� �����٤�","�츮��ϴ¼�õ����", "�� �� �������ִ�g","�ɱ� �ñ��ϴ�", 
				"��ģ���̶� ��������","���� ���������ϸ鼭","�鼭 ���ϰ�������","����� �ϰ��־�","�츮 �󸶸�������","�ų�..����","���� ���������ؼ�","�ؼ� ���� ���డ��"
						+ "�����ٵ�������","�����ٵ�������","�ƹ�ư����ϰ�","������հԺ�����"," love you ��"};//30���̻�
		
		/*String[] kopo18_itemname = {"kkkkkkkkkkkkkkkkk����","����뷡¯5��*3","�ٳ��� �����Ե�����","��������������Ʈ","�������ֽ�����Ʈ","���ڿ���","�����5","����Ȩ�ڵ����Safe���ǰ��","�ƿ�Ȩ������ũ����all in one","��ɽŶ��5����","(��)����������",
							"�� ����� �ٳ���","����ũ ����̿���500","������ִ¿���","�ɶ�ý� ���� Ʈ��Ʈ��Ʈ","Ǫ���� �̼����� ����","���Ϸν���������500g", "�����Ҹ���65g","���������÷�10��", 
							"CJ����Ĩ","����� ������ũƼ","�������Ϸ� ����","����������","�� ����� �ٳ���(��)","����ũ ź�θ� �߰�����","Gap������4��","�ִϾ�縻3��"
									+ "���ѱ� ������� 165g","Ʈ��������Ŀ1����","YG�˾������MD","��������ī�弼Ʈ","�������3����"};//30���̻�*/
		int[] kopo18_price = {1000000,2500,500,3300,25000,100,1500,21900,35400,4300,6600,5000,3900,4400,6900,2900,13000,18600,56200,5600,7780,9900,1100,2500,6800,2580,9900,9900,19900,29000,1995}; //���ݹ迭
		int[] kopo18_num = {10,4,1,1,10,1,1,2,1,1,1,1,1,1,1,5,1,1,1,3,1,1,5,1,1,4,1,3,2,5,7}; //����
		boolean[] kopo18_taxfree = {false,false,false,true,false,false,false,false,false,false,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false}; //�鼼����

		System.out.printf("%s","Emart");
		System.out.printf("%29s\n","�̸�Ʈ ������(031)888-1234");
		System.out.printf("%30s\n","206-85-50913 ����");
		System.out.printf("%28s\n","���� ������ �������552");
		System.out.println();
		System.out.printf("%10s\n","������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%10s\n","������ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%10s\n","���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%10s\n","��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println();
		System.out.printf("%2s %5s %16s\n","[�� ��]",kopo18_sdt.format(kopo18_calt.getTime()),"POS:0011-9861");//�б��� �����Ǿ��ִ� ��¥���� �̿��Ͽ� ����ð� ��Ÿ��
		System.out.print("-----------------------------------------\n");
		System.out.printf("%7s %11s %5s %6s\n","�� ǰ ��", "�� ��", "����", "�� ��");
		System.out.print("-----------------------------------------\n");
		
		//��ü����
		int kopo18_totalPrice = 0;//��ü�����ʱ�ȭ
		for(int kopo18_i = 0; kopo18_i < kopo18_itemname.length ; kopo18_i++)  { //��ǰ�̸����� �ݺ����� ������ 
			kopo18_totalPrice = kopo18_totalPrice+ kopo18_price[kopo18_i] * kopo18_num[kopo18_i]; //����*������ ���� ��ü���� ���ϱ�
		}
	
		//�鼼��ǰ,������ǰ(�ΰ�������)
		int kopo18_excludeTax = 0; //�鼼���� �ʱ�ȭ
		int kopo18_includeTax = 0;//�������� �ʱ�ȭ
		
		for(int kopo18_i = 0; kopo18_i < kopo18_itemname.length ; kopo18_i++) { //��ǰ�̸��̷� �ݺ��� ������
			if(kopo18_taxfree[kopo18_i ] == true) { //�鼼�� �´ٸ�
				kopo18_excludeTax = kopo18_price[kopo18_i] * kopo18_num[kopo18_i] + kopo18_excludeTax; //�鼼��ǰ�� �����ؼ� �־��
			} else {
				kopo18_includeTax =  kopo18_price[kopo18_i] * kopo18_num[kopo18_i] + kopo18_includeTax; //������ǰ�� �����ؼ� �־��
			}
		}	
		
		//������ǰ-�ΰ���
		double kopo18_realTax; //�Ǽ��� �ΰ���
		int kopo18_finalTax; //������ �ΰ���
		
		kopo18_realTax = kopo18_includeTax / 11.0; //�Ǽ��� �ΰ����� ���������� 11�� �������� ��
		if(kopo18_realTax == (int)kopo18_realTax) { //���� �Ǽ����ΰ����� �Ǽ��� ���������� ��ȯ�� �ΰ��������ٸ�
			kopo18_finalTax = (int)kopo18_realTax; //�������� �ٷ� �ְ�
		} else {
			kopo18_finalTax = (int)kopo18_realTax + 1; //�ƴϸ� �Ҽ��� �ø� +1 ó���ؼ� ������ �ΰ����� �ֱ�
		}
		
		//������ǰ����
		int kopo18_includeTaxPrice =  kopo18_includeTax - kopo18_finalTax; //������ǰ���� = �������� - �ΰ���
		
//		System.out.println("��ü����" +kopo18_totalPrice);
//		System.out.println( "�鼼����" +kopo18_excludeTax);
//		System.out.println( "��������" +kopo18_includeTax);
//		System.out.println("�ΰ��� �Ǽ���" +kopo18_realTax);
//		System.out.println("�ΰ��� ������"+ kopo18_finalTax);
//		System.out.println("������ǰ����"+ kopo18_includeTaxPrice);
		
		//��ǰ���
		for(int kopo18_i = 1; kopo18_i < kopo18_itemname.length + 1 ; kopo18_i++) { //��ǰ�̸��� �ݺ��ϸ鼭 i�� ������ �� �̾ƾ��ϹǷ�
			if(kopo18_taxfree[kopo18_i - 1] == true) { //�迭�� 0���� �����ϴµ� for int = 1�̴ϱ� �ϳ� �������, �迭-1�Ѱ��� �鼼�� true���
				System.out.print("�� "); //�׸��� *����
			}else {
				System.out.print("��  ");
			}
			System.out.printf("%s %9s%3.3s%10.9s\n",subStrBytes(kopo18_itemname[kopo18_i-1]), df.format(kopo18_price[kopo18_i-1]),kopo18_num[kopo18_i-1],df.format(kopo18_price[kopo18_i-1] * kopo18_num[kopo18_i-1] ));//��ü������ �̷��� ����ض�
			//System.out.printf("%s%11.11s%3.3s%10.11s\n",subStrBytes(kopo18_itemname[kopo18_i-1]), kopo18_price[kopo18_i-1],kopo18_num[kopo18_i-1],kopo18_price[kopo18_i-1] * kopo18_num[kopo18_i-1] );//��ü������ �̷��� ����ض�
			if(kopo18_i % 5 == 0) { //���� �迭�� ���ƴٴϴ� i�� 5�� ������
				System.out.print("-----------------------------------------\n"); //���м� ����ض�
			}	
		}
		
		System.out.println();
		System.out.printf("%22s %,13d\n","   �� ǰ�� ����", kopo18_itemname.length); //�̸��迭�� ������ ����ȴ� 
		System.out.printf("%23s %,13d\n","(*)�� ��  �� ǰ", kopo18_excludeTax); //if���ǹ����� true�ΰ͵��� ��
		System.out.printf("%23s %,13d\n","   �� ��  �� ǰ", kopo18_includeTaxPrice); //if���ǹ����� false�ΰ͵���
		System.out.printf("%24s %,13d\n","   ��   ��   ��", kopo18_finalTax); //������ ��ȯ�Ѽ�����
		System.out.printf("%25s %,13d\n","   ��        ��", kopo18_totalPrice); //����+�����+�ΰ���
		System.out.printf("%5s %,23d\n","�� �� �� �� �� ��",kopo18_totalPrice);//����+�����+�ΰ���
		System.out.print("-----------------------------------------\n");
		System.out.printf("%s %27s\n","0012 KEB �ϳ�","541707**0484/35860658");
		System.out.printf("%s %25s\n","ī�����(IC)","�Ͻú� / " + df.format(kopo18_totalPrice ));//����+�����+�ΰ���
		System.out.print("-----------------------------------------\n");
		System.out.printf("%22s\n","[�żΰ�����Ʈ ����]");
		System.out.printf("%10s\n","��*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%5s %18s %7s\n","��ȸ�߻�����Ʈ", "9350**9995","164");
		System.out.printf("%5s %16s %7s\n","����(����)����Ʈ", "1995(   ","0723)");
		System.out.printf("%10s\n","*��������Ʈ ��ȿ�Ⱓ�� �ĳ��Դϴ�.");
		System.out.print("-----------------------------------------\n");
		System.out.printf("%21s\n","���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%s %30s\n","������ȣ:", "34��****");
		System.out.printf("%s %31s\n","�����ð�:",kopo18_sdt2.format(kopo18_calt.getTime()));//���� ��¥�Լ��� �޶� �����ٸ��� ������
		System.out.print("-----------------------------------------\n");
		System.out.printf("%s %4s %22s", "ĳ��:19950319", "��00", "0319");
		System.out.println();
		System.out.printf("%14s%s\n", kopo18_sdt3.format(kopo18_calt.getTime()),"/00119861/00164980/31");//��¥�� �޶� �����ٸ��� ����
	
	}
	public static String subStrBytes (String kopo18_itemnames) {
		
		String kopo18_decoding = null; //���������� �ǵ��� ��������
		int kopo18_cutnum = 16; //���� �ڸ� �ѱ۰���
		byte[] kopo18_NewStrByte = new byte[kopo18_cutnum + 1]; //���ο� ����Ʈ������ �����ؼ� �ڸ�����+1��ŭ �ִ´�(�迭�� 0���� ����)
		
		String kopo18_text = kopo18_itemnames;//itemname�� ���ڿ��� �޾Ƽ�
		byte[] kopo18_strByte = kopo18_text.getBytes(); //����Ʈ�� �ٲپ� ����Ʈ�迭�� �ִ´�
		
		if(kopo18_strByte.length < kopo18_cutnum) {//��ǰ����� �ڸ��������� �۴ٸ�
			for(int kopo18_i = 0; kopo18_i<kopo18_strByte.length; kopo18_i++) { //������Ʈ������ �ϴ� ����� ����ְ�
				kopo18_NewStrByte[kopo18_i] = kopo18_strByte[kopo18_i];
			}
			for(int kopo18_i = kopo18_strByte.length; kopo18_i < kopo18_cutnum; kopo18_i++) {//�ڸ����� ������ i�� ������
				kopo18_NewStrByte[kopo18_i] = 32; //������ ����ִ´�(����Ʈ���� 32�� ������
			}
			kopo18_decoding = new String(kopo18_NewStrByte); //�ٵȰ��� decoding������ �ִ´�
		}
		
		else  { //���� ���� �ڸ� ���̺��� ��ǰ����� ��ٸ�
			int kopo18_cnt = 0; //���������� �ʱ�ȭ�ϰ�
			for(int kopo18_i = kopo18_cutnum - 1; kopo18_i > -1; kopo18_i--) { //�迭�̱⶧���� �ڸ����̿��� 1���������� �Ųٷ� ��ǰ����� ���´�
				if(kopo18_strByte[kopo18_i] < 0) { //���� ��ǰ��� ����Ʈ�� �������(�ѱ��̶��)
					kopo18_cnt++; //������ �ϳ� �÷��ְ�
				} else if (kopo18_strByte[kopo18_i] > 0) { //������(�ѱ����� ������ڵ�)
					break; //�״�� ���Ͷ�
				}
			}
			if(kopo18_cnt % 2 == 0) { //�׸��� ������ ¦�����
				for(int kopo18_i = 0; kopo18_i <kopo18_cutnum; kopo18_i++) { //�ѱ��� �� �������̴ϱ�
					kopo18_NewStrByte[kopo18_i] = kopo18_strByte[kopo18_i]; //�� ����Ʈ ������ �־�� (�ϼ�ǰ)
				}
			}
				else if (kopo18_cnt % 2 != 0) { //Ȧ�����(�� ���߶�����)
					for(int kopo18_i = 0; kopo18_i< kopo18_cutnum - 1;kopo18_i++) {//�ϴ� �߸��ڸ��Ϳ��� �ϳ� �� �ְ�
						kopo18_NewStrByte[kopo18_i] = kopo18_strByte[kopo18_i]; //�� ����Ʈ������ ������ �ѱ۵�
					}
					kopo18_NewStrByte[kopo18_cutnum] = 32; //������ �־��
			}
			kopo18_decoding = new String(kopo18_NewStrByte); //���ڵ� ������ ������Ʈ������ �־��
		}
		return kopo18_decoding; //�������� �� �ڸ��ѱ��� �����ض�
	}



	

}
