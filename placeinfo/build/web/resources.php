<!DOCTYPE html>
<html>
<title>Guide</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <style>
  body {font-family: "Lato", sans-serif}
  .mySlides {display: none}
  </style>
  <body>

<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-black w3-card w3-padding-large">

    <div class="w3-display-left w3-small" style="padding:16px 16px">
    	<a href="index.html" class="w3-bar-item w3-padding-large"><img src="./images/logo.png" style="width:170px"></a>
    </div>
    <div class="w3-display-middle w3-large">
    	<a href="index.html" class="w3-bar-item w3-padding-large"><b>PlaceInfo</b></a>
    </div>
    <div class="w3-right w3-large">
      <a href="about.html" class="w3-bar-item w3-button">About</a>
      <a href="resources.php" class="w3-bar-item w3-button">Resources</a>
      <a href="companies.jsp" class="w3-bar-item w3-button">Companies</a>
      <a href="signin.html" class="w3-bar-item w3-button">Sign-in</a>
    </div>
  </div>
</div>

<!-----Resource Section------------>
<div class="w3-black" id="resource">
<div class="w3-container w3-content w3-padding-64" style="max-width:800px">
<div class="w3-row-padding w3-padding-32" style="margin:0 -16px">
	<?php
		$conn=mysqli_connect("localhost","root","123456","BookTickz");
		// Check connection
		if (mysqli_connect_errno())
		{
			echo "Failed to connect to MySQL: " . mysqli_connect_error();
		}

	?>

    <div class="w3-third w3-margin-bottom">
          <div class="w3-container w3-white">
          </div>
    </div>
</div>
</div>
</div>


</body>
</html>
