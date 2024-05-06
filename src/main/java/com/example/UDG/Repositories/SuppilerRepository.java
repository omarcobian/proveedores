package com.example.UDG.Repositories;

import com.example.UDG.Models.SuppilerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface SuppilerRepository extends CrudRepository<SuppilerModel, Long> {

    public abstract ArrayList<SuppilerModel>findByName(String name);
    public abstract Optional<SuppilerModel> findById(long id);
    public abstract ArrayList<SuppilerModel> findBySpecialty(String specialty);
}
