<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./assets/css/bootstrap.min.css">
<link rel="stylesheet" href="./assets/css/bootstrap-theme.min.css">
</head>
<body>
	<div class="row">
		<div class="container">
			<h3>Welcome to Delete Products</h3>

			<form action="deleteProduct" method="post">
				<div class="col-6">

					<div class="form-group">
						<label for="p_name">Product Name</label> <input type="text"
							id="p_name" name="p_name" placeholder="Product Name"
							class="form-control">
					</div>

					<div>
						<input type="submit" value="Save" class="btn">
					</div>
				</div>
			</form>

		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/assets/js/bootstrap.min.js"></script>
</body>
</html>