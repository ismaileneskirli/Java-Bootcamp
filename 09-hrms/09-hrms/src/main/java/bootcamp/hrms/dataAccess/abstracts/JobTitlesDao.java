package bootcamp.hrms.dataAccess.abstracts;

import bootcamp.hrms.entities.concretes.*;

import org.springframework.data.jpa.repository.JpaRepository;

// Crud operations 
public interface JobTitlesDao extends JpaRepository<JobTitles, Integer> {

}
