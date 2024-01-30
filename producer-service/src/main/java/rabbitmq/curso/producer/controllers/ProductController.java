package rabbitmq.curso.producer.controllers;

import lombok.RequiredArgsConstructor;
import dtos.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rabbitmq.curso.producer.services.ProductService;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTO> produces(@RequestBody ProductDTO dto) {
        service.createProduct(dto);
        return ResponseEntity.status(CREATED).build();
    }
}
