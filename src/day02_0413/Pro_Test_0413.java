package day02_0413;

import java.util.Scanner;

public class Pro_Test_0413 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name_sc;
		final String korean="국어", english="영어", math="수학";
		int k_sc, e_sc, m_sc; //국어 점수, 영어 점수, 수학 점수
		int kem_sum; //합계
		
		System.out.print("당신의 이름은 무엇입니까 ? ");
		name_sc = scan.next();//이름
		System.out.print(name_sc+"님의 "+korean+" 점수 : ");
		k_sc = scan.nextInt();//국어
		System.out.print(name_sc+"님의 "+english+" 점수 : ");
		e_sc = scan.nextInt();//영어
		System.out.print(name_sc+"님의 "+math+" 점수 : ");
		m_sc = scan.nextInt();//수학
		//점수 합계
		kem_sum = k_sc + e_sc+ m_sc;
		
		//결과값
		System.out.println("================");
		System.out.println("이름 : "+name_sc);
		System.out.println("================");
		System.out.println(korean+" : "+k_sc);
		System.out.println(english+" : "+e_sc);
		System.out.println(math+" : "+m_sc);
		System.out.println("================");
		System.out.println("합계 : "+kem_sum);
		System.out.println("================");
		
		
		
	}
}
