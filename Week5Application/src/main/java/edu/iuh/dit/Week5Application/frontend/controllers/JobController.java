package edu.iuh.dit.Week5Application.frontend.controllers;

import edu.iuh.dit.Week5Application.backend.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JobController {
    @Autowired
    private JobService jobService;
}
