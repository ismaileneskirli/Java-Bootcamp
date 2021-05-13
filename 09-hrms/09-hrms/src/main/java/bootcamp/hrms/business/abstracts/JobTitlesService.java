package bootcamp.hrms.business.abstracts;

import java.util.List;

import bootcamp.hrms.entities.concretes.JobTitles;

public interface JobTitlesService {
	
	List<JobTitles> getAll();

}
