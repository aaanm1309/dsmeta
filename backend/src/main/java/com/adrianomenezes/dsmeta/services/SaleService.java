package com.adrianomenezes.dsmeta.services;

import com.adrianomenezes.dsmeta.entities.Sale;
import com.adrianomenezes.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {

        LocalDate minDateDef = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()).minusDays(350);
        LocalDate maxDateDef = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()).plusDays(-330);


        LocalDate min = minDate.equals("") ? minDateDef : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? maxDateDef : LocalDate.parse(maxDate);
        return saleRepository.findSales(min, max, pageable);
    }
}
