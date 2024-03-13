package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
