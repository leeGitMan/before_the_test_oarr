package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		//객체 배열을 크기 3으로 할당 
		
		Employee[] emp = new Employee[3];
						
						
						
						
						
				// 3개의 생성자를 각각 이용하여 객체 생성 후 
						
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19,'M',"01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20,'F', 1000000, 0.01, "01011112222", "서울 마곡");
						
						
				// 출력
						
						
		for(int i = 0; i < emp.length; i++) {
							System.out.println(emp[i].information());
		}
						
		System.out.println("=============================================================");
						
						
						
						
						
				// 없는 객체들 파악하고
				// 값이 없는 필드에 각각 값을 넣어 입력해서 출력
						
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		System.out.println(emp[0].information());
						
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);				
		emp[1].setBonusPoint(0.3);
						
					
		System.out.println(emp[1].information());
						
		System.out.println("=============================================================");
						
						
						
						
						
				// 연봉 = (급여 + (급여 * 보너스포인트)) *12
					
						
				//System.out.println(emp[0].getSalary());
				//System.out.println(emp[1].getSalary());
				//System.out.println(emp[2].getSalary());
						
						
		int s = 0;// salary 각개개인의 연봉 출력용 변
		int sum = 0;
						
		for(int i = 0; i < emp.length; i++) {
			s = (int) (emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12;
				System.out.println(emp[i].getEmpName() + "의 연봉 : " + s + "원");
							 
				sum += s;
							
		}
		System.out.println("=============================================================");
		System.out.println("직원들의 연봉 평균 : " + sum / emp.length + "원");
						
						
						
						
					
						
				/*
				int a = (int) (emp[0].getSalary() + (emp[0].getSalary() * emp[0].getBonusPoint()))  * 12;
				int b = (int) (emp[1].getSalary() + (emp[1].getSalary() * emp[1].getBonusPoint())) * 12;
				int c = (int) (emp[2].getSalary() + (emp[2].getSalary() * emp[2].getBonusPoint()))  * 12;
						
						
						
				System.out.println(emp[0].getEmpName() + "의 연봉 : " + a);
				System.out.println(emp[1].getEmpName() + "의 연봉 : " + b);
				System.out.println(emp[2].getEmpName() + "의 연봉 : " + c);
				*/
						
						
						
				//System.out.println("직원들 연봉의 평균 : " + (a + b + c) / emp.length);
						
						
					
						
						
						
				// 직원 각각 보너스 적용된 연봉 계산 후 출력
						
				// 총 직원 연봉 평균 구하기
		
	}

}
