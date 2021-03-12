package com.psybergate.bookorder.order;

import java.util.List;


public interface OrderService {

    BookOrder save(BookOrder bookOrder);

    List<BookOrder> findAll();
}
