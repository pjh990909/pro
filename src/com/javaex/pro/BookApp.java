package com.javaex.pro;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("===============================");
			System.out.println("   1.회원      |     2.관리자    |");
			System.out.println("===============================");
			System.out.print("입력란:");
			
			int choose =sc.nextInt();
			
			switch(choose) {
			
					case 1://회원
							boolean in = true;
							
							while(in) {
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("============================");
								System.out.println(" 1.로그인 | 2.회원가입 | 3.나가기 ");
								System.out.println("============================");
								System.out.print("입력란:");
								
								int mem = sc.nextInt();
								String ddd = sc.nextLine();//아이디 패스워드 안쳐져서 써논거
								switch(mem) {
								
										case 1:
											System.out.print("ID:");
											String id = sc.nextLine();
											System.out.print("PW:");
											String pw = sc.nextLine();
												boolean lo = true;
												
												while(lo) {
													System.out.println("");
													System.out.println("");
													System.out.println("");
													System.out.println("");
													System.out.println("================================================================");
													System.out.println(" 1.대여하기 | 2.반납하기 | 3.회원정보수정하기 | 4.나의 대여 및 반납 | 5.나가기");
													System.out.println("================================================================");
													System.out.print("입력란:");
													
													int log = sc.nextInt();
													
													switch(log) {
																
															case 1:
																//대여하기
																
																
															case 2:
																//반납하기
																
																
															case 3:
																//회원정보수정하기
																
																
															case 4:
																//나의 대여 및 반납
																
																
																
															case 5:
																//나가기
																
																
															default:
																//잘못된 번호 오류표시
																
													}//log
												}//lo
											
											
										case 2:
											//회원가입
										
										case 3:
										System.out.println("");
										in = false;
										break;//나가기
											
										default:
											//잘못된 번호 오류표시
								
								}//mem
							}//in
			
					case 2://관리자
							boolean on = true;
							
							while(on) {
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("========================================");
								System.out.println(" 1.대여현황 | 2.회원리스트 | 3.책관리 | 4.나가기");
								System.out.println("========================================");
								System.out.print("입력란:");
								
								int mg = sc.nextInt();
								
								switch(mg) {
										
										case 1:
											//대여현황
											
											
										case 2:
											//회원리스트
											
											
										case 3:
											//책관리
											
											
										case 4:
											System.out.println("");
											on = false;
											break;//나가기
											
											
											
										default:
											//잘못된 번호 오류표시
								
								
								}//mg
							}//on
							
			
			
			}//choose
			
			
			
	
		sc.close();
		
	}

}
