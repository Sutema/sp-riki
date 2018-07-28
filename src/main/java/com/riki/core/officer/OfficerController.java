package com.riki.core.officer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/officer")
public class OfficerController {
    @Autowired
    private OfficerServiceImpl officerService;

    @GetMapping
    public List<Officer> index(){
        return officerService.findAll();
    }

    @GetMapping
    public Officer findById(@PathVariable("id")UUID id){
        return officerService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Officer officer){
        officerService.save(officer);
    }
}
