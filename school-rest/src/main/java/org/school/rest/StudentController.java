package org.school.rest;

import lombok.AllArgsConstructor;
import org.school.dto.StudentCriteriaDTO;
import org.school.dto.StudentDTO;

import org.school.mapper.StudentCriteriaMapper;
import org.school.mapper.StudentDTOMapper;
import org.school.service.StudentApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private StudentApplicationService studentApplicationService;
    private StudentDTOMapper mapper;
    private StudentCriteriaMapper studentCriteriaMapper;

    @GetMapping
    public List<StudentDTO> getAll() {
        return mapper.map(studentApplicationService.findAll());
    }

    @GetMapping("/{id}")
    public StudentDTO getById(@PathVariable("id") Long id) {
        return mapper.map(studentApplicationService.getById(id));
    }

    @PostMapping("/search")
    public List<StudentDTO> search(@RequestBody StudentCriteriaDTO studentCriteria) {
        return mapper.map(studentApplicationService.search(studentCriteriaMapper.map(studentCriteria)));
    }

}
