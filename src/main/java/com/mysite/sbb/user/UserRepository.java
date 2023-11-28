package com.mysite.sbb.user;

//User 리포지터리
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <SiteUser,Long> {


}
