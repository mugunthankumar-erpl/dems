package com.erplogic.dems.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface RepositoryCommon<T, K> extends JpaRepository<T, K>, JpaSpecificationExecutor<T> {

}
