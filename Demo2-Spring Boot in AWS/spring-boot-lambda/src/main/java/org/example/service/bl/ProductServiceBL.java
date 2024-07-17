package org.example.service.bl;

import org.example.dto.ProductDTO;

import java.util.List;

public interface ProductServiceBL {
    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(String id);

    ProductDTO createNewProduct(ProductDTO dto);

    ProductDTO updateProduct(String id, ProductDTO dto);

    void deleteProduct(String id);

}