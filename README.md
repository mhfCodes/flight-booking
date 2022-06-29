<h1>Flight Booking Project With Spring Boot</h1>

<p><strong>Live Version Of The Application Is Available At <a href="https://mhf-flight-booking.herokuapp.com">Here</a></strong></p>

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

<h2><u>Flight Booking v2.5</u></h2>

<p>Added Bookings Section</p>

<h4>Reuqests:</h4>

<p><strong><i>/flightBooking/bookings/list/grid</i></strong> ====> By Sending A Reuqest To This URL, Users Will Get A List Of All Bookings That Belong To Them And Admins Will Get A List Of All Users Bookings. Also Users Can Filter Through Bookings By Sending Filters.</p>
<p><strong><i>/flightBooking/bookings/load/{id}</i></strong> ====> By Sending A Reuqest With A Bookings's Id To This URL, Users Will Get All Data About That Specific Booking.</p>
<p><strong><i>/flightBooking/bookings/save</i></strong> ====> By Sending A Reuqest With A Bookings's Information To This URL, Users Can Add New Bookings And Update Available Bookings.</p>
<p><strong><i>/flightBooking/bookings/delete/{id}</i></strong> ====> By Sending A Reuqest With A Bookings's Id To This URL, Users Can Delete A Specific Booking.</p>

<h2><u>Flight Booking v3.0</u></h2>

<p>Added Companions Section</p>

<h4>Reuqests:</h4>

<p><strong><i>/flightBooking/bookings/companions/list/grid</i></strong> ====> By Sending A Reuqest To This URL, Users Will Get A List Of All Companions Of A Specific Booking That Belongs To Them And Admins Will Get A List Of All Users Companions. Also Users Can Filter Through Companions By Sending Filters.</p>
<p><strong><i>/flightBooking/bookings/companions/load/{bookingId}/{id}</i></strong> ====> By Sending A Reuqest With A Bookings's Id And A Companion's Id To This URL, Users Will Get All Data About That Specific Companion.</p>
<p><strong><i>/flightBooking/bookings/companions/save</i></strong> ====> By Sending A Reuqest With A Companion's Information To This URL, Users Can Add New Companions And Update Available Companions.</p>
<p><strong><i>/flightBooking/bookings/companions/saveAll</i></strong> ====> By Sending A Reuqest With A List Of Companions Informations To This URL, Users Can Add New Companions And Update Available Companions Grouply.</p>
<p><strong><i>/flightBooking/bookings/companions/delete/{bookingId}/{id}</i></strong> ====> By Sending A Reuqest With A Bookings's Id And A Companion's Id To This URL, Users Can Delete A Specific Companion.</p>
<p><strong><i>/flightBooking/bookings/companions/deleteAll/{bookingId}</i></strong> ====> By Sending A Reuqest With A Bookings's Id To This URL, Users Can Delete All Companions Associated With That Specific Booking.</p>

<h2><u>Flight Booking v3.1</u></h2>

<p>Added Index Page</p>

<hr/>
<p>P.S: This Project Gets Updated Regularly And More Features Will Be Added To It</p>