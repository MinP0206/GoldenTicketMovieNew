package com.example.goldenticketnew.service.branch;


import com.example.goldenticketnew.dtos.BranchDto;
import com.example.goldenticketnew.repository.IBranchRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BranchService implements IBranchService {

    @Autowired
    private IBranchRepository IBranchRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<BranchDto> getBranchesThatShowTheMovie(Integer movieId) {
        return IBranchRepository.getBranchThatShowTheMovie(movieId)
                .stream().map(branch -> modelMapper.map(branch, BranchDto.class))
                .collect(Collectors.toList());
    }
}
