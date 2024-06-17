package com.example.shopbackend.service;

import com.example.shopbackend.model.Purchase;
import com.example.shopbackend.repository.PurchaseRepositroy;
import com.example.shopbackend.repository.projection.PurchaseItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {
    private final PurchaseRepositroy purchaseRepositroy;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepositroy.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepositroy.findAllPurchaseOfUser(userId);
    }
}
