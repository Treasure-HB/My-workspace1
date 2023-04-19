package PPT5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class 이마트이게찐최종 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("###,###,###,###");
		
		Calendar kopo18_calt = Calendar.getInstance(); //캘린더함수호출
		SimpleDateFormat kopo18_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");//날짜변수설정(분까지)
		SimpleDateFormat kopo18_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");//날짜변수설정(초까지)
		SimpleDateFormat kopo18_sdt3 = new SimpleDateFormat("YYYYMMdd");//날짜변수설정(일까지)
		
		String[] kopo18_itemname = {"찌니야","서울까지","와줘서너무고마워","친구생일이라고","먼길오느라고생했","다","오늘내가밥살게","생일기념이기도하고","고 네가서울까지와준게","와준게 선물이야","나요새이런거배워",
				"신기하지ㅋㅋㅋ","아직적응중이긴한데0","데 열심히해볼게","내일 너볼꺼 생각하면","하니 좀 설렌다ㅎ","우리찌니는순천에서", "서 잘 지내고있는g","걸까 궁금하다", 
				"남친분이랑 오순도순","도순 직장적응하면서","면서 잘하고있을꺼","꺼라고 믿고있어","우리 얼마만에보는","거냐..울컥","내가 빨리취직해서","해서 같이 여행가야"
						+ "야할텐데ㅎㅎㅎ","야할텐데ㅋㅋㅋ","아무튼사랑하고","오늘재밌게보내자"," love you ♥"};//30개이상
		
		/*String[] kopo18_itemname = {"kkkkkkkkkkkkkkkkk파이","정우노래짱5롤*3","바나나 우유롯데제과","건포도말린델몬트","오렌지주스델콘트","초코에몽","새우깡5","해피홈핸드워시Safe행사품목","아워홈스테이크등갈비살all in one","농심신라면5개입","(대)국내산삼겹살찌개",
							"순 유기농 바나나","피코크 들깨미역국500","남양맛있는우유","케라시스 앰플 트리트먼트","푸르밀 미숫가루 우유","자일로스갈색설탕500g", "진라면소면컵65g","녹차원흑당시럽10입", 
							"CJ비비고칩","흑원당 말차밀크티","더블링나일론 깡롤","국내산삼겹살찌개","순 유기농 바나나(봉)","피코크 탄두리 닭가슴살","Gap죽장사과4입","주니어양말3족"
									+ "오뚜기 진비빔면 165g","트레저메이커1개입","YG팝업스토어MD","우피포토카드세트","루루인형3개입"};//30개이상*/
		int[] kopo18_price = {1000000,2500,500,3300,25000,100,1500,21900,35400,4300,6600,5000,3900,4400,6900,2900,13000,18600,56200,5600,7780,9900,1100,2500,6800,2580,9900,9900,19900,29000,1995}; //가격배열
		int[] kopo18_num = {10,4,1,1,10,1,1,2,1,1,1,1,1,1,1,5,1,1,1,3,1,1,5,1,1,4,1,3,2,5,7}; //수량
		boolean[] kopo18_taxfree = {false,false,false,true,false,false,false,false,false,false,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false}; //면세유무

		System.out.printf("%s","Emart");
		System.out.printf("%29s\n","이마트 죽전점(031)888-1234");
		System.out.printf("%30s\n","206-85-50913 강희석");
		System.out.printf("%28s\n","용인 수지구 포은대로552");
		System.out.println();
		System.out.printf("%10s\n","영수증 미지참시 교환/환불 불가");
		System.out.printf("%10s\n","정상제품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%10s\n","※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%10s\n","교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();
		System.out.printf("%2s %5s %16s\n","[구 매]",kopo18_sdt.format(kopo18_calt.getTime()),"POS:0011-9861");//분까지 설정되어있는 날짜변수 이용하여 현재시간 나타냄
		System.out.print("-----------------------------------------\n");
		System.out.printf("%7s %11s %5s %6s\n","상 품 명", "단 가", "수량", "금 액");
		System.out.print("-----------------------------------------\n");
		
		//전체가격
		int kopo18_totalPrice = 0;//전체가격초기화
		for(int kopo18_i = 0; kopo18_i < kopo18_itemname.length ; kopo18_i++)  { //물품이름으로 반복문을 돌려서 
			kopo18_totalPrice = kopo18_totalPrice+ kopo18_price[kopo18_i] * kopo18_num[kopo18_i]; //가격*수량을 곱한 전체가격 구하기
		}
	
		//면세물품,과세물품(부가세포함)
		int kopo18_excludeTax = 0; //면세가격 초기화
		int kopo18_includeTax = 0;//과세가격 초기화
		
		for(int kopo18_i = 0; kopo18_i < kopo18_itemname.length ; kopo18_i++) { //물품이름이로 반복문 돌려서
			if(kopo18_taxfree[kopo18_i ] == true) { //면세가 맞다면
				kopo18_excludeTax = kopo18_price[kopo18_i] * kopo18_num[kopo18_i] + kopo18_excludeTax; //면세물품에 누적해서 넣어라
			} else {
				kopo18_includeTax =  kopo18_price[kopo18_i] * kopo18_num[kopo18_i] + kopo18_includeTax; //과세물품에 누적해서 넣어라
			}
		}	
		
		//과세물품-부가세
		double kopo18_realTax; //실수형 부가세
		int kopo18_finalTax; //정수형 부가세
		
		kopo18_realTax = kopo18_includeTax / 11.0; //실수형 부가세에 과세가격을 11로 나눈값이 들어감
		if(kopo18_realTax == (int)kopo18_realTax) { //만약 실수형부가세랑 실수를 정수형으로 변환한 부가세가같다면
			kopo18_finalTax = (int)kopo18_realTax; //정수형에 바로 넣고
		} else {
			kopo18_finalTax = (int)kopo18_realTax + 1; //아니면 소수점 올림 +1 처리해서 정수형 부가세에 넣기
		}
		
		//과세물품가격
		int kopo18_includeTaxPrice =  kopo18_includeTax - kopo18_finalTax; //과세물품가격 = 과세가격 - 부가세
		
//		System.out.println("전체가격" +kopo18_totalPrice);
//		System.out.println( "면세가격" +kopo18_excludeTax);
//		System.out.println( "과세가격" +kopo18_includeTax);
//		System.out.println("부가세 실수형" +kopo18_realTax);
//		System.out.println("부가세 정수형"+ kopo18_finalTax);
//		System.out.println("과세물품가격"+ kopo18_includeTaxPrice);
		
		//물품계산
		for(int kopo18_i = 1; kopo18_i < kopo18_itemname.length + 1 ; kopo18_i++) { //물품이름을 반복하면서 i를 굴려서 다 뽑아야하므로
			if(kopo18_taxfree[kopo18_i - 1] == true) { //배열은 0부터 시작하는데 for int = 1이니까 하나 빼줘야함, 배열-1한값의 면세가 true라면
				System.out.print("♥ "); //그리고 *찍어라
			}else {
				System.out.print("♥  ");
			}
			System.out.printf("%s %9s%3.3s%10.9s\n",subStrBytes(kopo18_itemname[kopo18_i-1]), df.format(kopo18_price[kopo18_i-1]),kopo18_num[kopo18_i-1],df.format(kopo18_price[kopo18_i-1] * kopo18_num[kopo18_i-1] ));//전체적으로 이렇게 출력해라
			//System.out.printf("%s%11.11s%3.3s%10.11s\n",subStrBytes(kopo18_itemname[kopo18_i-1]), kopo18_price[kopo18_i-1],kopo18_num[kopo18_i-1],kopo18_price[kopo18_i-1] * kopo18_num[kopo18_i-1] );//전체적으로 이렇게 출력해라
			if(kopo18_i % 5 == 0) { //만약 배열을 돌아다니는 i가 5의 배수라면
				System.out.print("-----------------------------------------\n"); //구분선 출력해라
			}	
		}
		
		System.out.println();
		System.out.printf("%22s %,13d\n","   총 품목 수량", kopo18_itemname.length); //이름배열의 갯수를 세면된다 
		System.out.printf("%23s %,13d\n","(*)면 세  물 품", kopo18_excludeTax); //if조건문에서 true인것들의 합
		System.out.printf("%23s %,13d\n","   과 세  물 품", kopo18_includeTaxPrice); //if조건문에서 false인것들합
		System.out.printf("%24s %,13d\n","   부   가   세", kopo18_finalTax); //정수로 변환한세금합
		System.out.printf("%25s %,13d\n","   합        계", kopo18_totalPrice); //과세+비과세+부가세
		System.out.printf("%5s %,23d\n","결 제 대 상 금 액",kopo18_totalPrice);//과세+비과세+부가세
		System.out.print("-----------------------------------------\n");
		System.out.printf("%s %27s\n","0012 KEB 하나","541707**0484/35860658");
		System.out.printf("%s %25s\n","카드결제(IC)","일시불 / " + df.format(kopo18_totalPrice ));//과세+비과세+부가세
		System.out.print("-----------------------------------------\n");
		System.out.printf("%22s\n","[신셰계포인트 적립]");
		System.out.printf("%10s\n","구*진 고객님의 포인트 현황입니다.");
		System.out.printf("%5s %18s %7s\n","금회발생포인트", "9350**9995","164");
		System.out.printf("%5s %16s %7s\n","누계(가용)포인트", "1995(   ","0723)");
		System.out.printf("%10s\n","*우정포인트 유효기간은 ∞년입니다.");
		System.out.print("-----------------------------------------\n");
		System.out.printf("%21s\n","구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s %30s\n","차량번호:", "34저****");
		System.out.printf("%s %31s\n","입차시간:",kopo18_sdt2.format(kopo18_calt.getTime()));//위에 날짜함수랑 달라서 변수다르게 지정함
		System.out.print("-----------------------------------------\n");
		System.out.printf("%s %4s %22s", "캐셔:19950319", "박00", "0319");
		System.out.println();
		System.out.printf("%14s%s\n", kopo18_sdt3.format(kopo18_calt.getTime()),"/00119861/00164980/31");//날짜가 달라서 변수다르게 지정
	
	}
	public static String subStrBytes (String kopo18_itemnames) {
		
		String kopo18_decoding = null; //최종적으로 되돌릴 변수설정
		int kopo18_cutnum = 16; //내가 자를 한글개수
		byte[] kopo18_NewStrByte = new byte[kopo18_cutnum + 1]; //새로운 바이트변수를 설정해서 자를개수+1만큼 넣는다(배열은 0부터 시작)
		
		String kopo18_text = kopo18_itemnames;//itemname을 문자열로 받아서
		byte[] kopo18_strByte = kopo18_text.getBytes(); //바이트로 바꾸어 바이트배열에 넣는다
		
		if(kopo18_strByte.length < kopo18_cutnum) {//물품목록이 자를개수보다 작다면
			for(int kopo18_i = 0; kopo18_i<kopo18_strByte.length; kopo18_i++) { //새바이트변수에 일단 목록을 집어넣고
				kopo18_NewStrByte[kopo18_i] = kopo18_strByte[kopo18_i];
			}
			for(int kopo18_i = kopo18_strByte.length; kopo18_i < kopo18_cutnum; kopo18_i++) {//자를길이 전까지 i를 돌려서
				kopo18_NewStrByte[kopo18_i] = 32; //공백을 집어넣는다(바이트에서 32는 공백임
			}
			kopo18_decoding = new String(kopo18_NewStrByte); //다된것을 decoding변수에 넣는다
		}
		
		else  { //만약 내가 자를 길이보다 물품목록이 길다면
			int kopo18_cnt = 0; //갯수변수를 초기화하고
			for(int kopo18_i = kopo18_cutnum - 1; kopo18_i > -1; kopo18_i--) { //배열이기때문에 자를길이에서 1을뺀수부터 거꾸로 물품목록을 집는다
				if(kopo18_strByte[kopo18_i] < 0) { //만약 물품목록 바이트가 음수라면(한글이라면)
					kopo18_cnt++; //갯수를 하나 올려주고
				} else if (kopo18_strByte[kopo18_i] > 0) { //양수라면(한글제외 영어숫자등)
					break; //그대로 나와라
				}
			}
			if(kopo18_cnt % 2 == 0) { //그리고 갯수가 짝수라면
				for(int kopo18_i = 0; kopo18_i <kopo18_cutnum; kopo18_i++) { //한글이 잘 빼진것이니까
					kopo18_NewStrByte[kopo18_i] = kopo18_strByte[kopo18_i]; //새 바이트 변수에 넣어라 (완성품)
				}
			}
				else if (kopo18_cnt % 2 != 0) { //홀수라면(잘 못잘라진것)
					for(int kopo18_i = 0; kopo18_i< kopo18_cutnum - 1;kopo18_i++) {//일단 잘못자른것에서 하나 덜 넣고
						kopo18_NewStrByte[kopo18_i] = kopo18_strByte[kopo18_i]; //새 바이트변수에 넣으면 한글됨
					}
					kopo18_NewStrByte[kopo18_cutnum] = 32; //공백을 넣어라
			}
			kopo18_decoding = new String(kopo18_NewStrByte); //디코딩 변수에 새바이트변수를 넣어라
		}
		return kopo18_decoding; //메인으로 잘 자른한글을 리턴해라
	}



	

}
