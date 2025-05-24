package com.l2.avaliacao_l2_atvd_2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.l2.avaliacao_l2_atvd_2.service.HorarioService;

@RestController
@RequestMapping("/api/horarios")
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> obterRelatorioHorarios() {
        Map<String, Object> resultado = new HashMap<>();

        List<Map<String, Object>> horasPorProfessor = horarioService.getHorasAulasPorProfessor();
        List<Map<String, Object>> salasComStatus = horarioService.getSalasComStatusDeHorario();

        resultado.put("HorasTrabalhadasPorProfessor", horasPorProfessor);
        resultado.put("SalasOcupadas", salasComStatus);

        return ResponseEntity.ok(resultado);
    }
}
