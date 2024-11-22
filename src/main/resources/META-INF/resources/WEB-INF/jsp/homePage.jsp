<html>

	<head>
	
		<title>home page</title>
		
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	
		
		
		<style type="text/css">
			h1{
				font-size: 100px;
			
			}
		</style>
	
	</head>
	<body>
	
	
		<div class=" container-fluid  m-5 p-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header text-center">
                        <h2>THIS IS HOME PAGE</span></h2>
                    </div>
                    <div class="card-body">
                    
                    		<div class="mb-3">
                                <div for="username" class="fs-5 ">
									<p>welcome username: <span class="fw-bold">${username}</span>  <br>the password: <span class="fw-bold">${password} </span></p>
								</div>
                            </div>
                    	<form action="/logout" method="get">
							<input type="submit" value="Logout" class="btn btn-primary w-100">
						</form>
                    </div>
                </div>
            </div>
        </div>
    </div>
	<!-- 
		<h1>THIS IS HOME PAGE</h1>
		<p>welcome ${username}  and the password is ${password} </p>
		<p>go to <a href="/todo">todo</a></p>
		
		<form action="/logout" method="get">
			<input type="submit" value="submit">
		</form>
		
		 -->
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
		
	</body>
	

</html>