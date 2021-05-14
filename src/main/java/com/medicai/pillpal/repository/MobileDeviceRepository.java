package com.medicai.pillpal.repository;

import com.medicai.pillpal.domain.MobileDevice;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the MobileDevice entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MobileDeviceRepository extends JpaRepository<MobileDevice, Long> {}
