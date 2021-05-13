package bootcamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.hrms.business.abstracts.*;
import bootcamp.hrms.dataAccess.abstracts.JobTitlesDao;
import bootcamp.hrms.entities.concretes.JobTitles;

@Service
public class JobTitlesManager implements JobTitlesService {
	
	private JobTitlesDao jobTitlesDao;
	
	// constructor injection.
	@Autowired
	public JobTitlesManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}



	@Override
	public List<JobTitles> getAll() {
		// TODO Auto-generated method stub
		return this.jobTitlesDao.findAll();
	}
	
	

}
