package cl.w3.day2;

// import cl.java.fifthcls.Student; -> 다른 패키지 안에 있는 Student class 가져오기 
// 그러나 Student 이름이 둘이면 헷갈리거나 충돌하므로 다른 패키지명 이름을 달리 하거나 풀패키지 쓰는 것을 추천 

import cl.w3.day2.sub.Person; //1 

public class ClassMain {

	public static void main(String[] args) {
		Student st = new Student(); // cl.w3.day2 package 
		// .operator 
		st.studentId = 1000;
		st.studentName = "홍길동"; 
		
		// cl.w3.day2.sub.Person p; //2 
		
		Person p = new Person(); 
		
		// 사용
		System.out.println(st.studentName);

		//학생정보
		// st.studentName + st.studentId + st.address;
		
		// 2. 반환형식 있다 
		String info = st.showStudentInfo();
		System.out.println(info);
		// System.out.println(st.showStudentInfo()); -> 위 두 줄을 간략화한 것. 다른 점은 없음. 
		
		// 3. 반환형식 없다 
		st.println();
		
		// 4. 매개변수
		info = st.setScore(1000);
		System.out.println(info); 
		
		st.setScore2(1000);
		System.out.println(st.showStudentInfo());
			
		// 다른 패키지
		// cl.java.fifthcls.Student st3 = new cl.java.fifthcls.Student();  
		
	}

}
