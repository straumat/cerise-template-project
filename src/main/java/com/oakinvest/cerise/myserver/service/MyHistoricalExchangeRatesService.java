package com.oakinvest.cerise.myserver.service;

import com.oakinvest.cerise.dto.HistoricalExchangeRatesParameters;
import com.oakinvest.cerise.dto.HistoricalExchangeRatesResult;
import com.oakinvest.cerise.service.HistoricalExchangeRatesService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Historical exchange rates implementation.
 */
@Service
public class MyHistoricalExchangeRatesService implements HistoricalExchangeRatesService {

    @Override
    public List<HistoricalExchangeRatesResult> getHistoricalExchangeRates(final HistoricalExchangeRatesParameters parameters) {
        List<HistoricalExchangeRatesResult> results = new LinkedList<>();

        final HistoricalExchangeRatesResult dummyResponse = new HistoricalExchangeRatesResult();
        dummyResponse.setCp("MY_TEST");
        dummyResponse.setTime(1488760000D);
        dummyResponse.addRates("typical", 1300);
        results.add(dummyResponse);

        return results;
    }

}
