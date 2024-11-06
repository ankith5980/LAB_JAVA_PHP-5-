<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BioData Reader</title>
</head>
<body>
    <form method="POST" action="" target="">
        <table>
            <tr>
                <td>
                    <label for="First Name :: ">First Name :: </label>
                </td>
                <td>
                    <input type="text" name="First" placeholder="Enter your first name here !" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="Second Name">Second name :: </label>
                </td>
                <td>
                    <input type="text" name="Second" placeholder="Enter your second name here !" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="Contact Info :: ">Contact Info :: </label>
                </td>
                <td>
                    <input type="number" name="Contact" placeholder="Mobile Number" maxlength="10" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="Address ::">Address :: </label>
                </td>
                <td>
                    <textarea name="Address" id="Add" rows="5" cols="10" required></textarea>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="Major Skill :: ">Major Skill :: </label>
                </td>
                <td>
                    <input type="text" id="skill" name="skill" size="20" required> 
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" name="Submit"> 
                </td>
            </tr>
        </table>
    </form>
</body>
</html>

<!-- PHP Section -->
<?php 

    if($_POST){

        $fname = $_POST["First"];
        $sname = $POST["Second"];
        $fullname = print "$fname " + " " + "$sname";
        $contact = $_POST["Contact"];
        $address = $_POST["Address"];
        $majorskill = $_POST["skill"];

        if($name!=NULL && $contact!= NULL&& $address!=NULL && $majorskill!=NULL){

            echo "$fullname";
            echo "$contact";
            echo "$address";
            echo "$majorskill";

        }
        
    }

?>