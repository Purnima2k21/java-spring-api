package com.launchacademy.marathon.repositories;

import com.launchacademy.marathon.models.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface SongRepository extends PagingAndSortingRepository <Song, Integer> {


}
