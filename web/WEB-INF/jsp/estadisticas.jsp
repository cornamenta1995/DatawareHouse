<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Millenium Falcon!</title>

	<meta name="description" content="Source code generated using layoutit.com">
	<meta name="author" content="LayoutIt!">

	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<link rel="icon" type="image/png" href="img/logo.png">

       <style type="text/css">
       #mapa { height: 500px; }
    </style>
    <script type="text/javascript" src="http://maps.google.com/maps/api/js?key=AIzaSyCxA2W2FQ1ZU-cxA2NLya0bYxuilepv_gc"></script>
    <script type="text/javascript">
    function initialize() {
      var marcadores = [
        ['León', 42.603, -5.577],
        ['Salamanca', 40.963, -5.669],
        ['Zamora', 41.503, -5.744]
      ];
      var map = new google.maps.Map(document.getElementById('mapa'), {
        zoom: 7,
        center: new google.maps.LatLng(41.503, -5.744),
        mapTypeId: google.maps.MapTypeId.ROADMAP
      });
      var infowindow = new google.maps.InfoWindow();
      var marker, i;
      for (i = 0; i < marcadores.length; i++) {  
        marker = new google.maps.Marker({
          position: new google.maps.LatLng(marcadores[i][1], marcadores[i][2]),
          map: map
        });
        google.maps.event.addListener(marker, 'click', (function(marker, i) {
          return function() {
            infowindow.setContent(marcadores[i][0]);
            infowindow.open(map, marker);
          }
        })(marker, i));
      }
    }
    google.maps.event.addDomListener(window, 'load', initialize);
    </script>

</head>
<body>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="page-header">
				<h1>
					Millenium Falcon! <small> Analizadores de Datos : ${requestScope.nombreEdo}</small>
				</h1>
			</div>

			<div class="row">
				<div class="col-md-12">
					<div class="jumbotron">

						<div id="mapa"></div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="thumbnail">

								<div class="caption">
              
								</div>
							</div>
                                            </div>
						<div class="col-md-4">
							<div class="thumbnail">

								<div class="caption">

                                    <strong>M </strong><span></span>
                                    <br/>
                                    
                                   

								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="thumbnail">

								<div class="caption">

                                    <strong>Población Masculina de Alumnos : ${requestScope.alumnoH} </strong><span></span>
                                    <br/>
                                    <strong>Población Femenina de Alumnos : ${requestScope.alumnoM} </strong><span></span>
                                    <br/>
                                    <strong>Escuelas Totales : ${requestScope.total} escuelas <strong><span></span>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-md-4">
					<blockquote class="pull-right">
						<p>
							Ser el hombre más rico del cementerio no es lo que más me importa… Ir a la cama a la noche diciendo “hemos hecho algo maravilloso” es lo que realmente me preocupa.
						</p> <small>Steve Jobs</small>
					</blockquote>
				</div>
				<div class="col-md-4">
					<strong>Terminos y Condiciones</strong>
					<ul>
						<li>
							Terminos del Servicio y Condiciones
						</li>
						<li>
							Política de Privacidad
						</li>

					</ul>
				</div>
				<div class="col-md-4">

					<address>
						<strong>Millenium Falcon</strong><br> Blvd. Marcelino García Barragán 1421<br> Guadalajara, JAL, MEX 44430<br> <abbr title="Phone">Tel:</abbr> (33) 36-18-52-69
					</address>
				</div>
			</div>
		</div>
	</div>
</div>

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>

</body></html>
