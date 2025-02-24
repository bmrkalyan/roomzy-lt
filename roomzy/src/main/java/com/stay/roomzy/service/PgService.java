package com.stay.roomzy.service;

import com.stay.roomzy.dto.Member;
import com.stay.roomzy.repository.PgRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PgService {

    @Autowired
    public PgRepo repo;


    public String addMember(List<Member> mem) {
        repo.saveAll(mem);
        return "success";
    }

    public List<Member> getAllMembers() {
        return repo.findAll();
    }

    public Optional<Member> getMember(Long id) {
        return repo.findById(id);

    }

    public String deleteMember(Long id) {
        repo.deleteById(id);
        return "deleted successfully";

    }
}
