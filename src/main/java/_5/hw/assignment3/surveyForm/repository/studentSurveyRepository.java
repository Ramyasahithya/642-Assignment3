/*
  Ramyasahithya Magani - G01425752
  Saichinmayee Yanamadala-G01459318
  Sreshta Kosaraju - G01460468
*/

/*
This interface helps the repository for managing student survey form data
by extending JpaRepository to provide CRUD operations for the surveyData table.
*/

package _5.hw.assignment3.surveyForm.repository;

import _5.hw.assignment3.surveyForm.model.studentSurveyData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentSurveyRepository extends JpaRepository<studentSurveyData,Long> {
}
