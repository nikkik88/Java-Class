package cl.w3.day2;

public class OrderMain {

	public static void main(String[] args) {


		OrderClass odr = new OrderClass(); 
		
		odr.orderNum = 201803120001L;
		odr.orderId = "abc123";
		odr.orderDate = "2018년 3월 12일";
		odr.orderName = "홍길순";
		odr.productNum = "PD0345-12";
		odr.address = "서울시 영등포구 여의도동 20번지";
		
		odr.print();

	}

}
