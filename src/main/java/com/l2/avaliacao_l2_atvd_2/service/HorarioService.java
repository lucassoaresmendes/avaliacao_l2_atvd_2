package com.l2.avaliacao_l2_atvd_2.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.l2.avaliacao_l2_atvd_2.repository.HorarioAulaRepository;
import com.l2.avaliacao_l2_atvd_2.repository.SalaRepository;

@Service
public class HorarioService {
    @Autowired
    private HorarioAulaRepository horarioAulaRepository;

    @Autowired
    private SalaRepository salaRepository;

    public List<Map<String, Object>> getHorasAulasPorProfessor() {
        return horarioAulaRepository.buscarHorasAulaPorProfessor();
    }

    public List<Map<String, Object>> getSalasComStatusDeHorario() {
        return salaRepository.buscarHorariosDasSalasComStatus();
    }
}
