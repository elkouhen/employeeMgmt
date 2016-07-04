REQUIREMENTS : 
- Install Cloud Foundry cli (depends on you OS).
- Install Image Container plugin : 
	$ cf install-plugin https://static-ice.ng.bluemix.net/ibm-containers-linux_x64
 (see https://console.ng.bluemix.net/docs/containers/container_cli_ov.html#container_cli_ov for more)

- Login to CF :
	$ cf login

	Url of api is : https://api.ng.bluemix.net 

- Login to IG :

	$ cf ic login

	Set environment variable as proposed in Option 2 :

export DOCKER_HOST=tcp://containers-api.ng.bluemix.net:8443
export DOCKER_CERT_PATH=/home/philippe/.ice/certs/containers-api.ng.bluemix.net/ed3f2219-a24d-4b9c-a70e-3ea518d25079
export DOCKER_TLS_VERIFY=1

- Copy postgres image 
	$ ./run_cpi_postgres.sh

- Build employeemgmt image to CI:
	$ cd app
	$ cf ic build -t employeemgmt/employeemgmt-app ./

- Run docker compose to create the containers
        $ docker-compose up -d
        

( Example project by IBM : https://github.com/IBM-Bluemix/bluechatter )
