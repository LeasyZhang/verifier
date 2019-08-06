package com.archiver.verifier.repo;

import com.archiver.verifier.entity.RcItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RcItemRepository extends JpaRepository<RcItem, Long> {

    List<RcItem> findAllByOwnerId(long ownerId);

}
