package com.l2.avaliacao_l2_atvd_2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "class_schedule")
public class ClassScheduleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private ClassModel classEntity;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private RoomModel room;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClassModel getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(ClassModel classEntity) {
        this.classEntity = classEntity;
    }

    public RoomModel getRoom() {
        return room;
    }

    public void setRoom(RoomModel room) {
        this.room = room;
    }
}
