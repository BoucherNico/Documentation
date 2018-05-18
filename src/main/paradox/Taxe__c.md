# Taxe (Taxe__c)

Une taxe est un prélèvement obligatoire perçu d'autorité à l'occasion d'un service rendu.

## Types d'enregistrement

|Type| Description |
|--|--|
| Standard | Il n'y a pas de type de taxe autre que la TVA |

## Champs

| API Name | Etiquette | Type | Description |
|--|--|--|--|
| Id |  |  | Identifiant technique de l'enregistrement (variable selon les environnements) |
| Name | Nom de la Taxe | String(80) | Nom de la Taxe |
| Taux__c | Taux | Percent | Taux de la Taxe |

## Relations

### Objets liés aux Taxes

 - @ref [Entrée du Catalogue de Prix](PriceBookEntry.md) : **Entrees_du_catalogue_de_prix__r**

## Consultation
Voici un exemple au format JSON de la consultation d'une Taxe :

    POST
    https://crm-api-{env}.experiments.opunmaif.fr/
    {
		"attributes" : {
		    "type" : "Taxe__c",
		    "url" : "/services/data/v43.0/sobjects/Taxe__c/a086E000001tGGLQA2"
		},
		"Id" : "a086E000001tGGLQA2",
		"IsDeleted" : false,
		"Name" : "TVA : 10 %",
		"Taux__c" : 10.0
	}

## Enregistrement


<!--stackedit_data:
eyJoaXN0b3J5IjpbMTcxOTg5NTI1MCw2MDAwNDQ5OTQsNjQ2Nj
YyMDE0LC0xNTI2MzQ2NTYwLC01MjU3NzkwMCwtNDE1Nzg2NTU2
LDEzOTQwMzU4NDddfQ==
-->