package com.example.UDG.Services;

import com.example.UDG.Models.SuppilerModel;
import com.example.UDG.Repositories.SuppilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SuppilerService {
    @Autowired
    SuppilerRepository suppilerRepository;

    //Obtener todos los provedores registrados
    public ArrayList<SuppilerModel> findAllSuppiler(){
        return (ArrayList<SuppilerModel>) suppilerRepository.findAll();
    }

    //Guardar un proveedor
    public SuppilerModel saveSuppiler(SuppilerModel supplier) {
        return suppilerRepository.save(supplier);
    }
    //editar
    public SuppilerModel editById(SuppilerModel suppiler){
        return suppilerRepository.save(suppiler);
    }
    //buscar por nombre
    public ArrayList<SuppilerModel> findByName(String name){
        return suppilerRepository.findByName(name);
    }
    //buscar por id
    public Optional<SuppilerModel> findById(long id){
        return suppilerRepository.findById(id);
    }
    //BUscar por especialidad
    public ArrayList<SuppilerModel> findBySpecialty(String specialty){
        return suppilerRepository.findBySpecialty(specialty);
    }
    //eliminar por id
    public String deleteSuppiler(long id){
        Optional<SuppilerModel> respuesta =suppilerRepository.findById(id);

        if (respuesta.isPresent()) {
            suppilerRepository.deleteById(id);
            return"proveedor eliminado";
        } else {
            return"no se encontro un proveedor con ese id";
        }
    }
}
