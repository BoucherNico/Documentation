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
| [x] 

## Relations

### Objets liés aux Taxes

 - @ref:[Entrée du Catalogue de Prix](PriceBookEntry.md) : **Entrees_du_catalogue_de_prix__r**

## Consultation
Voici un exemple au format JSON de la consultation d'une Taxe :

    GET
    /services/data/v43.0/sobjects/Taxe__c/a086E000001tGGLQA2
    
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

Voici un exemple au format JSON de la création d'une Taxe :

	POST
	/services/data/v43.0/sobjects/Taxe__c/
	
	{
		"Name" : "TVA : 1,1 %",
		"Taux__c" : 1.10
	}
<!--stackedit_data:
eyJoaXN0b3J5IjpbMTI1NjIzODUyMiwtMTY3MzY1NTg1NiwtNT
U0OTk1NTk3LDk1ODUxNzExMCwxODk1NzMxMjA1LC00NzQzNTkw
NTIsMTYxNTk0ODcxNCwtNjEwMDMyNTQ0LDYxNTQwNDA1NCw2MD
AwNDQ5OTQsNjQ2NjYyMDE0LC0xNTI2MzQ2NTYwLC00MTU3ODY1
NTYsMTM5NDAzNTg0N119
-->