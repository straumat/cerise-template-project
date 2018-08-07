package com.oakinvest.cerise.myserver.service;

import com.oakinvest.cerise.dto.CurrencyPairInformationParameters;
import com.oakinvest.cerise.dto.CurrencyPairInformationResult;
import com.oakinvest.cerise.dto.Grouping;
import com.oakinvest.cerise.service.CurrencyPairInformationService;
import com.oakinvest.cerise.util.generic.CeriseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Currency-pair information implementation.
 */
@Service
public class MyCurrencyPairInformationService extends CeriseService implements CurrencyPairInformationService {

    @Override
    public List<CurrencyPairInformationResult> getCurrencyPairInformation(final CurrencyPairInformationParameters parameters) {
        List<CurrencyPairInformationResult> results = new LinkedList<>();

        final CurrencyPairInformationResult dummyResponse = new CurrencyPairInformationResult();
        dummyResponse.setCp("MY_TEST");
        dummyResponse.setQuote("USD");
        dummyResponse.setBase("XBT");
        dummyResponse.setLocale("en_US");
        dummyResponse.setDesc("Smoothed averages");
        dummyResponse.setLongDesc("USD price quotes as compared to Bitcoin value\\n\\nRecommended for casual usage");
        dummyResponse.setSymbol(Arrays.asList(Arrays.asList("-$", "$"), null));
        dummyResponse.setDigits("Arabic");
        dummyResponse.setGrouping(new Grouping(3, ",", 0));
        dummyResponse.setFractionSeparator(".");
        List<Integer> fractionDigits = new ArrayList<>();
        fractionDigits.add(0);
        fractionDigits.add(2);
        fractionDigits.add(2);
        dummyResponse.setFractionDigits(fractionDigits);
        dummyResponse.setMinPoll(300);
        dummyResponse.setLongPoll(true);
        dummyResponse.setHistory(1457231416D);
        dummyResponse.setArchive(145723141D);
        results.add(dummyResponse);

        return results;
    }

}
