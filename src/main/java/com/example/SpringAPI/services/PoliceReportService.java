package com.example.SpringAPI.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Keith on 5/22/17.
 */
@Service
public class PoliceReportService {
    RestTemplate template;

    public PoliceReportService(RestTemplate template) {
        this.template = template;
    }

    public PoliceDataList getUrlData(String month, String year) {

        Map<String, Object> uriVars = new HashMap<>();
        uriVars.put("month", month);
        uriVars.put("year", year);
//        http://localhost:8080/?subreddit=aww/shorType=3
        HttpEntity<PoliceDataList> response = template.exchange("https://data.police.uk/api/crimes-street/all-crime?poly=52.268,0.543:52.794,0.238:52.130,0.478&date={year}-{month}", HttpMethod.GET, null, PoliceDataList.class, uriVars);

        return response.getBody();
    }
}
