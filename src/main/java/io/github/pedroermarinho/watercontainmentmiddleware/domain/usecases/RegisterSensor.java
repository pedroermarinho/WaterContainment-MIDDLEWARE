package io.github.pedroermarinho.watercontainmentmiddleware.domain.usecases;

import io.github.pedroermarinho.watercontainmentmiddleware.domain.dto.NewSensorDTO;
import io.github.pedroermarinho.watercontainmentmiddleware.domain.entities.SensorEntity;
import io.github.pedroermarinho.watercontainmentmiddleware.domain.repositories.SensorRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterSensor {

    private final SensorRepository sensorRepository;

    public RegisterSensor(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public SensorEntity save(NewSensorDTO newSensorDTO) {
        return sensorRepository.save(newSensorDTO);
    }

}
