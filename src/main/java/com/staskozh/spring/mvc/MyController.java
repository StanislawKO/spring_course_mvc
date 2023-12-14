package com.staskozh.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {

        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {

//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Petrov");
//        emp.setSalary(700);

        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {

        String name = emp.getName();
        emp.setName("Mr. " + name);

        return "show-emp-details-view";
    }

    //************************************
//    @RequestMapping("/")
//    public String showFirstView() {
//        return "first-view";
//    }
//
//    @RequestMapping("/askDetails")
//    public String askEmpDetails() {
//        return "ask-emp-details-view";
//    }
//
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }

    //****************************************
//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", " - employee");
//
//        return "show-emp-details-view";
//    }


}
