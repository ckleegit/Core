package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
//        MemberService memberService = new MemberServiceImpl();
//        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "짬뽕", 18500);

        System.out.println("order = " + order);
        System.out.println("order = " + order.getMemberId());
        System.out.println("order = " + order.getItemName());
        System.out.println("order = " + order.getItemPrice());
        System.out.println("DiscountPrice = " + order.getDiscountPrice());
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}
