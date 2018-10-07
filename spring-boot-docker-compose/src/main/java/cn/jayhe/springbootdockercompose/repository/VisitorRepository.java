package cn.jayhe.springbootdockercompose.repository;

import cn.jayhe.springbootdockercompose.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {

    Visitor findByIp(String ip);
}
