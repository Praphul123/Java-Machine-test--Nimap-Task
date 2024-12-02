package com.product.response;

import com.product.model.Category;
import com.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductUpdateResponse implements Serializable {

    private String categoryName;
    private List<Product> product;
}

