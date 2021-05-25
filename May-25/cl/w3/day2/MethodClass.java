package cl.w3.day2;

public class MethodClass {

	// 멤버 변수/필드/속성...
	
	// 멤버 메소드들...
	public int add(int i1, int i2) {
		int result;
		result = i1 + i2;
		return result;
		
		// return i1 + i2; 
		}
	
		public int getTenTotal() {
			// ...
			return 10*10;
		}
		
		public void printTenTotal() {
			int total = getTenTotal();
			System.out.println(total);
		
		}
		
		public void printGreeting(String name) {
			System.out.println(name + "Hello World");
			return;
		}
		
		public void divide(int num1, int num2) {
			if(num2 == 0) {
				System.out.println("나누는 수는 0이 될 수 없습니다");
				return; // 2. code break 의미
		}else {
			// ....
		}	
		}
		
		public void test(int num1, int num2) {
			for(int i = 0; i < 100; i++) {
				if( i ==0) {
					return;
				}
			}
		}
}
