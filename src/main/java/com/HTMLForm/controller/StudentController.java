package com.HTMLForm.controller;

import com.HTMLForm.entity.Students;
import com.HTMLForm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/submitForm")
    public RedirectView submitFrom (@RequestParam String FirstName,
                                    @RequestParam String LastName,
                                    @RequestParam String Email,
                                    @RequestParam String Course,
                                    @RequestParam String City,
                                    @RequestParam String Gender,
                                    @RequestParam String Branch,
                                    @RequestParam int PassoutYear)
    {
        Students students = new Students();

        students.setFirstName(FirstName);
        students.setLastName(LastName);
        students.setCity(City);
        students.setEmail(Email);
        students.setCourse(Course);
        students.setGender(Gender);
        students.setBranch(Branch);
        students.setPassoutYear(PassoutYear);

        studentRepository.save(students);
        return new RedirectView("/success");
    }


}
