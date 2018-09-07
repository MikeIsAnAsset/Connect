package com.claim.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Skills implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int skillsId;
	
	private int jobId;
	
	private	boolean	dotNet = false;
	private	boolean	A_B_Testing = false;
	private	boolean	accountDevelopment = false;
	private	boolean	accountManagement = false;
	private	boolean	accountManagementOps = false;
	private	boolean	adCopy = false;
	private	boolean	administrativeSupport;
	private	boolean	adobeCreativeSuite;
	private	boolean	affiliateMarketing;
	private	boolean	agileProductDevelopment;
	private	boolean	agileProjectManagement;
	private	boolean	analyticalResearch;
	private	boolean	androidJava;
	private	boolean	angularJS;
	private	boolean	antitrustCompetition;
	private	boolean	audienceAnalytics;
	
	private	String	dotNetSkillLevel;
	private	String	A_B_TestingSkillLevel;
	private	String	accountDevelopmentSkillLevel;
	private	String	accountManagementSkillLevel;
	private	String	accountManagementOpsSkillLevel;
	private	String	adCopySkillLevel;
	private	String	administrativeSupportSkillLevel;
	private	String	adobeCreativeSuiteSkillLevel;
	private	String	affiliateMarketingSkillLevel;
	private	String	agileProductDevelopmentSkillLevel;
	private	String	agileProjectManagementSkillLevel;
	private	String	analyticalResearchSkillLevel;
	private	String	androidJavaSkillLevel;
	private	String	angularJSSkillLevel;
	private	String	antitrustCompetitionSkillLevel;
	private	String	audienceAnalyticsSkillLevel;
	
	
	
	public int getSkillsId() {
		return skillsId;
	}




	public void setSkillsId(int skillsId) {
		this.skillsId = skillsId;
	}



	@OneToOne(mappedBy = "jobId")
	public int getJobId() {
		return jobId;
	}




	public void setJobId(int jobId) {
		this.jobId = jobId;
	}




	public boolean isDotNet() {
		return dotNet;
	}




	public void setDotNet(boolean dotNet) {
		this.dotNet = dotNet;
	}




	public boolean isA_B_Testing() {
		return A_B_Testing;
	}




	public void setA_B_Testing(boolean a_B_Testing) {
		A_B_Testing = a_B_Testing;
	}




	public boolean isAccountDevelopment() {
		return accountDevelopment;
	}




	public void setAccountDevelopment(boolean accountDevelopment) {
		this.accountDevelopment = accountDevelopment;
	}




	public boolean isAccountManagement() {
		return accountManagement;
	}




	public void setAccountManagement(boolean accountManagement) {
		this.accountManagement = accountManagement;
	}




	public boolean isAccountManagementOps() {
		return accountManagementOps;
	}




	public void setAccountManagementOps(boolean accountManagementOps) {
		this.accountManagementOps = accountManagementOps;
	}




	public boolean isAdCopy() {
		return adCopy;
	}




	public void setAdCopy(boolean adCopy) {
		this.adCopy = adCopy;
	}




	public boolean isAdministrativeSupport() {
		return administrativeSupport;
	}




	public void setAdministrativeSupport(boolean administrativeSupport) {
		this.administrativeSupport = administrativeSupport;
	}




	public boolean isAdobeCreativeSuite() {
		return adobeCreativeSuite;
	}




	public void setAdobeCreativeSuite(boolean adobeCreativeSuite) {
		this.adobeCreativeSuite = adobeCreativeSuite;
	}




	public boolean isAffiliateMarketing() {
		return affiliateMarketing;
	}




	public void setAffiliateMarketing(boolean affiliateMarketing) {
		this.affiliateMarketing = affiliateMarketing;
	}




	public boolean isAgileProductDevelopment() {
		return agileProductDevelopment;
	}




	public void setAgileProductDevelopment(boolean agileProductDevelopment) {
		this.agileProductDevelopment = agileProductDevelopment;
	}




	public boolean isAgileProjectManagement() {
		return agileProjectManagement;
	}




	public void setAgileProjectManagement(boolean agileProjectManagement) {
		this.agileProjectManagement = agileProjectManagement;
	}




	public boolean isAnalyticalResearch() {
		return analyticalResearch;
	}




	public void setAnalyticalResearch(boolean analyticalResearch) {
		this.analyticalResearch = analyticalResearch;
	}




	public boolean isAndroidJava() {
		return androidJava;
	}




	public void setAndroidJava(boolean androidJava) {
		this.androidJava = androidJava;
	}




	public boolean isAngularJS() {
		return angularJS;
	}




	public void setAngularJS(boolean angularJS) {
		this.angularJS = angularJS;
	}




	public boolean isAntitrustCompetition() {
		return antitrustCompetition;
	}




	public void setAntitrustCompetition(boolean antitrustCompetition) {
		this.antitrustCompetition = antitrustCompetition;
	}




	public boolean isAudienceAnalytics() {
		return audienceAnalytics;
	}




	public void setAudienceAnalytics(boolean audienceAnalytics) {
		this.audienceAnalytics = audienceAnalytics;
	}



	public String getDotNetSkillLevel() {
		return dotNetSkillLevel;
	}




	public void setDotNetSkillLevel(String dotNetSkillLevel) {
		this.dotNetSkillLevel = dotNetSkillLevel;
	}




	public String getA_B_TestingSkillLevel() {
		return A_B_TestingSkillLevel;
	}




	public void setA_B_TestingSkillLevel(String a_B_TestingSkillLevel) {
		A_B_TestingSkillLevel = a_B_TestingSkillLevel;
	}




	public String getAccountDevelopmentSkillLevel() {
		return accountDevelopmentSkillLevel;
	}




	public void setAccountDevelopmentSkillLevel(String accountDevelopmentSkillLevel) {
		this.accountDevelopmentSkillLevel = accountDevelopmentSkillLevel;
	}




	public String getAccountManagementSkillLevel() {
		return accountManagementSkillLevel;
	}




	public void setAccountManagementSkillLevel(String accountManagementSkillLevel) {
		this.accountManagementSkillLevel = accountManagementSkillLevel;
	}




	public String getAccountManagementOpsSkillLevel() {
		return accountManagementOpsSkillLevel;
	}




	public void setAccountManagementOpsSkillLevel(String accountManagementOpsSkillLevel) {
		this.accountManagementOpsSkillLevel = accountManagementOpsSkillLevel;
	}




	public String getAdCopySkillLevel() {
		return adCopySkillLevel;
	}




	public void setAdCopySkillLevel(String adCopySkillLevel) {
		this.adCopySkillLevel = adCopySkillLevel;
	}




	public String getAdministrativeSupportSkillLevel() {
		return administrativeSupportSkillLevel;
	}




	public void setAdministrativeSupportSkillLevel(String administrativeSupportSkillLevel) {
		this.administrativeSupportSkillLevel = administrativeSupportSkillLevel;
	}




	public String getAdobeCreativeSuiteSkillLevel() {
		return adobeCreativeSuiteSkillLevel;
	}




	public void setAdobeCreativeSuiteSkillLevel(String adobeCreativeSuiteSkillLevel) {
		this.adobeCreativeSuiteSkillLevel = adobeCreativeSuiteSkillLevel;
	}




	public String getAffiliateMarketingSkillLevel() {
		return affiliateMarketingSkillLevel;
	}




	public void setAffiliateMarketingSkillLevel(String affiliateMarketingSkillLevel) {
		this.affiliateMarketingSkillLevel = affiliateMarketingSkillLevel;
	}




	public String getAgileProductDevelopmentSkillLevel() {
		return agileProductDevelopmentSkillLevel;
	}




	public void setAgileProductDevelopmentSkillLevel(String agileProductDevelopmentSkillLevel) {
		this.agileProductDevelopmentSkillLevel = agileProductDevelopmentSkillLevel;
	}




	public String getAgileProjectManagementSkillLevel() {
		return agileProjectManagementSkillLevel;
	}




	public void setAgileProjectManagementSkillLevel(String agileProjectManagementSkillLevel) {
		this.agileProjectManagementSkillLevel = agileProjectManagementSkillLevel;
	}




	public String getAnalyticalResearchSkillLevel() {
		return analyticalResearchSkillLevel;
	}




	public void setAnalyticalResearchSkillLevel(String analyticalResearchSkillLevel) {
		this.analyticalResearchSkillLevel = analyticalResearchSkillLevel;
	}




	public String getAndroidJavaSkillLevel() {
		return androidJavaSkillLevel;
	}




	public void setAndroidJavaSkillLevel(String androidJavaSkillLevel) {
		this.androidJavaSkillLevel = androidJavaSkillLevel;
	}




	public String getAngularJSSkillLevel() {
		return angularJSSkillLevel;
	}




	public void setAngularJSSkillLevel(String angularJSSkillLevel) {
		this.angularJSSkillLevel = angularJSSkillLevel;
	}




	public String getAntitrustCompetitionSkillLevel() {
		return antitrustCompetitionSkillLevel;
	}




	public void setAntitrustCompetitionSkillLevel(String antitrustCompetitionSkillLevel) {
		this.antitrustCompetitionSkillLevel = antitrustCompetitionSkillLevel;
	}




	public String getAudienceAnalyticsSkillLevel() {
		return audienceAnalyticsSkillLevel;
	}




	public void setAudienceAnalyticsSkillLevel(String audienceAnalyticsSkillLevel) {
		this.audienceAnalyticsSkillLevel = audienceAnalyticsSkillLevel;
	}




	@Override
	public String toString() {
		return "Skills [skillsId=" + skillsId + ", dotNet=" + dotNet + ", A_B_Testing=" + A_B_Testing
				+ ", accountDevelopment=" + accountDevelopment + ", accountManagement=" + accountManagement
				+ ", accountManagementOps=" + accountManagementOps + ", adCopy=" + adCopy + ", administrativeSupport="
				+ administrativeSupport + ", adobeCreativeSuite=" + adobeCreativeSuite + ", affiliateMarketing="
				+ affiliateMarketing + ", agileProductDevelopment=" + agileProductDevelopment
				+ ", agileProjectManagement=" + agileProjectManagement + ", analyticalResearch=" + analyticalResearch
				+ ", androidJava=" + androidJava + ", angularJS=" + angularJS + ", antitrustCompetition="
				+ antitrustCompetition + ", audienceAnalytics=" + audienceAnalytics + ", dotNetSkillLevel="
				+ dotNetSkillLevel + ", A_B_TestingSkillLevel=" + A_B_TestingSkillLevel
				+ ", accountDevelopmentSkillLevel=" + accountDevelopmentSkillLevel + ", accountManagementSkillLevel="
				+ accountManagementSkillLevel + ", accountManagementOpsSkillLevel=" + accountManagementOpsSkillLevel
				+ ", adCopySkillLevel=" + adCopySkillLevel + ", administrativeSupportSkillLevel="
				+ administrativeSupportSkillLevel + ", adobeCreativeSuiteSkillLevel=" + adobeCreativeSuiteSkillLevel
				+ ", affiliateMarketingSkillLevel=" + affiliateMarketingSkillLevel
				+ ", agileProductDevelopmentSkillLevel=" + agileProductDevelopmentSkillLevel
				+ ", agileProjectManagementSkillLevel=" + agileProjectManagementSkillLevel
				+ ", analyticalResearchSkillLevel=" + analyticalResearchSkillLevel + ", androidJavaSkillLevel="
				+ androidJavaSkillLevel + ", angularJSSkillLevel=" + angularJSSkillLevel
				+ ", antitrustCompetitionSkillLevel=" + antitrustCompetitionSkillLevel
				+ ", audienceAnalyticsSkillLevel=" + audienceAnalyticsSkillLevel + "]";
	}




