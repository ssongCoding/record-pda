package com.example.record.product;

public interface ProductRepository {
    /**
     * 규약
     * 소통 창구 (뒤에 숨는 구현체들을 사용할 수 있게 해줘야한다.)
     */
    public Product save(Product product);
}
