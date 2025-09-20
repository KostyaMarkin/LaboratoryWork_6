package com.MarkinKonstantin.LaboratoryWork_6.dao;

import com.MarkinKonstantin.LaboratoryWork_6.entity.EducationalDesciplines;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationalDesciplinesDAO {

    List<EducationalDesciplines> getAllEducationalDesciplines();

    EducationalDesciplines getEducationalDesciplineById(int id);

    EducationalDesciplines saveEducationalDesciplines(EducationalDesciplines educationalDesciplines);

    void deleteEducationalDesciplines(int id);
}
