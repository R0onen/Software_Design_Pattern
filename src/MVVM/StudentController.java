package MVVM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentViewModel studentViewModel;

    @GetMapping("/")
    public String viewAllStudents(Model model) {
        model.addAttribute("students", studentViewModel.getAllStudents());
        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@RequestParam String name, @RequestParam int age, @RequestParam String course) {
        studentViewModel.addStudent(new Student(name, age, course));
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        Student student = studentViewModel.getStudentById(id);
        model.addAttribute("student", student);
        return "edit";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable Long id, @RequestParam String name, @RequestParam int age, @RequestParam String course) {
        studentViewModel.updateStudent(id, new Student(name, age, course));
        return "redirect:/";
    }
}

