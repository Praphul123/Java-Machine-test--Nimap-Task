package com.product.request;


import com.product.model.Category;
import com.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateRequest {

    private String categoryName;

    private Integer categoryId;

    private List<Product> product;
}
