package com.pms.billing_service.controller;

import com.pms.billing_service.entity.Billing;
import com.pms.billing_service.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billings")
public class BillingController {

    @Autowired
    private BillingRepository billingRepository;

    @GetMapping
    public List<Billing> getAllBills() {
        return billingRepository.findAll();
    }

    @PostMapping
    public Billing createBill(@RequestBody Billing billing) {
        return billingRepository.save(billing);
    }

    @GetMapping("/{id}")
    public Billing getBillById(@PathVariable Long id) {
        return billingRepository.findById(id).orElse(null);
    }
}
