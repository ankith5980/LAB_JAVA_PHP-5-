<html>
<body>
    <h2>Last visited time on the web page</h2>

    <!-- PHP SECTION -->
    <?php
    
    $intm = 60 * 60 * 24 * 60 + time();  // 60 days in seconds
    setcookie('lastVisit', date("G:i - m/d/y"), $intm);

    if (isset($_COOKIE['lastVisit'])) {
        $visit = $_COOKIE['lastVisit'];
        echo "Your last visit was - " . $visit;
    } else {
        echo "You have not visited this website before!";
    }
    ?>
</body>
</html>