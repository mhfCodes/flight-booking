<h1>Flight Booking Project With Spring Boot</h1>

<p>In This Project I've Used <strong>Spring Boot</strong>, <strong>Spring Data JPA</strong>, <strong>Hibernate</strong>, <strong>Spring Security</strong> And <strong>ModelMapper</strong> To Create A Flight Booking App</p>

<h2><u>Flight Booking v1.0</u></h2>

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
<p><strong><i>/flightBooking/userDetails/list/grid</i></strong> ====> Only Admins Can Access This Endpoint. By Sending A Request To This URL, Admins Can Get All Available Informations About All Users.</p>
<p><strong><i>/flightBooking/userDetails/save</i></strong> ====> By Sending A Request To This URL, Users Can Save And Update Their Own Information.</p>
<p><strong><i>/flightBooking/userDetails/load</i></strong> ====> By Sending A Request To This URL, Users Can View Their Own Information.</p>

<h2><u>Flight Booking v2.0</u></h2>

<p>Added Flights Section</p>

<h4>Reuqests:</h4>

<p><strong><i>/flightBooking/flights/list/grid</i></strong> ====> By Sending A Reuqest To This URL, Users Will Get A List Of All Available Flights. Also Users Can Filter Through Flights By Sending Filters.</p>
<p><strong><i>/flightBooking/flights/load/{id}</i></strong> ====> By Sending A Reuqest With A Flight's Id To This URL, Users Will Get All Data About That Specific Flight.</p>
<p><strong><i>/flightBooking/flights/save</i></strong> ====> Only Admins Can Access This Endpoint. By Sending A Reuqest With A Flight's Information To This URL, Admins Can Add New Flights And Update Available Flights.</p>
<p><strong><i>/flightBooking/flights/delete/{id}</i></strong> ====> Only Admins Can Access This Endpoint. By Sending A Reuqest With A Flight's Id To This URL, Admins Can Delete A Specific Flight.</p>


<hr/>
<p>P.S: This Project Gets Updated Regularly And More Features Will Be Added To It</p>