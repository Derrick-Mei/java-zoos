package com.lambdaschool.javazoos.repository;

import com.lambdaschool.javazoos.model.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Zoorepository extends JpaRepository<Zoo, Long>
{
}
