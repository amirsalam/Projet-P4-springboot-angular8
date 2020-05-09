package Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import Entity.User;



public interface DaoUserI extends JpaRepository<User, Long> {

}
