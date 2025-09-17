package com.example.record.product;

import com.example.record.exception.NoSuchProductException;
import com.example.record.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public ApiResponse<Product> getProduct(@PathVariable("id") int id) {
        Product product = productService.getProduct(id);
        if (product == null)
            throw new NoSuchProductException("개별 조회 실패");
        return ApiResponse.success(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/products")
    public Product registerProduct(@RequestBody RecordRegisterDto recordRegisterDto) { // @RequestParam("name") String productName) {
//        System.out.println(record.toString());
        return productService.saveProduct(recordRegisterDto);
    }
}
