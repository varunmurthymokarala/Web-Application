package com.example.resumeapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resumeapplication.entity.Education;
import com.example.resumeapplication.model.EducationBean;
import com.example.resumeapplication.repository.EducationRepository;

@Service
public class EducationService {
	
	@Autowired
	EducationRepository educationRepository;
	
	public EducationBean saveEducation(EducationBean educationBean) {
		
		Education education = new Education();
		
		education.setSpecilization(educationBean.getSpecilization());
		education.setMarks(educationBean.getMarks());
		education.setYearofPassing(educationBean.getYearofPassing());
		education.setStartYear(educationBean.getStartYear());
		education.setQualificationId(educationBean.getQualificationId());
		education.setUser_Id(educationBean.getUserId());
		
		educationRepository.save(education);
		
		return educationBean;
	}

	public List<EducationBean> getEducationList() {
		
		List<EducationBean> eduList = new ArrayList<>();
		
		Iterable<Education> educationList = educationRepository.findAll();
		
		for(Education eduObj: educationList) {
			
		EducationBean educationBean = new EducationBean();
		
		educationBean.setEducationId(eduObj.getEducationId());
		educationBean.setSpecilization(eduObj.getSpecilization());
		educationBean.setMarks(eduObj.getMarks());
		educationBean.setYearofPassing(eduObj.getYearofPassing());
		educationBean.setStartYear(eduObj.getStartYear());
		educationBean.setUserId(eduObj.getUser_Id());
		educationBean.setQualificationId(eduObj.getQualificationId());
		
		eduList.add(educationBean);
		}
		
		return eduList;
	}

	public EducationBean getEducationById(Long educationId) {
		
		EducationBean educationBean = new EducationBean();
		
		Education educationbyId = educationRepository.findById(educationId).orElse(null);
		
		if(educationbyId!=null) {
			
			educationBean.setEducationId(educationbyId.getEducationId());
			educationBean.setSpecilization(educationbyId.getSpecilization());
			educationBean.setMarks(educationbyId.getMarks());
			educationBean.setYearofPassing(educationbyId.getYearofPassing());
			educationBean.setStartYear(educationbyId.getStartYear());
			educationBean.setUserId(educationbyId.getUser_Id());
			educationBean.setQualificationId(educationbyId.getQualificationId());
			
		}
		
		return educationBean;
	}

	public EducationBean updateEducation(EducationBean educationBean) {
			
		Education education = educationRepository.findById(educationBean.getEducationId()).orElse(null);
		

		if(educationBean.getUserId()!=null) {
			education.setUser_Id(educationBean.getUserId());
		}
		
		education.setSpecilization(educationBean.getSpecilization());
		education.setMarks(educationBean.getMarks());
		education.setYearofPassing(educationBean.getYearofPassing());
		education.setStartYear(educationBean.getStartYear());
		education.setQualificationId(educationBean.getQualificationId());
		education.setUser_Id(educationBean.getUserId());
		
		educationRepository.save(education);
		
		return educationBean;
	}

	public void deleteEducation(Long educationId) {
		
		educationRepository.deleteById(educationId);
		
	}
	
	

}
