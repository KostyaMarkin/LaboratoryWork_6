package com.MarkinKonstantin.LaboratoryWork_6.service;

import com.MarkinKonstantin.LaboratoryWork_6.entity.EducationalDesciplines;
import com.MarkinKonstantin.LaboratoryWork_6.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EducationalDesciplinesService {

    List<EducationalDesciplines> getAllEducationalDesciplines();

    ResponseEntity<EducationalDesciplines> getEducationalDescipline(int id);

    ResponseEntity<EducationalDesciplines>  saveEducationalDescipline(EducationalDesciplines educationalDesciplines);

    ResponseEntity<EducationalDesciplines>  deleteEducationalDescipline(int id);
}
