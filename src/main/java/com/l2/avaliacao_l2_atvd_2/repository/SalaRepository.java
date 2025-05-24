package com.l2.avaliacao_l2_atvd_2.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.l2.avaliacao_l2_atvd_2.model.RoomModel;

@Repository
public interface SalaRepository extends JpaRepository<RoomModel, Long> {

    @Query(value = """
            SELECT r.id AS roomId,
                   cs.day_of_week,
                   cs.start_time,
                   cs.end_time,
                   CASE
                       WHEN cs.id IS NULL THEN 'LIVRE'
                       ELSE 'OCUPADA'
                   END AS status
            FROM room r
            LEFT JOIN class_schedule cs ON cs.room_id = r.id
            ORDER BY r.id, cs.day_of_week NULLS FIRST, cs.start_time NULLS FIRST
            """, nativeQuery = true)
    List<Map<String, Object>> buscarHorariosDasSalasComStatus();
}
