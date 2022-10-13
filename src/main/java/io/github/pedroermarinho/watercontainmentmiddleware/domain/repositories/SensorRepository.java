package io.github.pedroermarinho.watercontainmentmiddleware.domain.repositories;

import io.github.pedroermarinho.watercontainmentmiddleware.domain.dto.NewSensorDTO;
import io.github.pedroermarinho.watercontainmentmiddleware.domain.entities.SensorEntity;

public interface SensorRepository {
    SensorEntity save(NewSensorDTO newSensorDTO);
}
