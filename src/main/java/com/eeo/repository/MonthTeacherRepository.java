package com.eeo.repository;

import com.eeo.entity.AllDayRooms;
import com.eeo.entity.MonthStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MonthStudentRepository extends JpaRepository<MonthStudents,Integer> {
}
