package hello.core.order;

public interface OrderService {
    // 주문 생성
    // - 회원 id
    // - 상품명
    // - 상품 가격
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
