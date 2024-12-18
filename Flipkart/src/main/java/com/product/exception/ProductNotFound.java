package com.product.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ProductNotFound extends RuntimeException {

    private static final long serialVersionUID = 14578945679L;
    public String message;

}
