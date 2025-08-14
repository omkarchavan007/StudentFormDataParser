package com.HTMLForm.controller;

import com.HTMLForm.entity.Students;
import com.HTMLForm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/submitForm")
    public RedirectView submitFrom (@RequestParam String firstName,
                                    @RequestParam String lastName,
                                    @RequestParam String email,
                                    @RequestParam String course,
                                    @RequestParam String city,
                                    @RequestParam String gender,
                                    @RequestParam String branch,
                                    @RequestParam int passoutYear)
    {
        Students students = new Students();

        students.setFirstName(firstName);
        students.setLastName(lastName);
        students.setCity(city);
        students.setEmail(email);
        students.setCourse(course);
        students.setGender(gender);
        students.setBranch(branch);
        students.setPassoutYear(passoutYear);

        studentRepository.save(students);
        return new RedirectView("/success");
    }
    @GetMapping("/success")
    @ResponseBody
    public String successPage() {
        return "Student saved successfully!";
    }
}
