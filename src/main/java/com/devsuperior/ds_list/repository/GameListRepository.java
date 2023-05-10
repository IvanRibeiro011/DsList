package com.devsuperior.ds_list.repository;

import com.devsuperior.ds_list.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList,Long> {
}