//	//Constructor
//	public Skills Skills(boolean trueOrFalse) {
//		this.dotNet = dotNet;
//		return Skills;
//	}
	
	
	
	// Compare two skill objects
	public static int countMatchingSkillsInTwoObjects(Skills skillsToMatch, Job job) {
		int count = 0;
		if (skillsToMatch.isDotNet() && job.getSkills().isDotNet()) {
			count++;
		}
		
		if (skillsToMatch.isA_B_Testing() && job.getSkills().isA_B_Testing()) {
			count++;
		} 
		
		if (skillsToMatch.isAccountDevelopment() && job.getSkills().isAccountDevelopment()) {
			count++;
		} 
		
		if (skillsToMatch.isAccountManagementOps() && job.getSkills().isAccountManagementOps()) {
			count++;
		} 
	
		if (skillsToMatch.isAdCopy() && job.getSkills().isAdCopy()) {
			count++;
		} 
		
		if (skillsToMatch.isAdministrativeSupport() && job.getSkills().isAdministrativeSupport()) {
			count++;
		} 
		
		if (skillsToMatch.isAdobeCreativeSuite() && job.getSkills().isAdobeCreativeSuite()) {
			count++;
		} 
	
		if (skillsToMatch.isAffiliateMarketing() && job.getSkills().isAffiliateMarketing()) {
			count++;
		} 

		if (skillsToMatch.isAgileProductDevelopment() && job.getSkills().isAgileProductDevelopment()) {
			count++;
		} 

		if (skillsToMatch.isAgileProjectManagement() && job.getSkills().isAgileProjectManagement()) {
			count++;
		} 
		
		if (skillsToMatch.isAnalyticalResearch() && job.getSkills().isAnalyticalResearch()) {
			count++;
		} 
		
		if (skillsToMatch.isAndroidJava() && job.getSkills().isAndroidJava()) {
			count++;
		}
		
		if (skillsToMatch.isAngularJS() && job.getSkills().isAngularJS()) {
			count++;
		}
		
		if (skillsToMatch.isAntitrustCompetition() && job.getSkills().isAntitrustCompetition()) {
			count++;
		}

		if (skillsToMatch.isAudienceAnalytics() && job.getSkills().isAudienceAnalytics()) {
			count++;
		}
		
		return count;
	}
	
	
}
