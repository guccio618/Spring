<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

	<head>
		<title>Student Registration Form</title>
	</head>

	<body>

		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
			
			<br><br>
			
			Last Name: <form:input path="lastName" />
			
			<br><br>
			
			Country:
			<form:select path="country">
				<!-- Spring will call student.getCountryOptions() -->
				<%-- <form:options items="${student.countryOptions}" /> --%>
				
				<form:options items="${theCountryOptions}" /> 
				
				<%-- <form:option value="USA" label="USA" />
				<form:option value="France" label="France" />
				<form:option value="Germany" label="Germany" />
				<form:option value="India" label="India" />
				<form:option value="China" label="China" /> --%>
			</form:select>
			
			<br><br>
				
				Favorite Language:
				<form:radiobuttons path="favoriateLanguage" items="${student.favoriateLanguageOptions}" />
					
			<br><br>
			
				Operating Systems:
				Linux <form:checkbox path="operatingSystems" value="Linux"/>
				Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
				MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
			
			<br><br>
			
			<input type="submit" value="Submit" />
		</form:form>
	
	</body>


</html>