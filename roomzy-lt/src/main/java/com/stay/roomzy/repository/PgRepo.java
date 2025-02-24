package com.stay.roomzy.repository;

import com.stay.roomzy.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PgRepo extends JpaRepository<Member,Long> {

}
