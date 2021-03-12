package com.psybergate.bookorder.order;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public BookOrder save(BookOrder bookOrder) {
        return orderRepository.save(bookOrder);
    }

    @Override
    public List<BookOrder> findAll() {
        return orderRepository.findAll();
    }
}
