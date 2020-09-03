package com.uday.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.info.TimeInfo;

@RestController
public class JsonXmlResponse {

	@GetMapping(value = "jsonxml")
	public TimeInfo jsonXmlRes(/* @RequestParam TimeInfo timeInfo */) {

		TimeInfo timeInfo = new TimeInfo();
		timeInfo.setTime("time");
		return timeInfo;
	}

}
