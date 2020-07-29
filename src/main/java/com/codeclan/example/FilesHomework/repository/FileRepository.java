package com.codeclan.example.FilesHomework.repository;

import com.codeclan.example.FilesHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
