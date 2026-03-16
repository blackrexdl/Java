package com.example.demo.controller;

import com.example.demo.model.Feedback;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/submit")
    public String submitFeedback(@ModelAttribute Feedback feedback, Model model) {
        model.addAttribute("feedback", feedback);
        return "result";
    }
}