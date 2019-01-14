# starwarsapi
#Uma API simples contendo alguns dados dos planetas do universo Star Wars, utilizando Java Spring Boot.

#Esta API foi criada, utilizando Java Spring Boot, IDE Netbeans v.8.2, banco de dados MYSQL e SO Linux Xubuntu 18.4.
#
#URL's:
#
#Metodo GET: 
#	     "/planet" lista tods os planetas presentes na lisa.
#            "/planet/id/{id}" lista um planeta da lista pelo seu id.
#            "/planet/name/{name} lista um planeta pelo seu nome.
#
Metodo Post: 
#	      "/planet" adiciona um planet a lista.
 #            "/planet/saves" adiciona varios planetas a lista.
 #
#Metodo DELETE:
#               "/planet" apaga um planeta da lista.
#              "/planet/id/{id}" apaga um planeta da lista pelo id.
#
              
#Lista de planetas no formato JSon:


[
		{
			"name": "Alderaan",
			"climate": "temperate",
			 "terrain": "grasslands, mountains"
		},
		{
			"name": "Yavin IV",
			"climate": "temperate, tropical",
			 "terrain": "jungle, rainforests"
		},
		{
			"name": "Hoth",
			"climate": "frozen",
			"terrain": "tundra, ice caves, mountain ranges"
		},
		{
			"name": "Dagobah",
			"climate": "murky",
			"terrain": "swamp, jungles"
		},
		{
			"name": "Bespin",
			"climate": "temperate",
			"terrain": "gas giant"
		},
		{
			"name": "Endor",
			"climate": "temperate",
			"terrain": "forests, mountains, lakes"
		},
		{
			"name": "Naboo",
			"climate": "temperate",
			"terrain": "grassy hills, swamps, forests, mountains"
		},
		{
			"name": "Coruscant",
			"climate": "temperate",
			"terrain": "cityscape, mountains"
		},
		{
			"name": "Kamino",
			"climate": "temperate",
			"terrain": "ocean"
		},
		{
			"name": "Geonosis",
			"climate": "temperate, arid",
			"terrain": "rock, desert, mountain, barren"
		
		}
		]
