package com.stay.roomzy.controller;
import com.stay.roomzy.dto.Member;
import com.stay.roomzy.service.PgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PgController {

    @Autowired
    public PgService service;

    @PostMapping("/member")
    public ResponseEntity<String> addMember(@RequestBody List<Member> mem){
         service.addMember(mem);
        return ResponseEntity.ok("success");
    }

    @GetMapping("/member/{id}")
    public ResponseEntity<Member> getMember(@PathVariable(name="id") Long mid){
        Optional<Member> m=service.getMember(mid);
        return ResponseEntity.ok(m.get());

    }

    @GetMapping("/member")
    public ResponseEntity<List<Member>> getMember(){
        List<Member> allmembers=service.getAllMembers();
        return ResponseEntity.ok(allmembers);

    }

    @DeleteMapping("/member/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable(name="id") Long mid){
        service.deleteMember(mid);
        return  ResponseEntity.ok("deleted successfully");

    }


}
