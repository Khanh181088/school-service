package org.school.it;

import org.junit.jupiter.api.Test;
import org.school.SchoolApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(classes = {SchoolApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class StudentControllerTestIT {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getById_should_get_student_with_latest_price() throws Exception {
        // Then
        mockMvc.perform(request(GET, "/rest/api/v1/students/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Student 1"))
        ;

    }

}