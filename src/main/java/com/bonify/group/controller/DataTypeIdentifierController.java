package com.bonify.group.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bonify.group.dataholder.ContractTypeHolder;

@RestController
public class DataTypeIdentifierController {
	
	
	/**
	 * @return 
	 */
	@RequestMapping(value = "/types/{type}", method = RequestMethod.GET)
	public String getType(@PathVariable("type") String type) {
		String processType =null;
		if(Arrays.stream(ContractTypeHolder.values()).anyMatch((t) -> t.name().equals(type))) {
			processType = "Processed " + ContractTypeHolder.valueOf(type);
			System.out.println(processType);
		}else {
			System.out.println("No Match");
		}
		return processType;
	}

}
