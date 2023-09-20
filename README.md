# Simple Sample Selenide Tests
This is a simple login test based off this test page https://practicetestautomation.com/practice-test-login/

The tests will be updated with time based off these scenarios:

### Test case 1: Positive LogIn test
* Open page
* Type username student into Username field
* Type password Password123 into Password field
* Puch Submit button
* Verify new page URL contains practicetestautomation.com/logged-in-successfully/
* Verify new page contains expected text ('Congratulations' or 'successfully logged in')
* Verify button Log out is displayed on the new page

### Test case 2: Negative username test
* Open page
* Type username incorrectUser into Username field
* Type password Password123 into Password field
* Puch Submit button
* Verify error message is displayed
* Verify error message text is Your username is invalid!

### Test case 3: Negative password test
* Open page
* Type username student into Username field
* Type password incorrectPassword into Password field
* Puch Submit button
* Verify error message is displayed
* Verify error message text is Your password is invalid!
