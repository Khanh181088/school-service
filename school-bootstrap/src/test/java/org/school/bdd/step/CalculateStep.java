package org.school.bdd.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.school.bdd.vo.SpringDataContainer;
import org.school.service.StudentApplicationService;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateStep {


    @Autowired
    SpringDataContainer dataContainer;


    @Autowired
    StudentApplicationService service;


    @Given("A student with point math and physics and chemistry is {double},{double},{double}")
    public void aStudentWithPointMathAndPhysicsAndChemistryIs(double math, double physics, double chemistry) {
        dataContainer.student = service.getById(1L);
        assertThat(dataContainer.student.getMath()).isEqualTo(math);
        assertThat(dataContainer.student.getPhysics()).isEqualTo(physics);
        assertThat(dataContainer.student.getChemistry()).isEqualTo(chemistry);
    }

    @When("calculate the average point")
    public void calculateTheAveragePoint() {
        dataContainer.averagePoint = dataContainer.student.calcAvgPoint();
    }

    @Then("the average point is {double}")
    public void theAveragePointIs(double actualAveragePoint) {
        assertThat(dataContainer.averagePoint).isEqualTo(actualAveragePoint);
    }
}
