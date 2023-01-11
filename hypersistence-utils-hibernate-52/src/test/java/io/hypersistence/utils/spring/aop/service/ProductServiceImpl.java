package io.hypersistence.utils.spring.aop.service;

import org.springframework.stereotype.Service;

import javax.persistence.OptimisticLockException;

@Service
public class ProductServiceImpl extends BaseServiceImpl implements ProductService {

    @Override
    public void saveProduct() {
        incrementCalls();
        throw new OptimisticLockException("Save Product!");
    }
}
