<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <style>
        #map {
            height: 400px;
            width: 100%;
        }
    </style>
</head>
<body>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="page-header">
				<h1>
					Millenium Falcon! <small> Analizadores de Datos : Modo  ${requestScope.usuario.tipoUsuario.tipo} </small>
				</h1>
			</div>

			<div class="row">
				<div class="col-md-12">
					<div class="jumbotron">

						<div id="map"></div>
						<script>
                            function initMap() {
                                var uluru = {lat: 19.419444, lng:  -99.145556};
                                var map = new google.maps.Map(document.getElementById('map'), {
                                    zoom: 4,
                                    center: uluru
                                });
                                var marker = new google.maps.Marker({
                                    position: uluru,
                                    map: map
                                });
                            }
						</script>
						<script async defer
								src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC8i7QyjhbBuSk4Zl9AdxNsyvVCwa09ZeA&callback=initMap">
						</script>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="thumbnail">

								<div class="caption">
                                <form action="estadistica.htm" method="post">
                                    <strong>Elige un estado: </strong>
                                    <br/><br/>
                                    <select id="edo" name="edo">
                                       <c:forEach var="edo" items="${requestScope.listaEstado}">
                                            <option value="${edo.idEntidad}">${edo.entidad}</option>
                                       </c:forEach>
                                   </select>
                                    <button type="submit" class="btn btn-default">
							Mostrar Estadisticas
                                    </button><br/><br/>
                                </form>
								</div>
							</div>
                                            </div>
						<div class="col-md-4">
							<div class="thumbnail">

								<div class="caption">

                                    <strong>Margen de error: 3% </strong><span></span>
                                    <br/>
                                    <strong>Intervalo de Confianza: 95% </strong><span></span>
                                    <br/>
                                    <strong>Probabilidad de Fracaso: 50%   </strong><span></span>
                                    <br/>
                                    <strong>Probabilidad de Éxito: 50%  </strong><span></span>
                                    <br/>
                                    <strong>Tamaño de la Muestra: ${requestScope.muestra} <strong><span></span>

								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="thumbnail">

								<div class="caption">

                                    <strong>Población Masculina : ${requestScope.hombres} </strong><span></span>
                                    <br/>
                                    <strong>Población Femenina : ${requestScope.mujeres} </strong><span></span>
                                    <br/>
                                    <strong>Escuelas Totales : ${requestScope.cuentaEscuela} escuelas <strong><span></span>

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