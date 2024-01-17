package com.carloser7.mybus.repository;

import com.carloser7.mybus.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinhaRepository extends JpaRepository<Route, String> {

    List<Route> findByNumeroStartingWith(String numero);

}
