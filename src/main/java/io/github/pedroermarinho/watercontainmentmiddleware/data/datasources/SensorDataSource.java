package io.github.pedroermarinho.watercontainmentmiddleware.data.datasources;


import io.github.pedroermarinho.watercontainmentmiddleware.domain.entities.SensorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataSource extends JpaRepository<SensorEntity, Long> {
}
