package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {


        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(product1,new BigDecimal(20), 3,new BigDecimal(60));
        Item item2 = new Item(product2,new BigDecimal(30), 4,new BigDecimal(120));
        Item item3 = new Item(product3,new BigDecimal(40), 5,new BigDecimal(200));



        Invoice invoice = new Invoice();
        invoice.setNumber("fv/06/2025");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //THEN
        assertNotEquals(0,id);

        //cleanUp
        /*
        invoiceDao.deleteAll();
        productDao.deleteAll();
        */
    }
}
