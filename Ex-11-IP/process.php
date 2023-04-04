<?php
// Connect to the database
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "interview";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Get the form data
$name = $_POST['name'];
$email = $_POST['email'];
$datetime = $_POST['datetime'];

// Validate the form data
if(empty($name) || empty($email) || empty($datetime)){
    die("Please fill all fields");
}

if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
    die("Invalid email format");
}

// Insert the data into the appointments table
$sql = "INSERT INTO appointments (name, email, date_and_time) VALUES ('$name', '$email', '$datetime')";

if ($conn->query($sql) === TRUE) {
    echo "New appointment created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

// Close the database connection
$conn->close();
?>
