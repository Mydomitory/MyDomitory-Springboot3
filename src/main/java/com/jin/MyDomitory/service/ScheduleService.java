package com.jin.MyDomitory.service;

import com.jin.MyDomitory.domain.Schedule;
import com.jin.MyDomitory.dto.schedule.AddScheduleRequest;
import com.jin.MyDomitory.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    @Autowired
    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public Schedule addSchedule(AddScheduleRequest dto){
        return scheduleRepository.save(dto.toEntity());
    }
}