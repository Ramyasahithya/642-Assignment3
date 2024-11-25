/*
  Ramyasahithya Magani - G01425752
*/

/*
 This controller file manage HTTP requests for survey form data.
 It provides endpoints to create, update, retrieve and delete survey form data.
 */

package _5.hw.assignment3.surveyForm.controller;

import _5.hw.assignment3.surveyForm.model.studentSurveyData;
import _5.hw.assignment3.surveyForm.service.studentSurveyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/studentSurveyData")
public class studentSurveyController {
    private final studentSurveyService studentService;

    public studentSurveyController(studentSurveyService studentService) {
        super();
        this.studentService = studentService;
    }

    private static final Logger logger = LoggerFactory.getLogger(studentSurveyController.class);

    @PostMapping
    public ResponseEntity<studentSurveyData> saveStudentSurveyData(@RequestBody studentSurveyData studentSurvey) {
        logger.info("Received survey data: {}", studentSurvey.toString());
        return new ResponseEntity<studentSurveyData>(studentService.saveStudentSurveyData(studentSurvey), HttpStatus.CREATED);
    }

    @GetMapping
    public List<studentSurveyData> getAllStudentsSurveyData() {
        logger.info("Received a request for getting the student survey data from data");
        return studentService.getAllStudentsSurveyData();
    }

    @GetMapping("{id}")
    public ResponseEntity<studentSurveyData> getStudentSurveyDataById(@PathVariable("id") long studentId) {
        return new ResponseEntity<studentSurveyData>(studentService.getStudentSurveyDataById(studentId), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateStudentSurveyDataById(@RequestBody studentSurveyData studentSurvey, @PathVariable("id") long studentId) {
        logger.info("Updating survey data for the survey id:{} and update request is: {}", studentId,studentSurvey.toString());
        return studentService.updateStudentSurveyDataById(studentSurvey, studentId);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudentSurveyData(@PathVariable("id") long studentId) {
        logger.info("Deleting survey data for the survey id:{} ", studentId);
        studentService.deleteStudentSurveyData(studentId);
        return new ResponseEntity<String>("Student Survey Form data has been deleted successfully",HttpStatus.OK);
    }
}
