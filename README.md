# user-service

go to the folder through terminal, inside that excecute below commands

Create Image
================================
--> docker build -t user-profile:v1 .

run docker-compose file
================================
--> docker-compose up

check network
===============================
--> docker network ls

sample output of above command

c7d0a9fae034        product_default    bridge              local
1f2f79f7dd87        {xyz}_user-profile   bridge              local

check service ip
==========================
copy the user-profile network name from the above command and execute below command using copied name

--> docker network inspect {network_name}

sample output of above command

"Containers": {
            "3428cee389415c89f8a2cb6e456a049d6d622af49df91b1c1d83e5a67e839ff9": {
                "Name": "user-service",
                "EndpointID": "cbf8831fcbbbf078dd52aba6630c7093aec8909d992c447048d9765422d30d22",
                "MacAddress": "02:42:ac:13:00:03",
                "IPv4Address": "172.19.0.3/16",
                "IPv6Address": ""
            },
            "d6b80bf002ee9ba4599a3f592c6ed413c7f2980eea2aafa61ab64a36dfee8810": {
                "Name": "mysql",
                "EndpointID": "fc51ac5bbdb2ef3950f28041052f4842df54640f1290d07b10d7710014fb8756",
                "MacAddress": "02:42:ac:13:00:02",
                "IPv4Address": "172.19.0.2/16",
                "IPv6Address": ""
            }
        }
     
 access service swagger 
 =========================
 
 copy the IPv4Address of user-service and using that ip execute
 
 http://{ip}:8080/swagger-ui.html
        






