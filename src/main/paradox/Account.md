# Compte (Account)

Un compte est une personne, physique ou morale, en relation avec la plateforme de service.

## Types d'enregistrement

|Type| Description |
|--|--|
| Partenaire | Partenaires producteurs de services |
| Compte personnel | Personnes physiques clientes de la PFS |
| Compte personnel Digiteam | Personnes physiques créées par la Digiteam |

## Champs

| API Name | Etiquette | Type | Description |
|--|--|--|--|
| Id |  |  | Identifiant technique de l'enregistrement (variable selon les environnements) |
| Name | Nom du compte | String(80) | Nom de la Taxe |

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
eyJoaXN0b3J5IjpbLTE4OTMyODY1ODNdfQ==
-->