package jpabook.jpashop.repository.order.simplequery;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class OrderSimpleQueryDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    public OrderSimpleQueryDto(Long orderId, String name, LocalDateTime orderDate, OrderStatus orderStatus, Address address){
        this.orderId = orderId;
        this.name = name; //LAZY 초기화, 영속성 컨텍스트에서 찾고 없으면 DB쿼리 날림
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.address = address; //LAZY 초기화, 영속성 컨텍스트에서 찾고 없으면 DB쿼리 날림
    }

}
