package com.Crudexample.crud.repository;

import com.Crudexample.crud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByIdadeGreaterThan(int idadeMaior);

}

