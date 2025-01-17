
          // LOGIN AND SINGUP (REGISTER ACCOUNT) JS || RUKSHAN E A Y

const container = document.getElementById('container');
const registerBtn = document.getElementById('sign-up');
const loginBtn = document.getElementById('log-in');

registerBtn.addEventListener('click', () => {
    container.classList.add("active");
});

loginBtn.addEventListener('click', () => {
    container.classList.remove("active");
});

// Get the Sign-up form and password fields
const signUpForm = document.getElementById('sign-up-Form');
const passwordField = signUpForm.querySelector('input[placeholder="Password"]');
const confirmPasswordField = signUpForm.querySelector('input[placeholder="Re-enter Password"]');

// Add event listener for form submission
signUpForm.addEventListener('submit', function (event) {
    // Check if passwords match
    if (passwordField.value !== confirmPasswordField.value) {
        // If they don't match, prevent form submission and show an alert
        event.preventDefault();
        alert('Passwords do not match. Please re-enter the same password.');
    }
    else{
        alert("Password Match.SignUp Successful !!!");
    }
    return true;
});