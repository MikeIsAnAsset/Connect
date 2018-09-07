package com.claim.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Job implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jobId;
	

	@Column(name="Company_profile", columnDefinition = "LONGBLOB")
	private CompanyProfile companyProfile = new CompanyProfile();

	@Column
	private Address location;
	
	@Column
	private String jobTitle;
	
	// Employee, Contract, Intern, Seasonal
	@Column
	private String jobType;
	
	@Column
	private String jobCategory;
	
	// Maybe this is job category
	@Column
	private String typeOfRole;
	
	@Column
	private String jobLevel;
	
	@Column
	private String description;
	
	@Column
	private String growthOpportunity;
	
	// In case this is different from companyProfile
	@Column
	private PerksBenefits jobPerksBenefits;
	
	// Job Status - Full Time, Part Time, Per Diem, Contractor, Temporary
	@Column
	private String employmentType;
	
	@Column(columnDefinition = "LONGBLOB")
	private Skills skills;
	
	@Column
	private ArrayList<String> selectedSkills;
	
	@Column
	private String requiredExperience;
	
	@Column
	private Long compensation;
	
	@Column
	private Long compensationMin;
	
	@Column
	private Long compensationMax;
	
	@Column
	private String compensationDescription;
	
	// Per hour, day, week, biweekly, month, year
	@Column
	private String compensationFrequency;
	
	@Column
	private Long bonus;

	
	@Column
	private String equity;
	
	@Column
	private TreeSet<User> jobVisitors;
	
	// Active, Closed, Archived, etc.
	@Column
	private String jobStatus;
	
	@Column
	private String closeDate;
	
	@Column
	private String postDate;
	
	@Column
	private User jobCreater;
	
	@Column
	private int applyClicks;
	
	@Column
	private String travelRequirement;
	
	
	private static ArrayList<Job> jobs = new ArrayList<>();

	public Job() {
		super();
	}
	
	
	
	
	public Job(Skills skills) {
		super();
		this.skills = skills;
	}

	
	
	
	public Job(String typeOfRole, String jobLevel, String description, String employmentType, Skills skills,
			String requiredExperience, Long compensation, String compensationDescription, String equity) {
		super();
		this.typeOfRole = typeOfRole;
		this.jobLevel = jobLevel;
		this.description = description;
		this.employmentType = employmentType;
		this.skills = skills;
		this.requiredExperience = requiredExperience;
		this.compensation = compensation;
		this.compensationDescription = compensationDescription;
		this.equity = equity;
	}



	public static void addToJobs(Job job) {
		jobs.add(job);
	}
	
	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	@OneToOne(mappedBy = "PerksBenefits", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	public PerksBenefits getJobPerksBenefits() {
		return jobPerksBenefits;
	}




	public void setJobPerksBenefits(PerksBenefits jobPerksBenefits) {
		this.jobPerksBenefits = jobPerksBenefits;
	}




	
	
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="Company_profile_id")
	public CompanyProfile getCompanyProfile() {
		return companyProfile;
	}
	
	
	
	public void setCompanyProfile(CompanyProfile companyProfile) {
		this.companyProfile = companyProfile;
	}




	public String getTypeOfRole() {
		return typeOfRole;
	}

	public void setTypeOfRole(String typeOfRole) {
		this.typeOfRole = typeOfRole;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmployementType() {
		return employmentType;
	}

	public void setEmployementType(String employementType) {
		this.employmentType = employementType;
	}

	
	
	
	
	
	
	
	
	public String getJobTitle() {
		return jobTitle;
	}




	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}




	@OneToOne(mappedBy = "Skills", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "skillsId")
	public Skills getSkills() {
		return skills;
	}


	
	
	
	
	
	
	
	
	
	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	
	
	public ArrayList<String> getSelectedSkills() {
		return selectedSkills;
	}




	public void setSelectedSkills(ArrayList<String> selectedSkills) {
		this.selectedSkills = selectedSkills;
	}




	public String getRequiredExperience() {
		return requiredExperience;
	}

	public void setRequiredExperience(String requiredExperience) {
		this.requiredExperience = requiredExperience;
	}

	public Long getCompensation() {
		return compensation;
	}

	public void setCompensation(Long compensation) {
		this.compensation = compensation;
	}

	public String getCompensationDescription() {
		return compensationDescription;
	}

	public void setCompensationDescription(String compensationDescription) {
		this.compensationDescription = compensationDescription;
	}

	public String getEquity() {
		return equity;
	}

	public void setEquity(String equity) {
		this.equity = equity;
	}
	
	public static ArrayList<Job> getJobs() {
		return jobs;
	}




	public Address getLocation() {
		return location;
	}




	public void setLocation(Address location) {
		this.location = location;
	}




	public String getJobType() {
		return jobType;
	}




	public void setJobType(String jobType) {
		this.jobType = jobType;
	}




	public String getJobCategory() {
		return jobCategory;
	}




	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}




	public String getGrowthOpportunity() {
		return growthOpportunity;
	}




	public void setGrowthOpportunity(String growthOpportunity) {
		this.growthOpportunity = growthOpportunity;
	}




	public String getEmploymentType() {
		return employmentType;
	}




	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}




	public Long getCompensationMin() {
		return compensationMin;
	}




	public void setCompensationMin(Long compensationMin) {
		this.compensationMin = compensationMin;
	}




	public Long getCompensationMax() {
		return compensationMax;
	}




	public void setCompensationMax(Long compensationMax) {
		this.compensationMax = compensationMax;
	}




	public String getCompensationFrequency() {
		return compensationFrequency;
	}




	public void setCompensationFrequency(String compensationFrequency) {
		this.compensationFrequency = compensationFrequency;
	}




	public Long getBonus() {
		return bonus;
	}




	public void setBonus(Long bonus) {
		this.bonus = bonus;
	}




	public TreeSet<User> getJobVisitors() {
		return jobVisitors;
	}




	public void setJobVisitors(TreeSet<User> jobVisitors) {
		this.jobVisitors = jobVisitors;
	}




	public String getJobStatus() {
		return jobStatus;
	}




	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}




	public String getCloseDate() {
		return closeDate;
	}




	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}




	public String getPostDate() {
		return postDate;
	}




	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}




	public User getJobCreater() {
		return jobCreater;
	}




	public void setJobCreater(User jobCreater) {
		this.jobCreater = jobCreater;
	}




	public int getApplyClicks() {
		return applyClicks;
	}




	public void setApplyClicks(int applyClicks) {
		this.applyClicks = applyClicks;
	}




	public String getTravelRequirement() {
		return travelRequirement;
	}




	public void setTravelRequirement(String travelRequirement) {
		this.travelRequirement = travelRequirement;
	}




	public static void setJobs(ArrayList<Job> jobs) {
		Job.jobs = jobs;
	}




	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", companyProfile=" + companyProfile + ", location=" + location + ", jobTitle="
				+ jobTitle + ", jobType=" + jobType + ", jobCategory=" + jobCategory + ", typeOfRole=" + typeOfRole
				+ ", jobLevel=" + jobLevel + ", description=" + description + ", growthOpportunity=" + growthOpportunity
				+ ", jobPerksBenefits=" + jobPerksBenefits + ", employmentType=" + employmentType + ", skills=" + skills
				+ ", requiredExperience=" + requiredExperience + ", compensation=" + compensation + ", compensationMin="
				+ compensationMin + ", compensationMax=" + compensationMax + ", compensationDescription="
				+ compensationDescription + ", compensationFrequency=" + compensationFrequency + ", bonus=" + bonus
				+ ", equity=" + equity + ", jobVisitors=" + jobVisitors + ", jobStatus=" + jobStatus + ", closeDate="
				+ closeDate + ", postDate=" + postDate + ", jobCreater=" + jobCreater + ", applyClicks=" + applyClicks
				+ ", travelRequirement=" + travelRequirement + "]";
	}

	
	
}
