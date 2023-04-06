<?php
    $name=$_POST['fname'];
    $mail=$_POST['mail'];
    $gender=$_POST['gender'];
    $password=$_POST['password'];
    $mobileno=$_POST['number'];
    $DOB=$_POST['date'];
    $Address=$_POST['address'];
    $Location=$_POST['state'];
        if(strlen($password)>=7 && strlen($password)<=12){
            if(preg_match("/^[a-zA-Z-']*$/",$name)){
                if(($Address)){
                    if($Location!=="please select a state"){
                        if(strlen($mobileno)==10)
                        {
                            if(preg_match("/^([a-z A-Z 0-9 @+.-]+)(@[a-z A-Z 0-9 @+.-]+)(\.[a-zA-Z0-9])*$/",$mail)){
                                    echo '<script>alert("REGISTERED SUCCESSFULLY");</script>';
                            }
                            else{
                                echo '<script>alert("INVALID MAIL");</script>';
                            }
                        }
                       else {
                           echo '<script>alert("INVALID MOBILENO");</script>';
                       }
                     } 
                    else{
                        echo '<script>alert("INVALID STATE");</script>';
                    }
                }
                else{
                    echo '<script>alert("INVALID ADDRESS");</script>';
                }
            }
            else{
            echo '<script>alert("INVALID NAME");</script>';}
        }
        else{
            echo '<script>alert("INVALID PASSWORD");</script>';
        }   
?>