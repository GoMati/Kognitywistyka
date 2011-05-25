package pl.edu.uj.kognitywistyka.user.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import pl.edu.uj.kognitywistyka.user.bo.RegistrationBo;
import pl.edu.uj.kognitywistyka.user.model.Businessman;
import pl.edu.uj.kognitywistyka.user.model.Scientist;

@ManagedBean
@RequestScoped
public class Registration implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7905519852872735487L;
	
	private String role;
	private String firstName;
	private String lastName;
	private String city;
	private String company;
	private String description;
	private String position;
	private String region;
	private String[] companyCategory;
	private String password;
	private String passConfirm;
	
	@ManagedProperty(name = "registrationBo", value = "#{registrationBo}")
	RegistrationBo registrationBo;

	public void setRegistrationBo(RegistrationBo registrationBo) {
		this.registrationBo = registrationBo;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassConfirm(String passConfirm) {
		this.passConfirm = passConfirm;
	}

	public String getPassConfirm() {
		return passConfirm;
	}
	
	public String[] getCompanyCategory()
	{
		return companyCategory;
	}
	
	public void setCompanyCategory(String[] companyCategory)
	{
		this.companyCategory = companyCategory;
	}
	
	public void register()
	{
		if(role == "Businessman")
		{
			Businessman registered = new Businessman();
			registered.setFirstName(firstName);
			registered.setLastName(lastName);
			registered.setRegion(region);
			registered.setCompany(company);
			registered.setCompanyCategory(companyCategory);
			
			if(password == passConfirm)
			{
				registered.setPass(password);
			}
			registrationBo.register(registered);
		}
		if(role == "Scientist")
		{
			Scientist registered = new Scientist();
			registered.setFirstName(firstName);
			registered.setLastName(lastName);
			registered.setRegion(region);
			registered.setUniversity(company);
			registered.setTitle(position);
			
			if(password == passConfirm)
			{
				registered.setPass(password);
			}
			registrationBo.register(registered);
			
		}
		resetView();
	}
	
	private void resetView() {
		setDescription("");
		setFirstName("");
		setLastName("");
		setRegion("");
		setCompany("");
		setCompanyCategory(null);
		
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

}
