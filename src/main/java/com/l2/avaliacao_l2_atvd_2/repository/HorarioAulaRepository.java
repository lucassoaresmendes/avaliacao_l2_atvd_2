package com.l2.avaliacao_l2_atvd_2.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.l2.avaliacao_l2_atvd_2.model.ClassScheduleModel;

@Repository
public interface HorarioAulaRepository extends JpaRepository<ClassScheduleModel, Long> {

    @Query(value = """
            SELECT p.id AS professorId,
                   ROUND(SUM(EXTRACT(EPOCH FROM (cs.end_time - cs.start_time)) / 3600), 2) AS total_hours
            FROM professor p
            JOIN subject s ON s.professor_id = p.id
            JOIN class c ON c.subject_id = s.id
            JOIN class_schedule cs ON cs.class_id = c.id
            GROUP BY p.id
            """, nativeQuery = true)
    List<Map<String, Object>> buscarHorasAulaPorProfessor();
}
