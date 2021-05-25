package cl.w3.day2;

public class OrderClass {
	
	long orderNum;
	String orderId;
	String orderDate;
	String orderName;
	String productNum;
	String address; 
	
	public void print() {
		System.out.println("주문 번호: " + orderNum);
		System.out.println("주문자 아이디: " + orderId);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + orderName);
		System.out.println("주문 상품 번호: " + productNum);
		System.out.println("배송 주소: " + address);
	}
	

}
