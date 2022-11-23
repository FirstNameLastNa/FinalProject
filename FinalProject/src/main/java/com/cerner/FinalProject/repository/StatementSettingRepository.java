package com.cerner.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cerner.FinalProject.model.StatementSettingsRelationship;

@Repository
public interface StatementSettingRepository extends JpaRepository<StatementSettingsRelationship, Long>{

	long findStatementIdBySettingId(Long settingId);
}
