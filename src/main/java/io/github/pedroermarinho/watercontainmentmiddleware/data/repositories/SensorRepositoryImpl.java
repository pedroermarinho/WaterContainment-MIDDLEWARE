package io.github.pedroermarinho.watercontainmentmiddleware.data.repositories;


import io.github.pedroermarinho.watercontainmentmiddleware.data.datasources.SensorDataSource;
import io.github.pedroermarinho.watercontainmentmiddleware.domain.dto.NewSensorDTO;
import io.github.pedroermarinho.watercontainmentmiddleware.domain.entities.SensorEntity;
import io.github.pedroermarinho.watercontainmentmiddleware.domain.repositories.SensorRepository;
import org.springframework.stereotype.Component;

@Component
public class SensorRepositoryImpl implements SensorRepository {

    private final SensorDataSource sensorDataSource;

    public SensorRepositoryImpl(SensorDataSource sensorDataSource) {
        this.sensorDataSource = sensorDataSource;
    }

    @Override
    public SensorEntity save(NewSensorDTO newSensorDTO) {
        return sensorDataSource.save(newSensorDTO.toEntity());
    }

}
