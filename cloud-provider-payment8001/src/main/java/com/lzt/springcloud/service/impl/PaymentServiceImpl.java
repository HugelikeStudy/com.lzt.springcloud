package com.lzt.springcloud.service.impl;

import com.lzt.springcloud.dao.PaymentDao;
import com.lzt.springcloud.entities.Payment;
import com.lzt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
