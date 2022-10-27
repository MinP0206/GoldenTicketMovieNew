package com.example.goldenticketnew.service.branch;



import com.example.goldenticketnew.dtos.BranchDto;

import java.util.List;

public interface IBranchService {
    List<BranchDto> getBranchesThatShowTheMovie(Integer movieId);
}
