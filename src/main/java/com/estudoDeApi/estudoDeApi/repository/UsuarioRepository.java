package com.estudoDeApi.estudoDeApi.repository;

import com.estudoDeApi.estudoDeApi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, int> {
}
