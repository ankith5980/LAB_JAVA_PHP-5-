<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Armstrong Number Checker</title>
</head>
<body align="center">
    <h1><b><u>Armstrong Number Checker</u></b></h1>
    <form method="POST" action="" target="">
        <label for="Enter Number">Enter Number</label>
        <input type="number" id="num" name="number">
        <input type="submit" name="Submit">
    </form>
</body>
</html>


<!-- PHP Section -->
<?php 

    if($_POST){ //Check is the method is POST in the HTML form, if it is, then execute the below conditions.
        $number = $_POST["number"];
        $temp = $number;
        $sum = 0;
        while($temp!=0){ //Check if the number is an Armstrong number
            $rem = $temp%10;
            $sum = $sum + ($rem*$rem*$rem);
            $temp = $temp/10;
        }
        
        if($temp = $sum){ //If the condtion is true, print that it is an Armstrong number
            echo "Yes $number is an Armstrong number";
        }

        else{ //If the condition is false, print that it is not an Armstrong number
            echo "No $number is not an Armstrong Number";
        }
    }

?>