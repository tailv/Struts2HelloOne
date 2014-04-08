package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import com.opensymphony.xwork2.validator.annotations.*;

@Results({ @Result(name = "success", location = "/WEB-INF/jsp/success.jsp"),
		@Result(name = "input", location = "/index.jsp")

})
public class EmployeeAction extends ActionSupport {
	private String name;
	private int age;

	@Action(value = "/empinfo")
	public String execute() {
		return SUCCESS;
	}

	@RequiredStringValidator(message = "Nhap vao")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@IntRangeFieldValidator(message = "Age must be in between 28 and 65", min = "29", max = "65")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
