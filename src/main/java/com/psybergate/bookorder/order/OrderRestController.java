package com.psybergate.bookorder.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderRestController {

    private final OrderService orderService;

    @Autowired
    public OrderRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public BookOrder order(@RequestParam String isbn, @RequestParam String bookName, @RequestParam String customerName, @RequestParam  int quantity)
    {
        BookOrder bookOrder  = new BookOrder(isbn,quantity, bookName,customerName);
        return orderService.save(bookOrder);
    }

    @GetMapping("/allOrders")
    public ResponseEntity<List<BookOrder>> getAll()
    {
        return ResponseEntity.ok(orderService.findAll());
    }
}
