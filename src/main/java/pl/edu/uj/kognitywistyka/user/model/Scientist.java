package pl.edu.uj.kognitywistyka.user.model;

public class Scientist {
	
	private long userId;
	private String firstName;
	private String lastName;
	private String university;
	private String description;
	private String title;
	private String state;
	private String companyCategory;
	private String pass;
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getCompanyCategory()
	{
		return companyCategory;
	}
	
	void setCompanyCategory(String companyCategory)
	{
		this.companyCategory = companyCategory;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}
}
