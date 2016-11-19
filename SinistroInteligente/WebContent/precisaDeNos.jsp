<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Sinistro inteligente</title>
<link rel="stylesheet" href="css/style.css">
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic,600,600italic,700,700italic,800,800italic'	rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'	rel='stylesheet' type='text/css'>
<link href='http://api.tiles.mapbox.com/mapbox.js/v1.4.0/mapbox.css' rel='stylesheet' />
<!--[if lte IE 8]>
	<link href='http://api.tiles.mapbox.com/mapbox.js/v1.4.0/mapbox.ie.css' rel='stylesheet'>
<![endif]-->
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"	content="File Upload widget Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
</head>
<body>
	<h1>SINISTRO INTELIGENTE</h1>
	<div class="agile-its">
		<h2>PRECISA DE NÓS???</h2>
		<div class="w3layouts">
			<strong>Informe sua necessidades!</strong>
			<hr>
			<br>
			<form method="post" action="PrecisaDeNos">
				<input type="hidden" name="action" value="escolher"> <input
					type="checkbox" name="reboque" value="1" /> REBOQUE <br />
				<br> <input type="checkbox" name="taxi" value="1" /> TAXI <br />
				<br> <input type="checkbox" name="ambulancia" value="1" />
				AMBULÂNCIA <br />
				<br />
				<%
					if ((boolean) request.getAttribute("aceitaBo") == true) {
						out.write("<input type='checkbox' name='bo' value='1' />Boletim de Ocorrência<br /><br />");
					}
				%>

				Endereço: <input type="text" name="enderecoSinistro" value="">
				<div id='map' class="button"></div>
				<script>
					
				// Set default location in case the IP doesn't have one
				  var lat = 40.8;
				  var lon = -96.67;
				
				  $.getJSON('http://freegeoip.net/json/', function(json) {
					    if (json) {
					      lat = json.latitude;
					      lon = json.longitude;
					    }
				  
					
					mapboxgl.accessToken = 'pk.eyJ1IjoibGNlc2NyaXZhbmkiLCJhIjoiY2l2cGE0aDB0MDFtOTJ0cXJsMG53bWx5ZCJ9.cpx-5PV4tNQTe3jlHwIQAw';
					var map = new mapboxgl.Map({
						container : 'map',
						style : 'mapbox://styles/mapbox/satellite-streets-v10',
						zoom : 25
					}).setView([lat, lon], 15);;
					
					var marker = L.marker(new L.LatLng(lat, lon), {
				        icon: L.icon({
				          iconUrl: "http://farm6.staticflickr.com/5519/10708548293_e38037720a_o.png",
				          iconSize: [32, 32],
				          iconAnchor: [64, 64],
				          popupAnchor: [0, -64],
				          className: "dot"
				        }),
				        draggable: true
				    });
				    marker.bindPopup('Am I off the map? Drag me to the right spot!');
				    marker.addTo(map);
				  });
				</script>

				<input type="submit">Prosseguir</input>
			</form>
		</div>
	</div>
	<div class="footer">
		<p>
			© 2016 Provider-it - Provider-it.com <a> All rights reserved.</a>
		</p>
	</div>

	<script type="text/javascript" src="js/jquery.min.js"></script>

</body>
</html>