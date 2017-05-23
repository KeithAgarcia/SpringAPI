package com.example.SpringAPI.controllers;

import com.example.SpringAPI.services.PoliceDataList;
import com.example.SpringAPI.services.PoliceReportService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Keith on 5/22/17.
 */
//@org.springframework.stereotype.Controller
@org.springframework.stereotype.Controller
public class Controller {
    PoliceReportService policeReportService;

    public Controller(PoliceReportService policeReportService) {
        this.policeReportService = policeReportService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, String month, String year) {
        PoliceDataList policeData = policeReportService.getUrlData(month, year);
        model.addAttribute("policedata", policeData);
        return "home";
    }
}
