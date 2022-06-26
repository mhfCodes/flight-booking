<h1>Flight Booking Project With Spring Boot</h1>

<p>In This Project I've Used <strong>Spring Boot</strong>, <strong>Spring Data JPA</strong>, <strong>Hibernate</strong>, <strong>Spring Security</strong> And <strong>ModelMapper</strong> To Create A Flight Booking App</p>

<h2><u>Flight Booking v1</u></h2>

<p>Signup And Login Has Been Completed. Users Have To Get Authenticated</p>
<p>Authorization Is Provided Using JWT</p>

<h4>Reuqests:</h4>

<p><strong><i>/flightBooking/signup</i></strong> ====> User Sends His Information To This Endpoint And Gets Signed Up. Response Is Newly Saved User's Id</p>
<p><strong><i>/flightBooking/login</i></strong> ====> User Has To Be Signed Up First. Response Is A JWT Token</p>

<h2><u>Flight Booking v1.2</u></h2>

<p>Made User's Email And Username Unique</p>
<p>Added A Custom Exception Named ApplicationException</p>

<h2><u>Flight Booking v1.5</u></h2>

<p>Added User Homepage</p>
<p>Added User Detail Section</p>

<h4>Reuqests:</h4>

<p><strong><i>/flightBooking/user/home</i></strong> ====> After Logging In User Will See A Welcome Page.</p>
<p><strong><i>/flightBooking/userDetails</i></strong> ====> User Can See And Fill His Information And Send It To This EndPoint.
Admins Can See All Users Information By Sending A Request To "/flightBooking/userDetails/list/grid".</p>

<hr/>
<p>P.S: This Project Gets Updated Regularly And More Features Will Be Added To It</p>