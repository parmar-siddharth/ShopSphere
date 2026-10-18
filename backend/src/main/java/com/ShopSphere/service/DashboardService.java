package com.ShopSphere.service;

import com.ShopSphere.repository.CategoryRepository;
import com.ShopSphere.repository.OrderRepository;
import com.ShopSphere.repository.ProductRepository;
import com.ShopSphere.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DashboardService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    public DashboardService(ProductRepository productRepository, CategoryRepository categoryRepository,
                            UserRepository userRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    public Map<String, Long> getCounts() {
        return Map.of(
                "products", productRepository.count(),
                "categories", categoryRepository.count(),
                "users", userRepository.count(),
                "orders", orderRepository.count()
        );
    }
}
