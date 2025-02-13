package edu.sparta.project.oms.store.domain.repository;

import edu.sparta.project.oms.store.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
