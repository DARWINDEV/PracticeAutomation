<h1>AUTOMATION EXERCISE</h1>

![image](https://github.com/user-attachments/assets/aee72345-f9bc-44ef-b6e4-828a4f16a215)
![image](https://github.com/user-attachments/assets/f52b6205-9919-4579-a4b7-656c3556c9f1)

<a href="https://automationexercise.com/"> Ingresa a la pagina <a/>

<h3>OBJETIVO 🎯</h3>
<br/>
<p>Realizar el testing de este portal a utilizando buenas prácticas de automatización</p>
<br/>
<h3>TECNOLOGIAS Y ESQUEMA DE TRABAJO ⚒️</h3>
<ul>
  <li>Maven</li>
  <li>Selenium</li>
  <li>Java</li>
  <li>POM</li>
  <li>TestNG</li>
</ul>
<hr/>
<h3>TEST CASES</h3>
<h4>Test Case 1: Register User</h4>
<ol>
  <li>Launch browser</li>
  <li>Navigate to url 'http://automationexercise.com'</li>
  <li>Click on 'Signup / Login' button</li>
  <li>Verify 'New User Signup!' is visible</li>
  <li>Enter name and email address</li>
  <li>Click 'Signup' button<li>
  <li>Verify that 'ENTER ACCOUNT INFORMATION' is visible</li>
  <li>Fill details: Title, Name, Email, Password, Date of birth</li>
  <li>Select checkbox 'Sign up for our newsletter!'</li>
  <li>Select checkbox 'Receive special offers from our partners!'</li>
  <li>Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number</li>
  <li>Click 'Create Account button'</li>
  <li>Verify that 'ACCOUNT CREATED!' is visible</li>
  <li>Click 'Continue' button</li>
  <li>Verify that 'Logged in as username' is visible</li> 
  <li>Click 'Delete Account' button</li>
  <li>Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button</li>
</ol>
<hr/>
<h4>Test Case 2: Login User with correct email and password</h4>
<ol>
  <li>Launch browser</li>
  <li>Navigate to url <a href="http://automationexercise.com">Click here</a></li>
  <li>Click on 'Signup / Login' button</li>
  <li>Verify 'Login to your account' is visible</li>
  <li>Enter correct email address and password</li>
  <li>Click 'login' button</li>
  <li>Verify that 'Logged in as username' is visible</li>
  <li>Click 'Delete Account' button</li>
  <li>Verify that 'ACCOUNT DELETED!' is visible</li>
</ol>
<hr/>
<h4>Test Case 3: Login User with incorrect email and password</h4>
<ol>
  <li>Launch browser</li>
  <li>Navigate to url <a href="http://automationexercise.com">Click here</a></li>
  <li>Click on 'Signup / Login' button</li>
  <li>Verify 'Login to your account' is visible</li>
  <li>Enter incorrect email address and password</li>
  <li>Click 'login' button</li>
  <li>Verify error 'Your email or password is incorrect!' is visible</li>
</ol>
<hr/>
<h4>Test Case 4: Logout User</h4>
<ol>
  <li>Launch browser</li>
  <li>Navigate to url <a href="http://automationexercise.com">Click here</a></li>
  <li>Click on 'Signup / Login' button</li>
  <li>Verify 'Login to your account' is visible</li>
  <li>Enter correct email address and password</li>
  <li>Click 'login' button</li>
  <li>Verify that 'Logged in as username' is visible</li>
  <li>Click 'Logout' button</li>
  <li>Verify that user is navigated to login page</li>
</ol>
<hr/>
<h4>Test Case 5: Register User with existing email</h4>
<ol>
  <li>Launch browser</li>
  <li>Navigate to url <a href="http://automationexercise.com">Click here</a></li>
  <li>Click on 'Signup / Login' button</li>
  <li>Verify 'New User Signup!' is visible</li>
  <li>Enter name and already registered email address</li>
  <li>Click 'Signup' button</li>
  <li>Verify error 'Email Address already exist!' is visible</li>
</ol>
<hr/>
<h4>Test Case 6: Contact Us Form</h4>
<ol>
  <li>Launch browser</li>
  <li>Navigate to url <a href="http://automationexercise.com">Click here</a></li>
  <li>Click on 'Contact Us' button</li>
  <li>Verify 'GET IN TOUCH' is visible</li>
  <li>Enter name, email, subject and message</li>
  <li>Upload file</li>
  <li>Click 'Submit' button</li>
  <li>Click OK button</li>
  <li>Verify success message 'Success! Your details have been submitted successfully.' is visible</li>
  <li>Click 'Home' button and verify that landed to home page successfully</li>
</ol>
<hr/>
<h4>Test Case 7: Verify All Products and product detail page</h4>
<ol>
  <li>Launch browser</li>
  <li>Navigate to url <a href="http://automationexercise.com">Click here</a></li>
  <li>Click on 'Products' button</li>
  <li>Verify user is navigated to ALL PRODUCTS page successfully</li>
  <li>The products list is visible</li>
  <li>Click on 'View Product' of first product</li>
  <li>User is landed to product detail page</li>
  <li>Verify that detail detail is visible: product name, category, price, availability, condition, brand</li>
</ol>
<hr/>


