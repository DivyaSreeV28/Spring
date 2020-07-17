package com.xworkz.springmvc.calamities.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springmvc.calamities.dao.NaturalCalamitiesDao;
import com.xworkz.springmvc.calamities.dto.NaturalCalamitiesDTO;

@Component
public class NaturalCalamitiesServiceImpl implements NaturalCalamitiesService {
	
	@Autowired
	private NaturalCalamitiesDao dao;
	
	public NaturalCalamitiesServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}
	
	public int validateAndSave(NaturalCalamitiesDTO dto) {
		System.out.println("Create: validateAndSave "+dto);
		//valid=0 invalid=1
		int isValid=1;
		try {
			if(Objects.nonNull(dto)) {
				System.out.println("Starting to validate fields..");
			
				String place=dto.getPlace();
				if(place!=null && !place.isEmpty() ) {
					System.out.println("Place of calamity is valid");
					isValid=0;
				}else {
					System.out.println("Place of calamity is not valid");
					isValid=1;
				}
				String date=dto.getDate();
				if(isValid==0 && date!=null && !date.isEmpty()) {
					System.out.println("Date of calamity is valid");
					isValid=0;
				}else {
					System.out.println("Date of calamity is not valid");
					isValid=1;
				}
				String type=dto.getTypes();
				if(isValid==0 && type!=null && !type.isEmpty()) {
					System.out.println("Type of calamity is valid");
					isValid=0;
				}else {
					System.out.println("Type of calamity is not valid");
					isValid=1;
				}
			}
			if(isValid==0) {
				System.out.println("Data is valid and can save fields");
				dao.create(dto);
				return isValid;
			}
			System.out.println("End: validateAndSave "+dto);
		} catch (Exception e) {
			System.err.println("Exception in validateAndSave "+e.getMessage());
		}
		return isValid;
		
	}
}
