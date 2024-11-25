/*
  Ramyasahithya Magani - G01425752
  Saichinmayee Yanamadala-G01459318
  Sreshta Kosaraju - G01460468
*/

/* studentSurveyService interface define the service for managing student survey data, including CRUD operations such as Create, Update, Get and Delete.*/

package _5.hw.assignment3.surveyForm.service;

import _5.hw.assignment3.surveyForm.model.studentSurveyData;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface studentSurveyService {
    studentSurveyData saveStudentSurveyData(studentSurveyData student);
    List<studentSurveyData> getAllStudentsSurveyData();
    studentSurveyData getStudentSurveyDataById(long id);
    ResponseEntity<?> updateStudentSurveyDataById(studentSurveyData student, long id);
    void deleteStudentSurveyData(long id);
}
