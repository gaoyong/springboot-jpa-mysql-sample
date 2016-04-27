package edu.tsinghua.ioe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.tsinghua.ioe.model.Statics;


/**
 * SpringDataJpa的一个配置实例，api项目暂时不需要调用此dao
 * @author gaoyong
 *
 */
public interface StaticsRepository extends JpaRepository<Statics, Long>{

}
