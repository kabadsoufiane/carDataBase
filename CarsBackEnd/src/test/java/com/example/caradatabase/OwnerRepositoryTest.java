package com.example.caradatabase;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.caradatabase.domain.Owner;
import com.example.caradatabase.domain.OwnerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class OwnerRepositoryTest {

    @Autowired
    OwnerRepository ownerRepository;

    @Test
    void saveOwner(){
        ownerRepository.save(new Owner("Lucy", "Smith"));
        assertThat(ownerRepository.findByFirstname
                ("Lucy").isPresent())
                .isTrue();
    }

    @Test
    void deleteOwners() {
        ownerRepository.save(new Owner("Lisa", "Morrison"));
        ownerRepository.deleteAll();
        assertThat(ownerRepository.count()).isEqualTo(0);
    }
}
