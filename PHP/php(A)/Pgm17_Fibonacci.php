<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fibonacci Series Printer</title>
</head>
<body>
    <form method="POST" action="" target="">
        <label for="Enter the Limit ::">Enter the Limit ::</label>
        <input type="number" name="limit" id="num">
        <input type="submit" name="Submit">
    </form>
</body>
</html>


<!-- PHP Section -->
<?php 

    if($_POST){ // Check if the method in the form is POST

        $limit = $_POST["limit"]; // Enter the limit to which the series is to be displayed
        
        if($limit != 0){ //Do the following code if the limit entered isn't 0
            $fib1 = 0; // Assign fib1 as 0
            $fib2 = 1; // Assign fib2 as 1
            $fib3 = $fib1 + $fib2; //Assign the sum of fib1 and fib2 as fib3

            echo "$fib1"; //print the first number in series as a default member
            echo "$fib2"; //print the second number in the series also as a default number

            for($i=0 ; $i<=($limit-3) ; $i++){ // Calculate the subsequent numbers in the series until the condition returns false
                $fib3 = $fib1 + $fib2;
                $fib1 = $fib2;
                $fib2 = $fib3;

                echo "$fib3"; // At the end of every iteration print the sum of the previous two number as the third number.
            }
        }

    }

?>