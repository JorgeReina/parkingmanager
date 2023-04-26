package com.rociojorge.parkingmanagerDemo.user.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de los datos del usuraio
 * @author Jorge Reina Romero
 * @author Rocio Gonfaus Luengo
 * @since 12.04.2022
 * @version v0.1
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {

  public User findByEmail(String email);
    
}
