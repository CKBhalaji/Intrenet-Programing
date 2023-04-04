<?php
$servername ="localhost";
$username ="root";
$password ="";
$db="interview";
// Create connection
$conn =new mysqli($servername, $username, $password, $db);
// Check connection
if($conn->connect_error)
{
    die("Connection failed: ". $conn->connect_error);
}
else
{
    echo "Connected successfully";
}
$sql = "CREATE TABLE appointments(name varchar(20),email varchar(20),Date_and_Time varchar(20))";
if($conn->query($sql) === TRUE) 
{
    echo "Table created successfully";
}
else
{
    echo "Error creating Table: ". $conn->error;
}

?>
