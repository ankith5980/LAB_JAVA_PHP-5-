<html>
<head>
    <title>Biodata Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            line-height: 1.6;
            text-align: center;
        }
        label {
            display: block;
            margin: 10px 0 5px;
            text-align: left; 
        }
        input, textarea, select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            margin-left: auto;
            margin-right: auto;
        }
        input[type="submit"] {
            width: auto;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            padding: 10px 20px;
            border-radius: 5px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .form-container {
            max-width: 600px;
            margin: 0 auto;
            text-align: left;
        }
        .submit-container {
            text-align: center; 
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h1>Personal Biodata Form</h1>
    <div class="form-container">
        <form method="POST" action="Pgm18_DispBio.php">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required>

            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required>

            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
            <label for="education">Educational Qualification:</label>
            <input type="text" id="education" name="education" required>

            <label for="father_name">Father's Name:</label>
            <input type="text" id="father_name" name="father_name" required>

            <label for="address">Address:</label>
            <textarea id="address" name="address" rows="3" required></textarea>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="phone">Phone Number:</label>
            <input type="tel" id="phone" name="phone" pattern="^\d{10}$" required placeholder="e.g., 1234567890">

            <label for="nationality">Nationality:</label>
            <input type="text" id="nationality" name="nationality" required>

            <label for="marital_status">Marital Status:</label>
            <select id="marital_status" name="marital_status" required>
                <option value="Single">Single</option>
                <option value="Married">Married</option>
                <option value="Divorced">Divorced</option>
                <option value="Widowed">Widowed</option>
            </select>

            <label for="hobbies">Hobbies:</label>
            <textarea id="hobbies" name="hobbies" rows="3"></textarea>

            <div class="submit-container">
                <input type="submit" value="Submit">
            </div>
        </form>
    </div>
</body>
</html>