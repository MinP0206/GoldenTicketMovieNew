package com.example.goldenticketnew.controller;


import com.example.goldenticketnew.dtos.BranchDto;
import com.example.goldenticketnew.service.branch.IBranchService;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/api/branches", produces = "application/json")
@Tag(name = "Branch Controller", description = "Thao tác với auth")
public class BranchController {
    @Autowired
    private IBranchService branchService;

    @GetMapping
    private ResponseEntity<List<BranchDto>> getBranchesThatShowTheMovie(@RequestParam Integer movieId){
        return new ResponseEntity<>(branchService.getBranchesThatShowTheMovie(movieId), HttpStatus.OK);
    }
}
